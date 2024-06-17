# Sumatoria de Gauss

## Descripción

Programa escrito en Kotlin que demuestra dos métodos para calcular la suma de los primeros `n` números naturales:
1. **Método Tradicional**: Utiliza un bucle para sumar los números secuencialmente.
2. **Método Optimizado**: Utiliza la fórmula de la Sumatoria de Gauss.

## ¿Qué es la Sumatoria de Gauss?

La Sumatoria de Gauss es una fórmula matemática que permite calcular la suma de los primeros `n` números naturales de manera eficiente. La fórmula es:

$\[ S = \frac{n(n + 1)}{2} \]$

Proporciona una manera rápida de calcular la suma sin necesidad de iterar a través de todos los números.

## Archivos

### `main.kt`

Este archivo contiene la implementación principal del programa. Aquí se encuentran las funciones para calcular la suma de manera tradicional y optimizada, así como las funciones para medir el tiempo de ejecución y el uso de memoria de cada método.

#### Funciones Principales

- `sumNumbers(n: Int): Int`
    - Calcula la suma de los primeros `n` números naturales usando un bucle (Manera tradicional).
    - Sintaxis equivalente en C++:
      ```cpp
      int sumNumbers(int n) {
          int sum = 0;
          for (int i = 1; i <= n; ++i) {
              sum += i;
          }
          return sum;
      }
      ```
- `optimizedSumNumbers(n: Int): Int`
    - Calcula la suma de los primeros `n` números naturales usando la fórmula de la Sumatoria de Gauss.
    - Sintaxis equivalente en C++:
      ```cpp
      int optimizedSumNumbers(int n) {
          return n * (n + 1) / 2;
      }
      ```

- `testTime(n: Int)`
    - Mide y muestra el tiempo de ejecución de ambos métodos para un valor dado de `n`.

- `testSpace(n: Int)`
    - Mide y muestra el uso de memoria de ambos métodos para un valor dado de `n`.

#### Ejecución

Para ejecutar el programa, simplemente compila y corre el archivo `main.kt`. El programa demostrará la funcionalidad de ambos métodos para valores de `n` pequeños y grandes, y mostrará los resultados de las mediciones de tiempo y espacio.

