package sumatoria

fun main () {
    example1()
    example2()
}

/*
Ejemplo 1.
En una empresa, se quiere calcular la bonificación acumulada que recibe un empleado a lo largo de varios años.
Si cada año la bonificación aumenta en una cantidad fija (por ejemplo, 1000 unidades monetarias),
podemos usar la sumatoria de Gauss para encontrar la bonificación total recibida después de 'n' años.
 */

fun example1() {
    println("Ejemplo 1")

    val years = 10
    val annualBonus = 1000
    val totalBonusTraditional = calculateTotalBonusTraditional(years, annualBonus)
    val totalBonusOptimized = calculateTotalBonusOptimized(years, annualBonus)

    println("Bonificación total después de $years años (Método tradicional): $totalBonusTraditional")
    println("Bonificación total después de $years años (Método optimizado): $totalBonusOptimized")

    println()
}

// Método tradicional: Suma usando un bucle
fun calculateTotalBonusTraditional(years: Int, annualBonus: Int): Int {
    var totalBonus = 0
    for (i in 1..years) {
        totalBonus += i * annualBonus
    }
    return totalBonus
}

// Método optimizado: Usando la fórmula de la sumatoria de Gauss
fun calculateTotalBonusOptimized(years: Int, annualBonus: Int): Int {
    return years * (years + 1) / 2 * annualBonus
}

/*
Ejemplo 2.
Supongamos que una aplicación de gestión de proyectos asigna una cantidad creciente de tareas cada día durante un mes.
Queremos calcular la cantidad total de tareas asignadas en 30 días si el número de tareas asignadas el primer día es 1,
el segundo día es 2, y así sucesivamente.
 */

fun example2() {
    println("Ejemplo 2")

    val days = 30
    val totalTasksTraditional = calculateTotalTasksTraditional(days)
    val totalTasksOptimized = calculateTotalTasksOptimized(days)

    println("Cantidad total de tareas después de $days días (Método tradicional): $totalTasksTraditional")
    println("Cantidad total de tareas después de $days días (Método optimizado): $totalTasksOptimized")

    println()
}

// Método tradicional: Suma usando un bucle
fun calculateTotalTasksTraditional(days: Int): Int {
    var totalTasks = 0
    for (i in 1..days) {
        totalTasks += i
    }
    return totalTasks
}

// Método optimizado: Usando la fórmula de la sumatoria de Gauss
fun calculateTotalTasksOptimized(days: Int): Int {
    return days * (days + 1) / 2
}