# Kata 2

## Descripción

El objetivo de esta kata es leer un archivo TSV que contiene información sobre títulos, deserializar los datos en objetos `Title`, y luego generar un histograma que muestra la cantidad de cada tipo de título.

## Estructura del Proyecto

El proyecto contiene las siguientes clases:

- `Main`: Clase principal que ejecuta el programa.
- `Title`: Clase que representa un título con sus atributos y tipos.
- `TitleDeserializer`: Interfaz para deserializar datos en objetos `Title`.
- `TitleReader`: Interfaz para leer títulos desde una fuente de datos.
- `TsvTitleDeserializer`: Implementación de `TitleDeserializer` para deserializar datos desde un archivo TSV.
- `TsvTitleReader`: Implementación de `TitleReader` para leer títulos desde un archivo TSV.
