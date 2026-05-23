fun main() {

    val manager = IMCManager()

    var opcion: Int

    do {

        println("\n===== CALCULADORA IMC =====")
        println("1. Registrar persona")
        println("2. Mostrar historial")
        println("3. Buscar persona")
        println("4. Promedio general IMC")
        println("5. Salir")

        print("Seleccione una opción: ")

        opcion =
            readlnOrNull()
                ?.toIntOrNull()
                ?: 0

        when (opcion) {

            1 -> {

                print("Nombre: ")
                val nombre =
                    readlnOrNull()
                        ?.takeIf {
                            it.isNotBlank()
                        }
                        ?: "Sin nombre"

                print("Peso (kg): ")
                val peso =
                    readlnOrNull()
                        ?.toDoubleOrNull()
                        ?: 0.0

                print("Estatura (m): ")
                val estatura =
                    readlnOrNull()
                        ?.toDoubleOrNull()
                        ?: 0.0

                manager.registrarPersona(
                    nombre,
                    peso,
                    estatura
                )
            }

            2 -> manager.mostrarHistorial()

            3 -> {

                print("Nombre a buscar: ")

                val nombre = readln()

                manager.buscarPersona(nombre)
            }

            4 -> manager.promedioIMC()

            5 -> println("Hasta luego")

            else -> println("Opción inválida")
        }

    } while (opcion != 5)
}