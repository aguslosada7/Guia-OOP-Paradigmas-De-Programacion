# Guía de Ejercicios: Cuestiones básicas del lenguaje Java

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01

Implementar la clase `Rango`, que representará los conceptos de intervalos numéricos. Un rango puede ser abierto a izquierda, a derecha, abierto o cerrado.

Más información: [Wikipedia](https://en.wikipedia.org/wiki/Interval_(mathematics))

Deberá cumplir con la siguiente especificación:

1. Un rango deberá poder crearse en sus cuatro combinaciones posibles:
```
[1.0, 2.0]
[1.0, 2.0)
(1.0, 2.0]
(1.0, 2.0)
```

2. Dado que tener un constructor tan complejo puede ser perjudicial, implementar cuatro métodos estáticos que permitan la creación de estas combinaciones.
3. Teniendo los métodos estáticos, será buena idea hacer el constructor privado, ya que sólamente se accederá a él por los métodos estáticos.
4. Se debe poder consultar si un número está dentro de un rango.
5. Se debe poder consultar si un rango está dentro de un rango.
6. Se debe poder consultar si hay intersección entre dos rangos.
7. Se debe poder comparar por igualdad los rangos.
8. Se debe poder ordenar rangos mediante su inicio. Si empatan, se resuelve el empate por su fin. Si empatan, los rangos cerrados irán primero que los abiertos.
9. Se debe poder imprimir un rango en formato cadena de caracteres.
10. Un rango es inmutable: no puede modificarse una vez creado.
11. Proporcionar un método estático que devuelva un rango que abarque a todos los otros rangos.
12. Se deben poder sumar rangos, utilizando el inicio del primero y el fin del segundo.
13. Se debe poder calcular un rango intersección, que en caso de no existir tal intersección retornará `(0.0, 0.0)`
14. Se debe poder desplazar un rango con un número escalar.

Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.