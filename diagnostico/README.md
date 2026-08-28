# Guía de Ejercicios: Diagnóstico

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01

Escribir un método en Java que permita comprobar si la diagonal principal de una matriz cuadrada de enteros tiene en cada posición un valor igual a la suma de todos los valores de las posiciones anteriores de dicha diagonal. 

Por ejemplo, la siguiente matriz comprueba la regla:

```
1 2 3
4 1 6
7 8 2
```

Pero esta otra, no la comprueba:

```
1 2 3
4 2 6
7 8 2
```

## Ejercicio 02

Escribir un método en Java que permita comprobar si la multiplicación de todos los valores de una matriz numérica, dará 0 o no.

## Ejercicio 03

Escribir un método en Java que de una matriz numérica dada, devuelva una matriz con la misma cantidad de elementos, pero donde cada valor es la suma de sus adyacentes originales (arriba, abajo, izquierda, y derecha; si existen)

Ejemplo:
Para la matriz

```
 8  2 -3  4
 5 -6 -6 20
21  1 -5  0
```

La salida debe ser

```
15  1  -3 21
28 -4   0 18
27 11 -10 15
```

## Ejercicio 04

Escribir un método en Java que de una matriz numérica dada, devuelva un vector con `n` elementos, donde cada elemento es la moda de una fila. Si hubiese más de una moda, se deberá utilizar la de mayor valor

Ejemplo:
Para la matriz

```
 1  2  3  4
 5 -6 -6 20
 1  1 10 10
```

La salida debe ser

```
4 -6 10
```

## Ejercicio 05

Escribir un método en Java que de una matriz cuadrada dada de dimensión `nxn`, devuelva una matriz con `2n-1` filas, donde cada una tendrá los datos de una de las diagonales (de abajo a la izquierda hacia arriba a la derecha)

Ejemplo:
Para la matriz

```
 1  2  3  4
 5  6  7  8
 9 10 11 12
13 14 15 16
```

La salida debe ser

```
13
 9 14
 5 10 15
 1  6 11 16
 2  7 12
 3  8
 4
```
