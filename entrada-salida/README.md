# Guía de Ejercicios: Entrada/Salida

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01

Escribir un programa en Java, con todas las clases que considere necesarias, para la lectura y procesamiento de un archivo, de la siguiente manera:

Se recibe un archivo en el cual la primera línea representa la cantidad de enteros que vendrán a continuación, y luego esa cantidad de enteros positivos, entre 0 y 9.
Se pide escribir un archivo de salida que contenga en su primera línea un contador de números leídos (sin repetidos) y luego los números ordenados.

### Ejemplo 1:

`caso01.in`:

```
7
1
3
2
1
3
8
2
```

`caso01.out`:

```
4
1
2
3
8
```

### Ejemplo 2:

`caso02.in`:

```
0
```

`caso02.out`:

```
0
```

## Ejercicio 02

Escribir un programa en Java, con todas las clases que considere necesarias, para la lectura y procesamiento de un archivo, de la siguiente manera:

1. Escribir un archivo de entre 10 mil y 20 mil números enteros aleatorios, en el rango de 0 a 12000. (La cantidad de números debe ser aleatoria)
2. Leer dicho archivo, buscando (a) máximo, (b) mínimo, (c) promedio.
3. Escribr un segundo archivo con una tabla de resultados. Ejemplo:

```
+----------+-------+
| Máximo   | 11978 |
+----------+-------+
| Mínimo   |     3 |
+----------+-------+
| Promedio |  7201 |
+----------+-------+
```

¡El formato de la última salida es parte del desafío!

## Ejercicio 03

Resolver el ejercicio [Luchadores Japoneses](src/entradasalida/ej03/sumo.pdf), que encontrará en este mismo repositorio bajo el nombre de `sumo.pdf` dentro del paquete correspondiente.

El ejercicio deberá resolverse utilizando las técnicas de lectura y escritura de archivos aprendidas, pero también se solicita que se intente aplicar un diseño orientado a objetos que emplee las técnicas y herramientas aprendidas. En específico:
- Separación de responsabilidades en distintas clases
- Colaboración entre objetos
- Composición/Agregación si fuera necesario
