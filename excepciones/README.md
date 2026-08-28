# Guía de Ejercicios: Excepciones

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01
Escribir una función que calcule la división de dos números enteros, pero que lance una excepción del tipo `ArithmeticException` si el segundo número es cero.

## Ejercicio 02
Definir su propia excepción y utilizarla en un programa que posea una función que lance dicha excepción si se intenta calcular la raiz cuadrada de un número negativo. Esta excepción deberá extender de `Exception` en forma directa.

## Ejercicio 03
Escribir un programa que calcule el cociente de dos números enteros, pero que lance una **excepción propia** de tiempo de ejecución si el segundo número es cero.
Tip: Deberá extender de `RuntimeException`.

¿Necesita ser anunciada? (throws)

## Ejercicio 04
Escribir una clase que simule una cuenta bancaria. El programa debe lanzar una excepción si se intenta retirar más dinero del que hay disponible en la cuenta.

## Ejercicio 05
Agregar excepciones al ejercicio anterior (realizar una copia). El programa debe usar try-catch para manejar cualquier excepción que pueda ocurrir.
Para ello, agregaremos al menos dos excepciones nuevas:
1. Crear una cuenta con saldo negativo
2. Retirar/Depositar montos negativos

## Ejercicio 06
Escribir un programa que lea un archivo de texto que contiene el nombre de un archivo a su vez. El programa debe intentar abrir y leer el archivo mencionado en el primer archivo, y lanzar una excepción si no se puede abrir el archivo mencionado.
Cerrar el primer archivo luego de cerrar el segundo. Esto generará que utilices dos bloques try anidados.

## Ejercicio 07
Repetir el ejercicio anterior, pero utilizando bloques [try with resources](https://www.baeldung.com/java-try-with-resources). Comparar el código resultante.

## Ejercicio 08
Explorar el uso de la palabra reservada `assert` para verificar ciertas condiciones durante la ejecución del código. Por ejemplo, que el dividendo sea diferente a cero en una división.