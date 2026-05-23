import javax.swing.JOptionPane

class IMCManager {

    private val personas = mutableListOf<Persona>()

    fun registrarPersona(
        nombre: String,
        peso: Double,
        estatura: Double
    ) {

        personas.add(
            Persona(
                nombre,
                peso,
                estatura
            )
        )

        JOptionPane.showMessageDialog(
            null,
            "Persona registrada correctamente."
        )
    }

    fun calcularIMC(persona: Persona): Double {

        return persona.peso /
                (persona.estatura * persona.estatura)
    }

    fun clasificarIMC(imc: Double): String {

        return when {

            imc < 18.5 -> "Bajo peso"

            imc < 25 -> "Peso normal"

            imc < 30 -> "Sobrepeso"

            else -> "Obesidad"
        }
    }

    fun mostrarHistorial() {

        if (personas.isEmpty()) {

            JOptionPane.showMessageDialog(
                null,
                "No existen registros."
            )
            return
        }

        val texto = buildString {

            append("===== HISTORIAL IMC =====\n\n")

            personas.forEach {

                val imc = calcularIMC(it)

                append(
                    "Nombre: ${it.nombre}\n" +
                            "Peso: ${it.peso} kg\n" +
                            "Estatura: ${it.estatura} m\n" +
                            "IMC: %.2f\n".format(imc) +
                            "Clasificación: ${clasificarIMC(imc)}\n\n"
                )
            }
        }

        JOptionPane.showMessageDialog(
            null,
            texto,
            "Historial de Personas",
            JOptionPane.INFORMATION_MESSAGE
        )
    }

    fun buscarPersona(nombre: String) {

        val resultados = personas.filter {

            it.nombre.contains(
                nombre,
                ignoreCase = true
            )
        }

        if (resultados.isEmpty()) {

            JOptionPane.showMessageDialog(
                null,
                "No se encontraron personas con ese nombre."
            )
            return
        }

        val texto = buildString {

            append("Resultados encontrados:\n\n")

            resultados.forEach {

                val imc = calcularIMC(it)

                append(
                    "Nombre: ${it.nombre}\n" +
                            "Peso: ${it.peso} kg\n" +
                            "Estatura: ${it.estatura} m\n" +
                            "IMC: %.2f\n".format(imc) +
                            "Clasificación: ${clasificarIMC(imc)}\n\n"
                )
            }
        }

        JOptionPane.showMessageDialog(
            null,
            texto,
            "Búsqueda",
            JOptionPane.INFORMATION_MESSAGE
        )
    }

    fun promedioIMC() {

        if (personas.isEmpty()) {

            JOptionPane.showMessageDialog(
                null,
                "No existen registros."
            )
            return
        }

        val promedio = personas
            .map {
                calcularIMC(it)
            }
            .average()

        JOptionPane.showMessageDialog(
            null,
            """
            ===== ESTADÍSTICAS =====
            
            Personas registradas: ${personas.size}
            
            Promedio general IMC:
            %.2f
            """.trimIndent().format(promedio),
            "Promedio IMC",
            JOptionPane.INFORMATION_MESSAGE
        )
    }
}