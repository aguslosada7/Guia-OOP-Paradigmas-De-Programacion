# Guía de Ejercicios: Colecciones

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Listas
### Ejercicio 01
Una empresa de mensajería necesita llevar un registro de los paquetes que transporta. Cada paquete tiene un número de seguimiento, dirección de origen, dirección de destino y peso. Escriba un programa que permita:
1. Agregar un nuevo paquete al registro.
2. Buscar un paquete por número de seguimiento.
3. Mostrar la lista de paquetes que superan un peso determinado.

### Ejercicio 02
Una tienda de ropa necesita llevar un registro de las ventas que realiza cada día. Cada venta tiene un número de venta, fecha, hora, nombre del cliente y monto de la venta. Escriba un programa que permita:
1. Agregar una nueva venta al registro.
2. Buscar una venta por número de venta.
3. Mostrar la lista de ventas realizadas en un día determinado.

### Reflexión
Usted está llegando a clases y escucha a otro estudiante decir "uno de estos ejercicio se resolvía mejor con `LinkedList` y el otro con `ArrayList`".
¿Está de acuerdo? ¿Por qué?

## Conjuntos
### Ejercicio 03
Una aplicación necesita llevar un registro de las palabras únicas que aparecen en un texto. Diseñe un programa que reciba el texto y utilice un Set para almacenar las palabras únicas que aparecen en él.
Devuelva el listado de palabras únicas.

### Ejercicio 04
Una tienda de libros necesita llevar un registro de los títulos únicos de los libros que tiene en stock. Diseñe un programa que utilice un Set para almacenar los libros sin ejemplares repetidos.
> Tip: Para esto necesitará definir el criterio de igualdad correctamente. Defina los atributos en consecuencia.

## Mapas
### Ejercicio 05
Una empresa necesita llevar un registro de las ventas que ha realizado cada mes. Diseñe un programa que utilice un HashMap para almacenar el mes como clave y el monto de ventas como valor. El programa debe permitir agregar nuevas ventas y mostrar el monto de ventas de un mes específico.

### Ejercicio 06
Un programa necesita llevar un registro de los estudiantes y sus respectivas notas en un curso. Escriba un programa que utilice un HashMap para almacenar el nombre del estudiante como clave y un arreglo de notas como valor. El programa debe permitir agregar nuevas notas y mostrar el promedio de notas de un estudiante específico.

Ahora diseñe una función que permita invertir el mapa: queremos el listado de estudiantes por promedio. Ante un mismo promedio, debe devolver todos los estudiantes que lo hayan obtenido.

## Colas
### Ejercicio 07
Una aplicación necesita procesar una lista de tareas en orden de llegada. Diseñe un programa que utilice una cola para almacenar las tareas a medida que se reciben. El programa debe procesar las tareas en el orden en que se recibieron.

### Ejercicio 08
Diseñe una función que permita invertir los elementos de una cola sin utilizar ninguna estructura auxiliar para ello. Es decir, luego de la ejecución de esta función, una cola con los elementos {1, 2, 3} deberá tener los elementos {3, 2, 1}.

## Pilas
### Ejercicio 09
Un programa necesita determinar si una expresión aritmética es válida. Diseñe un programa que utilice una pila para almacenar los paréntesis abiertos y cerrados en la expresión. El programa debe asegurarse de que los paréntesis estén correctamente balanceados.

### Ejercicio 10
Un programa necesita procesar una serie de comandos de usuario que se reciben en una terminal. Escriba un programa que utilice una pila para almacenar los comandos a medida que se reciben. El programa debe permitir deshacer la última operación realizada por el usuario desapilando el último comando almacenado.
> Tip: Los comandos serán simulados, no deben ejecutarse realmente. Conviene modelar la clase `Terminal` con sus métodos para introducir comandos y deshacerlos.