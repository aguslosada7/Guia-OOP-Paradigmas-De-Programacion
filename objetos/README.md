# Guía de Ejercicios: Objetos

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01

Implementar la clase Nota para cumplir con la interfaz proporcionada.

Agregar a la clase Nota el método:

```java
/**
 * pre : nuevoValor está comprendido entre 0 y 10.
 * post: modifica el valor numérico de la Nota, cambiándolo
 *       por nuevoValor, siempre y cuando nuevoValor sea superior al
 *       valor numérico actual de la Nota.
 */
public void recuperar(int nuevoValor) { }
```
Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.

## Ejercicio 02
Implementar la clase Punto. Un Punto en el plano posee coordenada X y coordenada Y. Proporcionar métodos para:

1. obtener y cambiar cada una de sus coordenadas:
```java
public double obtenerX()
public double obtenerY()
public void cambiarX(double nuevoX)
public void cambiarY(double nuevoY)
```

2. saber si el punto está sobre el eje de las X:
```java
public boolean estaSobreEjeX()
```

3. saber si el punto está sobre el eje de las Y:
```java
public boolean estaSobreEjeY()
```

4. saber si el punto es el origen de coordenadas:
```java
public boolean esElOrigen() { }
```

5. calcular la distancia al origen y a otro punto:
```java
public double distanciaAlOrigen() { }
public double distanciaAotroPunto(Punto otro) { }
```

Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.

## Ejercicio 03

Implementar una clase que modele un círculo, del que se desea manipular (obtener y cambiar): 
- radio
- diámetro
- perímetro
- área

Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.

## Ejercicio 04

Implementar la clase Cubo a partir de la interfaz proporcionada.

Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.

## Ejercicio 05

Implementar la clase TarjetaBaja a partir de la interfaz proporcionada.

Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.

## Ejercicio 06

Implementar la clase Cerradura con los siguientes métodos. Indique axiomas de la clase, pre y post condiciones de los métodos.
Cuando una Cerradura se bloquea no puede volver a abrirse nunca más. 

```java
class Cerradura {
    public Cerradura(int claveDeApertura,
                     int cantidadDeFallosConsecutivosQueLaBloquean)
    public boolean abrir(int clave)
    public void cerrar()
    public boolean estaAbierta()
    public boolean estaCerrada()
    public boolean fueBloqueada()
    public int contarAperturasExitosas()
    public int contarAperturasFallidas()
}
```

Realizar todas las pruebas que considere convenientes. Se pueden agregar métodos privados.
