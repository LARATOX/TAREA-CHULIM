# Finanzas Personales

## Descripción

Aplicación desarrollada en Kotlin para la administración básica de finanzas personales. Permite registrar ingresos y gastos, consultar movimientos financieros, buscar registros por categoría y visualizar el saldo actual.

## Funcionalidades

- Registrar ingresos.
- Registrar gastos.
- Mostrar historial de movimientos.
- Buscar movimientos por categoría.
- Mostrar saldo actual.
- Resumen financiero de ingresos y gastos.

## Tecnologías utilizadas

- Kotlin
- IntelliJ IDEA
- JOptionPane (Swing)

## Conceptos de Kotlin implementados

- Funciones
- Data Class
- MutableList
- Null Safety
- Expresiones lambda
- filter()
- forEach()
- sumOf()
- when
- Ciclos do-while

## Estructura del proyecto

### Movimiento.kt

Data class que almacena la información de cada movimiento financiero.

```kotlin
data class Movimiento(
    val id: Int,
    val tipo: String,
    val categoria: String,
    val descripcion: String?,
    val monto: Double
)
```

### FinanzasManager.kt

Gestiona la lógica principal:

- Registro de movimientos.
- Consulta de historial.
- Búsqueda por categoría.
- Cálculo del saldo.

### Main.kt

Controla la interacción con el usuario mediante ventanas gráficas.

## Mejoras realizadas

Versión inicial:
- Aplicación basada en consola.
- Entrada y salida mediante terminal.

Versión actual:
- Interfaz gráfica utilizando JOptionPane.
- Ventanas para captura de datos.
- Ventanas para mostrar resultados.
- Resumen financiero más amigable para el usuario.
- Eliminación de dependencia de la consola.

## Cómo ejecutar

1. Abrir el proyecto en IntelliJ IDEA.
2. Ejecutar Main.kt.
3. Utilizar las ventanas emergentes para interactuar con el sistema.

## Estado actual

Aplicación funcional con interfaz gráfica.