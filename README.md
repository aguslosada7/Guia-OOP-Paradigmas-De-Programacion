# Guías de Ejercicios: Java y Objetos

Este repositorio reúne todas las guías de ejercicios de la parte de Java de **Paradigmas de Programación** (UNLaM), desde el diagnóstico inicial hasta los patrones de diseño.

Cada guía es un proyecto de Eclipse independiente, con su propio README (las consignas) y su estructura de paquetes lista para trabajar

## Guías

El orden es el de avance de la materia. Qué guía corresponde a cada clase está en el `TEMARIO.csv` del [workspace de la materia](https://github.com/paradigmas-de-programacion/workspace).

| Clase # | Guía | Tema |
|---------|------|------|
|       1 | [diagnostico](diagnostico/) | Diagnóstico inicial: matrices, recorridos, lógica imperativa |
|       2 | [introduccion](introduccion/) | Primeros objetos: estado y comportamiento, constructor, operaciones que pueden rechazarse |
|       3 | [basicas](basicas/) | Cuestiones básicas del lenguaje: la clase `Rango`, inmutabilidad, igualdad, orden |
|       4 | [objetos](objetos/) | Clases simples a partir de una interfaz dada, con pre y post condiciones |
|       4 | [relaciones](relaciones/) | Relaciones entre objetos: agregación, composición y asociación, igualdad y orden |
|       5 | [herencia](herencia/) | Herencia y polimorfismo: reutilización, sobrescritura, clases abstractas e interfaces |
|       6 | [colecciones](colecciones/) | Listas, conjuntos, mapas, colas y pilas |
|       6 | [excepciones](excepciones/) | Excepciones propias, `try-catch`, try with resources, `assert` |
|       7 | [patrones](patrones/) | Patrones de diseño: Composite, State, Iterator, Adapter |

## Cómo trabajar

1. Clonar el repositorio con ssh o sus variantes:

```
git clone git@github.com:paradigmas-de-programacion/guia-oop.git
```

2. Abrir Eclipse y usar la carpeta clonada como workspace (`File > Switch Workspace > Other...`).
3. Importar las guías: `File > Import... > General > Existing Projects into Workspace`, elegir la carpeta del repositorio y marcar todos los proyectos.
4. Abrir el README de la guía del tema y resolver los ejercicios en `src/`, escribiendo las pruebas en `test/`.

## Colaborar con este repositorio

Si tuvieras una idea interesante que quisieras compartir, podrías utilizar el mecanismo de Pull Requests de GitHub para colaborar y sumar tu aporte a la materia. También podés abrir un Issue para que lo revisemos si encontrás algo que cambiar o mejorar.
