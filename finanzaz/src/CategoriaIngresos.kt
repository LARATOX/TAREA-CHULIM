//Define la categorias posible para los ingresos y gastos
enum class CategoriaIngresos(val texto: String) {
    Mesada("Mesada"),
    Beca("Beca"),
    Sueldo("Sueldo Recibido"),
    Venta_de_servicio("Venta de servicios"),
    Venta_de_bienes("Venta de Bienes");

    override fun toString(): String {
        return texto
    }
}
