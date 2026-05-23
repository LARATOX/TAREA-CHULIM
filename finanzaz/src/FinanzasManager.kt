import javax.swing.JOptionPane

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

        JOptionPane.showMessageDialog(
            null,
            "Movimiento registrado correctamente."
        )
    }

    fun mostrarMovimientos() {

        if (movimientos.isEmpty()) {

            JOptionPane.showMessageDialog(
                null,
                "No existen movimientos registrados."
            )
            return
        }

        val texto = buildString {

            append("===== MOVIMIENTOS =====\n\n")

            movimientos.forEach {

                append(
                    "ID: ${it.id}\n" +
                            "Tipo: ${it.tipo}\n" +
                            "Categoría: ${it.categoria}\n" +
                            "Descripción: ${it.descripcion}\n" +
                            "Monto: $${it.monto}\n\n"
                )
            }
        }

        JOptionPane.showMessageDialog(
            null,
            texto,
            "Lista de Movimientos",
            JOptionPane.INFORMATION_MESSAGE
        )
    }

    fun buscarPorCategoria(categoria: String) {

        val resultados = movimientos.filter {
            it.categoria.equals(categoria, true)
        }

        if (resultados.isEmpty()) {

            JOptionPane.showMessageDialog(
                null,
                "No se encontraron movimientos para la categoría '$categoria'."
            )
            return
        }

        val texto = buildString {

            append("Resultados encontrados:\n\n")

            resultados.forEach {

                append(
                    "${it.tipo} | " +
                            "${it.categoria} | " +
                            "$${it.monto}\n"
                )
            }
        }

        JOptionPane.showMessageDialog(
            null,
            texto,
            "Búsqueda por Categoría",
            JOptionPane.INFORMATION_MESSAGE
        )
    }

    fun mostrarSaldo() {

        val ingresos = movimientos
            .filter { it.tipo == "Ingreso" }
            .sumOf { it.monto }

        val gastos = movimientos
            .filter { it.tipo == "Gasto" }
            .sumOf { it.monto }

        val saldo = ingresos - gastos

        JOptionPane.showMessageDialog(
            null,
            """
            ===== RESUMEN FINANCIERO =====
            
            Total ingresos: $$ingresos
            Total gastos: $$gastos
            
            Saldo actual: $$saldo
            """.trimIndent(),
            "Saldo",
            JOptionPane.INFORMATION_MESSAGE
        )
    }
}