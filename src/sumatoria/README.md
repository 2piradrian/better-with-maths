# Sumatoria de Gauss

## Descripción

Programa escrito en Kotlin que demuestra dos métodos para calcular la suma de los primeros `n` números naturales:
1. **Método Tradicional**: Utiliza un bucle para sumar los números secuencialmente.
2. **Método Optimizado**: Utiliza la fórmula de la Sumatoria de Gauss.

## ¿Qué es la Sumatoria de Gauss?

La Sumatoria de Gauss es una fórmula matemática que permite calcular la suma de los primeros `n` números naturales de manera eficiente. La fórmula es:

$\[ S = \frac{n(n + 1)}{2} \]$

Proporciona una manera rápida de calcular la suma sin necesidad de iterar a través de todos los números.

## Archivo

### `main.kt`

Este archivo contiene la implementación principal del programa. Aquí se encuentran las funciones para calcular la suma de manera tradicional y optimizada.

#### Funciones Principales

- `traditionalSummation(n: Int): Int`
    - Calcula la suma de los primeros `n` números naturales usando un bucle (Manera tradicional).
    - Sintaxis equivalente en C++:
      ```cpp
      int traditionalSummation(int n) {
          int sum = 0;
          for (int i = 1; i <= n; ++i) {
              sum += i;
          }
          return sum;
      }
      ```
- `optimizedSummation(n: Int): Int`
    - Calcula la suma de los primeros `n` números naturales usando la fórmula de la Sumatoria de Gauss.
    - Sintaxis equivalente en C++:
      ```cpp
      int optimizedSummation(int n) {
          return n * (n + 1) / 2;
      }
      ```

#### Ejecución

Para ejecutar el programa, simplemente compila y corre el archivo `main.kt`. El programa demostrará la funcionalidad de ambos métodos para valores de `n` pequeños y grandes, y mostrará los resultados de las mediciones de tiempo y espacio.

#### Salida esperada

Tener en cuenta que estos valores son de referencia y no serán exactamente estos los que usted reciba para la ejecución en su máquina.

```
--- Test de funcionalidad ---
Sumatoria tradicional para 10 = 55
Sumatoria optimizada para 10 = 55

 --- Test de tiempo ---
Método tradicional
Tiempo de ejecución para n = 10: 0,353 ms
Método optimizado
Tiempo de ejecución para n = 10: 0,0074 ms

Método tradicional
Tiempo de ejecución para n = 10000000: 4,8137 ms
Método optimizado
Tiempo de ejecución para n = 10000000: 0,001 ms

 --- Test de espacio ---
Método tradicional
Espacio de memoria para n = 10: 0 KB
Método optimizado
Espacio de memoria para n = 10: 0 KB

Método tradicional
Espacio de memoria para n = 10000000: 40,98 KB
Método optimizado
Espacio de memoria para n = 10000000: 0 KB
```
