# Guía de Ejercicios: Herencia y polimorfismo

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma imperativo.
Encontrarás una estructura de proyecto conveniente para ese objetivo.


## Ejercicio 01: Ejercicio compuesto de cuentas bancarias
El siguiente es un ejercicio compuesto de varias partes. Es un compilado para visitar y profundizar en los conceptos de Programación Orientada a Objetos. Se anima a los estudiantes a explorar el ejercicio, codificarlo y expandirlo cuanto les parezca necesario. Mediante la exploración es que se lograrán los aprendizajes más profundos, se debe tomar este ejercicio como un mapa: marca el camino, pero si nos desviamos para descubrir nuevas áreas, siempre podemos retomar sendero gracias a él.

Se recomienda agregar los tests necesarios para poder comprobar que el comportamiento deseado es obtenido, y que al continuar a la siguiente parte, todo lo anterior siga funcionando de manera correcta

### Parte 1: Estructuras de Datos
Una Cuenta posee un saldo. Se puede agregar dinero a la Cuenta, incrementando el saldo. También se puede retirar dinero de la Cuenta, decrementando dicho saldo.
Debe poderse resolver la siguiente secuencia de acciones:
 - Creación de una Cuenta nueva, saldo == 0.
 - Acreditación de $ 1000, saldo == 1000.
 - Retiro de $ 550, saldo == 450.

 ```java
// main
Cuenta miCuenta = new Cuenta();
System.out.println(miCuenta.saldo); // 0
miCuenta.saldo += 1000;
System.out.println(miCuenta.saldo); // 1000
miCuenta.saldo -= 550;
System.out.println(miCuenta.saldo); // 450
```

**Preguntas para profundizar**
 - ¿Qué tipo de dato se utilizó para el saldo? ¿Es el más apropiado?
 - ¿Qué visibilidad tiene el atributo saldo de la Cuenta? ¿Es correcto?
 - Si extraigo más dinero del disponible en saldo, seguramente pueda hacerlo. ¿Está bien que así sea?


### Parte 2: Encapsulamiento
Hemos visto las falencias del diseño anterior, y luego de investigar un poco nos encontramos con el concepto de Encapsulamiento. ¡Es una buena ocasión para incorporarlo!
Se pide que utilicemos este concepto para asegurarnos de las siguientes restricciones del dominio del problema:
 - No puedo extraer dinero que no poseo
 - No puedo extraer ni depositar dinero negativo
 - El saldo no puede afectarse más allá que por depósitos o extracciones

**Preguntas para profundizar**
 - ¿Qué ventaja representó la incorporación del Encapsulamiento en el problema?
 - ¿Qué desventaja podríamos encontrar?
 - ¿Es realmente Programación Orientada a Objetos? ¿Cómo puedo saberlo?
 - ¿Qué acciones se utilizaron para prevenir la realización de operaciones no válidas?


### Parte 3: Abriendo el juego
Es común transferir dinero entre cuentas bancarias. Para ello, debemos dotar a nuestro modelo con dicha funcionalidad. Cuando querramos transferir un monto, deberá verificarse que la operación puede realizarse, y deberá acreditarse directamente en la cuenta destino. El código para dicha operación se verá similar a este:
```java
// main
Cuenta cuentaOrigen = new Cuenta();
cuentaOrigen.depositar(10000);
System.out.println(cuentaOrigen.consultarSaldo()); // 10000
Cuenta cuentaDestino = new Cuenta();
System.out.println(cuentaDestino.consultarSaldo()); // 0
cuentaOrigen.transferir(550, cuentaDestino);
System.out.println(cuentaOrigen.consultarSaldo()); // 9450
System.out.println(cuentaDestino.consultarSaldo()); // 550
```

**Preguntas para profundizar**
 - Al interactuar con objetos del mismo tipo, es importante distinguir entre parámetros y atributos. ¿Cómo puede hacerse para evitar confusiones?
 - ¿Es correcto el orden de los parámetros para el método transferir? ¿Qué cambiarías?
 - Dentro del código de transferir, ¿utilizaste los métodos preexistentes o repetiste lógica que ya existía? ¿Cuál es la ventaja de cada una de las aproximaciones?
 - ¿Qué pasaría si la operación de transferir se ve interrumpida a la mitad de su ejecución? ¿Cómo se podría prevenir esto?


### Parte 4: Se agranda la familia
Esta vez necesitamos modelar dos nuevos tipos de cuenta:
 - CuentaDeAhorros, que permite reservar parte del saldo para que no esté disponible, en una especie de saldo secundario. Se puede disponer de ese saldo normalmente una vez que se reintegre (a pedido del cliente) al saldo total de la cuenta.
 - CuentaCorriente, que permite retirar todo lo disponible, y un descubierto de hasta cierta cantidad de dinero extra. El monto “en descubierto” se establece al momento de la apertura de la cuenta.

**Preguntas para profundizar**
 - ¿Hubo alguna funcionalidad que pudiera reutilizarse?
 - ¿Qué método tuvo que rehacerse?
 - ¿Cómo se manejan transferencias entre tipos de cuenta diferentes?


### Parte 5: Policomplicaciones

#### Parte 5.1:
El banco decide comenzar a registrar las transacciones individualmente, por lo que necesitaremos mantener un registro de cada acreditación o débito en la cuenta. Esto debe suceder para todos los tipos de cuenta.
De la transacción se desea conocer el motivo y el monto. Es importante mantenerlas ordenadas. No es importante saber la fecha en la que se realizó, pero sería bueno hacerlo.


#### Parte 5.2:
Ahora que tenemos registro de transacciones, podemos incorporar nuevos productos bancarios:
 - Tarjetas de Débito, las cuales tienen una cuenta asociada y retiran dinero de ella al efectuar una compra.
 - Tarjetas de Crédito, las cuales permiten acumular compras hasta el momento en el que finalmente se debitan de la cuenta, donde se cobra el total más una comisión del 3% sobre el total comprado en concepto de gastos administrativos.
 - Plazos Fijos, que nos privan de cierto monto de dinero, pero al momento de acreditarse se reintegran con un interés adicional al capital reservado. El interés actualmente es del 36% anual, pero vamos a integrar mensualmente.



## Ejercicio 02: Instrumentos musicales
Se quiere construir un programa que permita al usuario utilizar instrumentos musicales. El sistema tendrá las siguientes características:
- Se podrá consultar la lista de todos los instrumentos musicales que contiene el programa.
- Todos los instrumentos tienen un nombre y una descripción.
- Todos los instrumentos se pueden tocar. Pero el funcionamiento de tocar un instrumento varía dependiendo del instrumento que sea.
- Los instrumentos se clasifican en 3 tipos: Viento, Percusión y Cuerda. A su vez los instrumentos de viento pueden ser de 2 tipos: Madera o Metal.
- Los instrumentos de cuerda y de viento son afinables. Y hay dos maneras de afinar un instrumento: en forma manual o en forma automática. El funcionamiento de cada forma de afinación varía de acuerdo al tipo de instrumento.
- Los instrumentos de percusión y de viento son lustrables. Y el funcionamiento del lustrado de un instrumento varía dependiendo del tipo de instrumento.

Nota: Cuando realice el código de las clases, que la implementación de los métodos sólo sea una impresión en pantalla el nombre del método que se está ejecutando.
Se pide realizar un Main para cada uno de estos objetivos:
- Crear una orquesta, compuesta por varios instrumentos. Debe ser posible tocar todos los instrumentos juntos, o los de viento, percusión y cuerdas por separado.
- Crear un "Lustrador", que pueda lustrar instrumentos lustrables.
- Crear un "Afinador", que pueda afinar instrumentos afinables.
