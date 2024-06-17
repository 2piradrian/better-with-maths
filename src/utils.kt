import java.text.DecimalFormat

fun <T> checkTime(n: T, function: (T) -> Unit): String {
    val start = System.nanoTime()
    function(n)
    val end = System.nanoTime()

    val time = (end - start) / 1_000_000.0

    return formatMillis(time)
}

fun <T> checkSpace(n: T, function: (T) -> Unit): String {
    val runtime = Runtime.getRuntime()
    runtime.gc()

    val startMemory = runtime.totalMemory() - runtime.freeMemory()
    function(n)
    val endMemory = runtime.totalMemory() - runtime.freeMemory()

    val memoryUsage = (endMemory - startMemory) / 1024.0
    return formatMemory(memoryUsage)
}

fun formatMillis(timeMillis: Double): String {
    val formatter = DecimalFormat("####.#######")
    return formatter.format(timeMillis)
}

fun formatMemory(memoryKb: Double): String {
    val formatter = DecimalFormat("######.##")
    return formatter.format(memoryKb)
}