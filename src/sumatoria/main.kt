package sumatoria

import checkSpace
import checkTime

fun main(){
    println()

    // Demostración para n, siendo n la cantidad de números seguidos a sumar
    println(" --- Test de funcionalidad ---")
    testThat()

    // Test de tiempo para n grandes y n pequeños
    println(" --- Test de tiempo ---")
    testTime(10)
    testTime(10000000)

    // Test de espacio para n grandes y n pequeños
    println(" --- Test de espacio ---")
    testSpace(10)
    testSpace(10000000)
}

fun sumNumbers(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    return sum

    /*
        Sintaxis equivalente en C++

        int sum = 0;
        for (int i = 1; i <= n; ++i) {
            sum += i;
        }
        return sum;

    * */
}

fun optimizedSumNumbers(n: Int): Int {
    return n * (n + 1) / 2
}

fun testThat (){
    val n = 10

    println("Sumatoria tradicional para $n = ${sumNumbers(n)}")
    println("Sumatoria optimizada para $n = ${optimizedSumNumbers(n)}")
    println()
}

fun testTime(n: Int) {
    val time1 = checkTime(n, ::sumNumbers)
    val time2 = checkTime(n, ::optimizedSumNumbers)

    println("Método tradicional")
    outputTime(n, time1)

    println("Método optimizado")
    outputTime(n, time2)

    println()
}

fun testSpace(n: Int){
    val space1 = checkSpace(n, ::sumNumbers)
    val space2 = checkSpace(n, ::optimizedSumNumbers)

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


