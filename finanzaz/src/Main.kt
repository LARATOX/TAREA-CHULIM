fun main() {

    val manager = FinanzasManager()

    var opcion: Int

    do {

        println("\n===== FINANZAS PERSONALES =====")
        println("1. Registrar ingreso")
        println("2. Registrar gasto")
        println("3. Mostrar movimientos")
        println("4. Buscar por categoría")
        println("5. Mostrar saldo")
        println("6. Salir")

        print("Seleccione una opción: ")

        opcion = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcion) {

            1 -> {

                print("Categoría: ")
                val categoria = readln()

                print("Descripción: ")
                val descripcion =
                    readlnOrNull()?.takeIf {
                        it.isNotBlank()
                    } ?: "Sin descripción"

                print("Monto: ")
                val monto =
                    readlnOrNull()?.toDoubleOrNull() ?: 0.0

                manager.agregarMovimiento(
                    "Ingreso",
                    categoria,
                    descripcion,
                    monto
                )
            }

            2 -> {

                print("Categoría: ")
                val categoria = readln()

                print("Descripción: ")
                val descripcion =
                    readlnOrNull()?.takeIf {
                        it.isNotBlank()
                    } ?: "Sin descripción"

                print("Monto: ")
                val monto =
                    readlnOrNull()?.toDoubleOrNull() ?: 0.0

                manager.agregarMovimiento(
                    "Gasto",
                    categoria,
                    descripcion,
                    monto
                )
            }

            3 -> manager.mostrarMovimientos()

            4 -> {

                print("Categoría a buscar: ")
                val categoria = readln()

                manager.buscarPorCategoria(categoria)
            }

            5 -> manager.mostrarSaldo()

            6 -> println("Gracias por utilizar el sistema")

            else -> println("Opción inválida")
        }

    } while (opcion != 6)
}