enum class CategoriaGastos(private val texto: String) {
    Transporte("Transporte"),
    Comida("Comida"),
    Renta("Renta"),
    Pago_Servicios("Pago de Servicios Basicos (Luz, Agua, Internet ...)"),
    Suscripcion_Plataforma("Suscripcion Plataforma (Spotify, Netflix, ChatGPT ...)"),
    Ropa("Ropa"),
    Pago_Colegiatura("Pago de Colegiatura"),
    Emergencia_Medica("Emergencia Medica");

    override fun toString(): String {
        return texto
    }
}