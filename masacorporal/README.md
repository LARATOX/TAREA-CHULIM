# Calculadora de Índice de Masa Corporal (IMC)

## Descripción

Aplicación desarrollada en Kotlin que permite registrar personas, calcular automáticamente su Índice de Masa Corporal (IMC), consultar historiales, realizar búsquedas y obtener estadísticas generales.

## Funcionalidades

- Registrar personas.
- Calcular IMC automáticamente.
- Mostrar historial de registros.
- Buscar personas por nombre.
- Calcular promedio general de IMC.
- Clasificar resultados según el valor obtenido.

## Tecnologías utilizadas

- Kotlin
- IntelliJ IDEA
- JOptionPane (Swing)

## Conceptos de Kotlin implementados

- Funciones
- Data Class
- MutableList
- Null Safety
- filter()
- map()
- average()
- forEach()
- when
- Ciclos do-while

## Estructura del proyecto

### Persona.kt

Data class utilizada para almacenar la información de cada persona.

```kotlin
data class Persona(
    val nombre: String,
    val peso: Double,
    val estatura: Double
)
```

### IMCManager.kt

Gestiona:

- Registro de personas.
- Cálculo del IMC.
- Clasificación del IMC.
- Historial de registros.
- Estadísticas generales.

### Main.kt

Gestiona la interacción mediante ventanas gráficas.

## Clasificación IMC

| IMC | Clasificación |
|------|------|
| Menor a 18.5 | Bajo peso |
| 18.5 - 24.9 | Peso normal |
| 25.0 - 29.9 | Sobrepeso |
| 30 o más | Obesidad |

## Mejoras realizadas

Versión inicial:
- Aplicación basada en consola.
- Resultados mostrados mediante terminal.

Versión actual:
- Interfaz gráfica utilizando JOptionPane.
- Ventanas para captura de datos.
- Ventanas para mostrar historial y búsquedas.
- Clasificación automática del IMC.
- Mejor experiencia de usuario.

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar Main.kt.
3. Utilizar las ventanas emergentes para interactuar con la aplicación.

## Estado actual

Aplicación funcional con interfaz gráfica y clasificación automática de resultados.