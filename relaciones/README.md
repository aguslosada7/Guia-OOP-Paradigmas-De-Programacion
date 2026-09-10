# Guía de Ejercicios: Relaciones entre objetos

Resolver los siguientes ejercicios utilizando el lenguaje de programación Java, con el paradigma orientado a objetos.
Encontrarás una estructura de proyecto conveniente para ese objetivo.

El foco de esta guía está en cómo se conectan los objetos entre sí: cuándo un objeto contiene a otro, cuándo lo crea y cuándo solamente lo conoce. En el camino aparecen la igualdad según la identidad del dominio y el orden, natural y alternativo.

## Ejercicio 01: Liga de robots

En un galpón del parque industrial funciona una liga de robots de combate. Los equipos inscriben sus robots, cada robot sale a la arena con un piloto y, al final de cada jornada, alguien anota en una planilla de papel quién ganó, quién perdió y quién empató. La planilla ya no da más: se pierden hojas, las sumas de puntos dan distinto según quién las haga y rearmar la lista ordenada por potencia es trabajo manual. La liga quiere el mismo registro, pero en un programa.

Antes de comenzar cada etapa, intentá dibujar o actualizar el diagrama de clases.

### Etapa 1: los robots y sus pilotos

De cada robot la liga anota su código único, nombre, tipo, energía y potencia. El código es un entero. Los tipos que se usan hoy son `"pesado"`, `"liviano"` y `"aereo"`, aunque pueden aparecer otros. Dos robots son el mismo robot si tienen el mismo código: el nombre no alcanza, por ejemplo, hubo dos `"Titán"` en temporadas distintas. Los datos de un robot son privados; hacia afuera se ofrece solo lo que haga falta.

De un piloto la liga anota nombre y número de licencia. Pilotos y robots se inscriben por separado, por lo que un piloto puede no tener robot asignado, un robot puede quedar sin piloto si el piloto se lesiona y, entre temporadas, un piloto puede pasar a conducir otro robot. Cuando se muestra un robot se indica quién lo conduce, o que no tiene piloto.

- ¿Qué pasa hoy si comparás dos robots con `==`? ¿Y con `equals`? ¿Qué debería pasar?
- ¿El piloto es parte del robot? ¿Quién lo construye: el robot u otra cosa?
- Opcional: investigar `Enum` y evaluar si conviene usarlo para el tipo de robot.

### Etapa 2: los equipos

Los robots se pueden inscribir en un equipo. Cada equipo tiene un nombre y permite hasta 5 robots. Puede dar de baja un robot, que luego puede inscribirse en otro equipo. Los robots existen antes de entrar a un equipo; el equipo no los fabrica.

> **Nota:** Si todavía no se vio el tema "colecciones", guarden los robots del equipo en un arreglo (`Robot[]`), no en una lista de Java o TDAs similares.

Además de inscribir y dar de baja robots, la oficina de la liga necesita preguntarle a un equipo cuál es su robot más potente y cuánta potencia suma entre todos sus robots.

- Un equipo sin robots: ¿cuánta potencia total suma? ¿Y cuál es su robot más potente? Recuerden que ya podemos contar con excepciones para trabajar en casos excepcionales.
- Opcional: investigar `ArrayList`.

### Etapa 3: el registro de la temporada

La liga necesita llevar el registro de cada temporada y poder obtener un resumen en texto para la cartelera.

De cada equipo se registran victorias, derrotas y empates. Una victoria vale **3 puntos**, un empate **1 punto** y una derrota nada. El registro puede anotar cada resultado, calcular el puntaje y generar el resumen. El registro pertenece a un único equipo.

- ¿Quién construye el registro de un equipo?
- Recordá actualizar el diagrama de clases con estas nuevas clases. ¿Notaste que las 4 clases que ya armamos tienen 3 relaciones de distinto tipo? ¿Cómo se dibuja cada una y por qué?
- Opcional: adaptar las clases y sus relaciones para permitir registros históricos, no solo el actual.

### Etapa 4: la planilla ordenada

La liga necesita ordenar los robots de tres maneras:

- por tipo: `"pesado"`, luego `"liviano"` y finalmente `"aereo"`. Dentro de cada tipo, por código. Este es el **orden natural** de un robot;
- por potencia, de mayor a menor;
- por energía, de menor a mayor.

Cada equipo tiene que poder entregar sus robots en cualquiera de estos tres órdenes.

- El orden natural desempata por código. ¿En qué caso concreto hace falta ese desempate?
- ¿Dónde debería vivir la prioridad de los tipos: en el código que ordena, en los propios tipos o en otro lugar?
- Cuando se piden los robots ordenados, ¿eso debería cambiar el orden en que el equipo los tiene guardados?

### Etapa 5: la oficina de la liga

Escribí un `main` que arme una jornada: al menos 2 pilotos, 2 equipos y 6 robots repartidos entre los equipos, con algunas victorias, derrotas y empates registradas.

Mostrá, para cada equipo, sus robots en cada uno de los tres órdenes, su robot más potente, su potencia total y el resumen de su temporada. La salida tiene que poder leerse de corrido.

### Etapa 6: las comprobaciones

El `main` sirve para probar el programa mientras lo desarrollás, pero no reemplaza las pruebas automáticas: se modifica y deja de comprobar lo anterior. Escribí las pruebas con JUnit y asegurate de que cada comportamiento importante tenga al menos una prueba. Te dejo algunas sugerencias, utilizalas, ¡pero que no te limiten!

#### Sobre el robot

- Dos robots con el mismo código son el mismo robot; dos con códigos distintos no.
- El orden natural agrupa por tipo y, dentro de cada tipo, ordena por código.

#### Sobre el registro de la temporada

- Un registro recién creado tiene 0 puntos.
- Tres victorias dan 9 puntos; dos victorias y un empate, 7.
- Las derrotas no cambian el puntaje.

#### Sobre el equipo

- Un equipo nuevo no tiene robots.
- Se pueden inscribir robots hasta el límite y dar de baja uno, incluso pasando otro objeto con el mismo código.
- Dar de baja un robot que no estaba no modifica el equipo; tampoco se puede inscribir un sexto robot.
- La potencia total es la suma de los robots inscriptos y vale 0 cuando no hay ninguno.
- El robot más potente de un equipo sin robots se comporta según lo decidido en la etapa 2.
- Los robots pueden pedirse por potencia, de mayor a menor, o por energía, de menor a mayor, sin alterar el orden interno del equipo.
