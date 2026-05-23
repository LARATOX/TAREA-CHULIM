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

        println("Persona registrada correctamente")
    }

    fun calcularIMC(persona: Persona): Double {

        return persona.peso /
                (persona.estatura * persona.estatura)
    }

    fun mostrarHistorial() {

        if (personas.isEmpty()) {
            println("No hay registros")
            return
        }

        personas.forEach {

            val imc = calcularIMC(it)

            println(
                "${it.nombre} -> IMC: %.2f"
                    .format(imc)
            )
        }
    }

    fun buscarPersona(nombre: String) {

        val resultados = personas.filter {

            it.nombre.contains(
                nombre,
                ignoreCase = true
            )

        }

        resultados.forEach {

            println(
                "${it.nombre} | " +
                        "Peso: ${it.peso} | " +
                        "Estatura: ${it.estatura}"
            )
        }
    }

    fun promedioIMC() {

        if (personas.isEmpty()) {
            println("No hay datos")
            return
        }

        val promedio = personas
            .map {
                calcularIMC(it)
            }
            .average()

        println(
            "Promedio IMC: %.2f"
                .format(promedio)
        )
    }
}