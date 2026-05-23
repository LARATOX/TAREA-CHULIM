import javax.swing.JOptionPane

fun main() {

    val manager = IMCManager()

    var opcion: Int

    do {

        val opcionTexto = JOptionPane.showInputDialog(
            null,
            """
            ===== CALCULADORA IMC =====
            
            1. Registrar persona
            2. Mostrar historial
            3. Buscar persona
            4. Promedio general IMC
            5. Salir
            """.trimIndent(),
            "Calculadora IMC",
            JOptionPane.QUESTION_MESSAGE
        )

        opcion = opcionTexto?.toIntOrNull() ?: 5

        when (opcion) {

            1 -> {

                val nombre =
                    JOptionPane.showInputDialog(
                        null,
                        "Ingrese el nombre:",
                        "Registro de Persona",
                        JOptionPane.QUESTION_MESSAGE
                    )?.takeIf {
                        it.isNotBlank()
                    } ?: "Sin nombre"

                val peso =
                    JOptionPane.showInputDialog(
                        null,
                        "Ingrese el peso (kg):",
                        "Registro de Persona",
                        JOptionPane.QUESTION_MESSAGE
                    )?.toDoubleOrNull() ?: 0.0

                val estatura =
                    JOptionPane.showInputDialog(
                        null,
                        "Ingrese la estatura (m):",
                        "Registro de Persona",
                        JOptionPane.QUESTION_MESSAGE
                    )?.toDoubleOrNull() ?: 0.0

                manager.registrarPersona(
                    nombre,
                    peso,
                    estatura
                )

                JOptionPane.showMessageDialog(
                    null,
                    "Persona registrada correctamente."
                )
            }

            2 -> manager.mostrarHistorial()

            3 -> {

                val nombre = JOptionPane.showInputDialog(
                    null,
                    "Ingrese el nombre a buscar:",
                    "Buscar Persona",
                    JOptionPane.QUESTION_MESSAGE
                ) ?: ""

                manager.buscarPersona(nombre)
            }

            4 -> manager.promedioIMC()

            5 -> {

                JOptionPane.showMessageDialog(
                    null,
                    "Gracias por utilizar la calculadora IMC."
                )
            }

            else -> {

                JOptionPane.showMessageDialog(
                    null,
                    "Opción inválida."
                )
            }
        }

    } while (opcion != 5)
}