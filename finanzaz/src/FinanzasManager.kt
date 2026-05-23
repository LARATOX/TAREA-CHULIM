class FinanzasManager {

    private val movimientos = mutableListOf<Movimiento>()

    fun agregarMovimiento(
        tipo: String,
        categoria: String,
        descripcion: String?,
        monto: Double
    ) {

        val id = movimientos.size + 1

        movimientos.add(
            Movimiento(
                id,
                tipo,
                categoria,
                descripcion,
                monto
            )
        )

        println("Movimiento registrado correctamente")
    }

    fun mostrarMovimientos() {

        if (movimientos.isEmpty()) {
            println("No existen movimientos registrados")
            return
        }

        println("\n===== MOVIMIENTOS =====")

        movimientos.forEach {
            println(
                "ID: ${it.id} | " +
                        "Tipo: ${it.tipo} | " +
                        "Categoría: ${it.categoria} | " +
                        "Monto: $${it.monto}"
            )
        }
    }

    fun buscarPorCategoria(categoria: String) {

        val resultados = movimientos.filter {
            it.categoria.equals(categoria, true)
        }

        if (resultados.isEmpty()) {
            println("No se encontraron movimientos")
            return
        }

        resultados.forEach {
            println(
                "${it.tipo} - ${it.categoria} - $${it.monto}"
            )
        }
    }

    fun mostrarSaldo() {

        val ingresos = movimientos
            .filter { it.tipo == "Ingreso" }
            .sumOf { it.monto }

        val gastos = movimientos
            .filter { it.tipo == "Gasto" }
            .sumOf { it.monto }

        println("\nSaldo actual: $${ingresos - gastos}")
    }
}