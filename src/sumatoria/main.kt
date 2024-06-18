package sumatoria

fun main(){
    println()

    // Demostración para n, siendo n la cantidad de números seguidos a sumar
    println(" --- Test de funcionalidad ---")
    testSameFunctionality()

    // Test de tiempo para n grandes y n pequeños
    println(" --- Test de tiempo ---")
    testTime(10)
    testTime(10000000)

    // Test de espacio para n grandes y n pequeños
    println(" --- Test de espacio ---")
    testSpace(10)
    testSpace(10000000)
}

// Método tradicional. (Bucle for)
fun traditionalSummation(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum
}

// Método optimizado. (Sumatoria de Gauss)
fun optimizedSummation(n: Int): Int {
    return n * (n + 1) / 2
}


