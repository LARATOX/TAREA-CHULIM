# Integrantes
-Lara González Ángel Gabriel 
-Mendez Cortes Carlos Carlos 
-Cruz Gutiérrez Jemimah 
-Herrera Orozco Alejandra Valeria 
-Cristian Abad Mendieta 
-Dominguez Vela Aldo Francisco 

# TAREA-CHULIM

Proyecto realizado en Kotlin como practica para aplicar temas vistos en clase relacionados con programacion interfaces graficas y manejo de gitHub durante el desarrollo se trabajo con control de versiones commits y organizacion del codigo usando Kotlin como lenguaje principal.

# Sistema de Finanzas Personales

## Descripcion breve

Aplicacion desarrollada en Kotlin para registrar ingresos y gastos personales el programa permite agregar movimientos consultar saldo buscar por categorias y mostrar la informacion desde una interfaz grafica creada con Swing.

# Instrucciones de instalacion y ejecucion

## Requisitos

Tener instalado JDK 17 o superior.
Tener Kotlin instalado.
IntelliJ IDEA recomendado para ejecutar el proyecto.

# Abrir el proyecto

1. Abrir IntelliJ IDEA.
2. Seleccionar la opcion Open.
3. Buscar la carpeta del proyecto y abrirla.
4. Esperar a que el proyecto termine de configurarse automaticamente.

## Ejecutar la aplicacion

Abrir el archivo:

finanzaz/src/Main.kt

Despues ejecutar el programa usando el boton Run de IntelliJ IDEA.

# Funcionalidades principales

Agregar ingresos y gastos.
Mostrar todos los movimientos registrados.
Buscar movimientos por categoria.
Ver el saldo actual disponible.
Manejo de categorias para organizar mejor los movimientos.
Interfaz grafica hecha con Swing.
Botones personalizados para mejorar el diseño.
Validacion de datos para evitar errores.

# Conceptos de Kotlin aplicados

# Data Class  
La usamos para guardar la informacion de cada movimiento como ingresos y gastos archivo donde se uso: Movimiento.kt

# MutableList  
Sirvio para ir guardando los movimientos que se agregaban en el programa y poder modificarlos despues archivo donde se uso: FinanzasManager.kt

# Null Safety  
Ayudo a evitar errores cuando algun dato no estaba completo o quedaba vacio archivo donde se uso: Main.kt y FinanzasUI.kt

# Elvis Operator  
Se utilizo en algunas validaciones para colocar valores por defecto archivo donde se uso: FinanzasUI.kt

# Filter  
Se uso para buscar movimientos dependiendo de la categoria seleccionada archivo donde se uso: FinanzasManager.kt

# Enum Class  
Se utilizo para separar y organizar mejor las categorias de ingresos y gastos archivo donde se uso: CategoriaIngresos.kt y CategoriaGastos.kt

# When  
Sirvio para manejar distintas opciones y acciones dentro del sistema archivo donde se uso: Main.kt y FinanzasUI.kt

# Funciones  
Ayudaron a dividir mejor el codigo y hacerlo mas ordenado archivo donde se uso: FinanzasManager.kt

# Swing  
Fue la parte que se utilizo para crear toda la interfaz grafica del proyecto archivo donde se uso: FinanzasUI.kt

# Herencia  
Se aplico para personalizar algunos botones y reutilizar componentes archivo donde se uso: RoundedButton.kt

# Reflexion de proceso

## a) ¿Que fue lo mas dificil de este proyecto y como lo resolvieron?

Lo mas dificil fue adaptar el programa a una interfaz grafica porque muchas partes estaban hechas solamente para consola y al hacer cambios varias cosas dejaron de funcionar como antes tambien hubo problemas cuando diferentes integrantes modificaban archivos parecidos y aparecian conflictos en gitHub para solucionarlo se reviso el codigo entre todos se hicieron pruebas y se organizo mejor el proyecto para trabajar de una manera mas ordenada.

## b) ¿Hubo algun concepto de Kotlin que al principio no entendian y que ahora si comprenden? ¿Como llegaron a entenderlo?

Uno de los temas que mas costo entender fue null Safety porque al principio no quedaba claro cuando usar algunos operadores para evitar errores con valores nulos conforme se hicieron pruebas en formularios y validaciones se fue entendiendo mejor como manejar los datos y evitar que la aplicacion fallara practicar directamente en el proyecto ayudo mucho mas que solamente ver ejemplos o videos.

## c) ¿Si tuvieran que mejorar o ampliar este proyecto que le agregarian y por que?

Se podria mejorar agregando una base de datos para guardar toda la informacion aunque el programa se cierre tambien estaria bien agregar graficas para visualizar mejor los ingresos y gastos y hacer el sistema mas completo otra idea seria convertirlo en una aplicacion movil para poder usarlo desde el telefono de una manera mas practica.

## d) ¿Que aprendieron de este proyecto que no aprendieron solo leyendo o viendo videos?

Con este proyecto se aprendio mas sobre resolver errores reales y trabajar en equipo dentro de un proyecto completo tambien ayudo bastante aprender a usar gitHub de forma practica hacer commits y resolver conflictos cuando varias personas modificaban el mismo repositorio muchas cosas se entendieron mejor trabajando directamente en el proyecto que solo viendo teoria o ejemplos pequeños.





# Calculadora de Indice de Masa Corporal

## Descripcion breve

Proyecto realizado en Kotlin para calcular el indice de masa corporal de diferentes personas la aplicacion permite registrar datos calcular automaticamente el IMC consultar registros guardados y mostrar resultados desde una interfaz grafica hecha con Swing.

# Instalacion y ejecucion

## Requisitos

Tener instalado JDK 17 o superior.
Tener Kotlin instalado.
IntelliJ IDEA recomendado.
Git instalado.

## Abrir el proyecto

1. Abrir IntelliJ IDEA.
2. Seleccionar la opcion Open.
3. Buscar la carpeta del proyecto y abrirla.
4. Esperar a que el proyecto cargue correctamente.

## Ejecutar el proyecto

Abrir el archivo:

masa_corporal/src/Main.kt

Despues ejecutar el programa usando el boton Run.

# Funcionalidades principales

Registrar personas y sus datos.
Calcular automaticamente el IMC.
Mostrar historial de registros.
Buscar personas por nombre.
Mostrar promedio general de IMC.
Interfaz grafica hecha con Swing.
Botones personalizados.
Validacion de datos para evitar errores.

# Conceptos de Kotlin utilizados

Data Class  
Se utilizo para guardar la informacion de cada persona registrada archivo: Persona.kt

MutableList  
Sirvio para almacenar los registros y poder modificarlos durante la ejecucion archivo: IMCManager.kt

Null Safety  
Ayudo a evitar errores cuando algun dato quedaba vacio archivo: Main.kt / IMCUI.kt

Elvis Operator  
Se utilizo para asignar valores por defecto en algunas validaciones archivo: IMCUI.kt

Filter  
Se uso para buscar personas por nombre archivo: IMCManager.kt

Map  
Se utilizo para obtener valores de IMC y trabajar con listas archivo: IMCManager.kt

Average  
Sirvio para calcular el promedio general del IMC archivo: IMCManager.kt

Funciones  
Ayudaron a dividir y organizar mejor el codigo archivo: IMCManager.kt

Swing  
Fue utilizado para crear la interfaz grafica del proyectom archivo: IMCUI.kt

Herencia  
Se aplico para personalizar botones y reutilizar componentes archivo: RoundedButton.kt

# Reflexion del proyecto

# a) ¿Que fue lo mas dificil de este proyecto y como lo resolvieron?

Lo que mas trabajo nos dio fue pasar todo el programa de consola a una interfaz grafica usando Swing porque varias cosas dejaron de funcionar como estaban antes tambien tuvimos problemas cuando algunos datos se ingresaban mal o quedaban vacios y eso provocaba errores entre todos fuimos revisando el codigo haciendo pruebas y separando mejor las clases para que el proyecto fuera mas facil de organizar.

# b) ¿Hubo algun concepto de Kotlin que al principio no entendian y que ahora si comprenden? ¿Como llegaron a entenderlo?

Uno de los temas que mas nos costo entender fue Null Safety porque al inicio no quedaba claro cuando usar algunos operadores y aparecian errores por valores nulos conforme avanzamos en el proyecto y empezamos a probar formularios y validaciones fuimos entendiendo mejor como funciona Kotlin en esos casos y como evitar que la aplicacion falle.

# c) ¿Si tuvieran que mejorar o ampliar este proyecto que le agregarian y por que?

Nos gustaria agregar una base de datos para que la informacion permanezca guardada aunque se cierre el programa tambien estaria bien agregar recomendaciones relacionadas con el resultado del IMC y algunas graficas para visualizar mejor la informacion y hacer la aplicacion mas completa.

# d) ¿Que aprendieron de este proyecto que no aprendieron solo leyendo o viendo videos?

Con este proyecto aprendimos mas sobre resolver problemas reales mientras programabamos porque muchas veces aparecian errores que no salen en ejemplos pequeños tambien aprendimos a trabajar mejor en equipo usando gitHub haciendo commits y resolviendo conflictos cuando varias personas modificaban el mismo proyecto muchas cosas se entendieron mejor practicando directamente que solo viendo teoria o videos.
