package sumatoria

import checkSpace
import checkTime

fun testSameFunctionality (){
    val n = 10

    println("Sumatoria tradicional para $n = ${traditionalSummation(n)}")
    println("Sumatoria optimizada para $n = ${optimizedSummation(n)}")
    println()
}

fun testTime(n: Int) {
    val time1 = checkTime(n, ::traditionalSummation)
    val time2 = checkTime(n, ::optimizedSummation)

    println("Método tradicional")
    outputTime(n, time1)

    println("Método optimizado")
    outputTime(n, time2)

    println()
}

fun testSpace(n: Int){
    val space1 = checkSpace(n, ::traditionalSummation)
    val space2 = checkSpace(n, ::optimizedSummation)

    println("Método tradicional")
    outputSpace(n, space1)
    println("Método optimizado")
    outputSpace(n, space2)

    println()
}

fun outputTime(n: Int, formatedTime: String) {
    println("Tiempo de ejecución para n = $n: $formatedTime ms")
}

fun outputSpace(n: Int, formatedSpace: String) {
    println("Espacio de memoria para n = $n: $formatedSpace KB")
}

