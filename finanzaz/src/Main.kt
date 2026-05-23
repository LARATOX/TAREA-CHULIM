import javax.swing.JOptionPane

fun main() {

    val manager = FinanzasManager()

    var opcion: Int

    do {

        val opcionTexto = JOptionPane.showInputDialog(
            null,
            """
            ===== FINANZAS PERSONALES =====
            
            1. Registrar ingreso
            2. Registrar gasto
            3. Mostrar movimientos
            4. Buscar por categoría
            5. Mostrar saldo
            6. Salir
            """.trimIndent(),
            "Menú Principal",
            JOptionPane.QUESTION_MESSAGE
        )

        opcion = opcionTexto?.toIntOrNull() ?: 6

        when (opcion) {

            1 -> {

                val categoriaSeleccionada = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la categoría:",
                    "Nuevo Ingreso",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    CategoriaIngresos.values(),
                    CategoriaIngresos.values().first()
                ) as? CategoriaIngresos

                if (categoriaSeleccionada == null) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Registro de ingreso cancelado."
                    )
                    continue
                }

                val categoria = categoriaSeleccionada.name

                val descripcion = JOptionPane.showInputDialog(
                    null,
                    "Ingrese la descripción:",
                    "Nuevo Ingreso",
                    JOptionPane.QUESTION_MESSAGE
                )?.takeIf { //Aqui se uso el NULL Safety con ?. para validacion de la "Descripción"
                    it.isNotBlank()
                } ?: "Sin descripción" //Uso de Elvis Operator

                val monto = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el monto:",
                    "Nuevo Ingreso",
                    JOptionPane.QUESTION_MESSAGE
                )?.toDoubleOrNull() ?: 0.0 //Aqui se uso el NULL Safety con "?." para validacion del "Monto"

                manager.agregarMovimiento(
                    "Ingreso",
                    categoria,
                    descripcion,
                    monto
                )

                JOptionPane.showMessageDialog(
                    null,
                    "Ingreso registrado correctamente."
                )
            }

            2 -> {

                val categoriaSeleccionada = JOptionPane.showInputDialog(
                    null,
                    "Seleccione la categoría:",
                    "Nuevo Gasto",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    CategoriaGastos.values(),
                    CategoriaGastos.values().first()
                ) as? CategoriaIngresos

                if (categoriaSeleccionada == null) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Registro de ingreso cancelado."
                    )
                    continue
                }

                val categoria = categoriaSeleccionada.name

                val descripcion = JOptionPane.showInputDialog(
                    null,
                    "Ingrese la descripción:",
                    "Nuevo Gasto",
                    JOptionPane.QUESTION_MESSAGE
                )?.takeIf {
                    it.isNotBlank()
                } ?: "Sin descripción"

                val monto = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el monto:",
                    "Nuevo Gasto",
                    JOptionPane.QUESTION_MESSAGE
                )?.toDoubleOrNull() ?: 0.0

                manager.agregarMovimiento(
                    "Gasto",
                    categoria,
                    descripcion,
                    monto
                )

                JOptionPane.showMessageDialog(
                    null,
                    "Gasto registrado correctamente."
                )
            }

            3 -> {
                manager.mostrarMovimientos()
            }

            4 -> {

                val categoria = JOptionPane.showInputDialog(
                    null,
                    "Ingrese la categoría a buscar:",
                    "Buscar Categoría",
                    JOptionPane.QUESTION_MESSAGE
                ) ?: ""

                manager.buscarPorCategoria(categoria)
            }

            5 -> {
                manager.mostrarSaldo()
            }

            6 -> {

                JOptionPane.showMessageDialog(
                    null,
                    "Gracias por utilizar el sistema."
                )
            }

            else -> {

                JOptionPane.showMessageDialog(
                    null,
                    "Opción inválida, ingrse un valor valido ."
                )
            }
        }

    } while (opcion != 6)
}
