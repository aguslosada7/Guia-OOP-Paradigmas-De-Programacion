# Guía de Ejercicios: Patrones de Diseño

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

## Ejercicio 01: Composite
Augusto quiere ayudar a su hija con una tarea del jardín de infantes. Le han pedido que lleve materiales para pintar una serie de formas geométricas con colores. Habrá un grupo de formas que pintará de un color, y otro grupo que pintará de otro color, y así sucesivamente. Ella dispone por anticipado de las medidas y ubicaciones precisas de cada figura, pero necesita saber cuántos pomos de cada témpera debe comprar.
Sabiendo que un pomo de témpera tiene un poder cubritivo de 100cm2, y que no puede comprar "fracciones de pomo", se te pide que le muestres una forma de calcular las cantidades a comprar utilizando el patrón de diseño Composite.

> **Nota:** Las figuras no se solapan entre sí. Cada figura estará pintada al 100% del color indicado.

## Ejercicio 02: State
Considere que tiene una clase llamada "Tank" que representa a un tanque Terran en Starcraft 2. Implemente el patrón State para modelar los dos posibles estados del tanque: el estado "Modo Tanque" y el estado "Modo Asedio". A continuación, se proporcionan varios métodos que puede incluir en la implementación:

- Tank: la clase principal que representa un tanque Terran y contiene una referencia a un objeto de estado concreto.
- TankState: la interfaz que define los métodos comunes que deben implementar los estados concretos.
- TankModeTankState: una clase que implementa la interfaz TankState y representa el estado "Modo Tanque" del tanque. Debe proporcionar implementaciones para los métodos específicos de este estado, como moverse() y atacar().
- TankModeSiegeState: una clase que implementa la interfaz TankState y representa el estado "Modo Asedio" del tanque. Debe proporcionar implementaciones para los métodos específicos de este estado, como moverse() y atacar().

## Ejercicio 03: Iterator
Implemente una clase para representar un `ArbolBinario`. La misma debe implementar la interfaz `Iterable<T>`, que provea un iterador que la recorra In Order (Hi, R, Hd)

## Ejercicio 04: Adapter
Se está desarrollando una aplicación que integra varios servicios de envío de mensajes, como correo electrónico, SMS y mensajes push. Cada servicio tiene su propia interfaz de envío de mensajes, pero la aplicación requiere una interfaz unificada para enviar mensajes a los destinatarios.

La tarea consiste en implementar un Adapter para integrar estos servicios de envío de mensajes. Se deben crear adaptadores para cada servicio de mensajería (correo electrónico, SMS, mensajes push) que implementen una interfaz común de envío de mensajes. Luego, se debe crear un cliente que utilice estos adaptadores para enviar mensajes a diferentes destinatarios de manera transparente, sin necesidad de conocer los detalles específicos de cada servicio de mensajería.

Se debe asegurar que permite integrar servicios con interfaces incompatibles y proporciona una interfaz unificada para interactuar con ellos.
