# Guía de Ejercicios: Introducción a Objetos

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma orientado a objetos.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

En estos primeros ejercicios el foco está en identificar el estado de un objeto y las operaciones que lo modifican, en dejarlo bien inicializado desde el constructor, y en que sea el propio objeto el que haga cumplir las reglas de su dominio.

## Ejercicio 01: El ascensor

Modelar el ascensor de un edificio.

El ascensor conoce hasta qué piso llega, y arranca en la planta baja (piso 0).

Se le puede pedir que suba un piso o que baje un piso, y se le puede preguntar en qué piso está. Arriba del piso más alto no hay nada, y abajo de la planta baja tampoco, cuando el pedido es imposible el ascensor no se mueve, y quien lo pidió tiene que poder enterarse.

Dos ascensores son independientes: mover uno no mueve al otro. Un ascensor puede comparar su posición con la de otro para decir cuál de los dos está más arriba.

### Casos a cubrir

Un test por regla, escritos junto con la clase. Algunos tests interesantes:

- Bajar desde la planta baja (qué contesta y en qué piso queda)
- Subir desde el piso más alto
- Dos ascensores con distinta cantidad de movimientos
- Dos ascensores en el mismo piso
- Un ascensor comparado consigo mismo

## Ejercicio 02: El personaje

Modelar el personaje de un juego de peleas por turnos.

Un personaje tiene nombre, vida y daño. Nace con la vida completa, y esa vida inicial es también su máxima.

La vida baja cuando recibe daño y sube cuando se cura, pero nunca queda negativa ni supera el máximo. Está vivo mientras le quede vida. Un personaje muerto no se cura y no ataca.

Un personaje puede atacar a otro. El que recibe pierde tanta vida como daño reparte el atacante, y el atacante no se lastima. El ataque no ocurre si el atacante está muerto, ni si intenta atacarse a sí mismo, y quien lo intentó tiene que poder enterarse.

### Casos a cubrir

Un test por regla, escritos junto con la clase. Algunos tests interesantes:

- Un golpe más grande que la vida restante
- Una curación que se pasa del máximo
- Curar a un personaje muerto
- Atacar estando muerto (qué contesta y qué le pasa a la vida del otro)
- Un ataque a sí mismo
