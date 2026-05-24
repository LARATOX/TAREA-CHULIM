import java.awt.*
import javax.swing.*
import javax.swing.border.EmptyBorder

class FinanzasUI : JFrame() {

    private val manager = FinanzasManager()

    init {

        title = "💰 Control Financiero"
        size = Dimension(1000, 700)

        defaultCloseOperation = EXIT_ON_CLOSE

        setLocationRelativeTo(null)

        contentPane.background = Color(30, 41, 59)

        val panelPrincipal = JPanel()
        panelPrincipal.layout = BorderLayout()
        panelPrincipal.background = Color(30, 41, 59)
        panelPrincipal.border = EmptyBorder(20, 20, 20, 20)

        val titulo = JLabel("💰 CONTROL FINANCIERO")
        titulo.font = Font("Segoe UI", Font.BOLD, 32)
        titulo.foreground = Color.WHITE
        titulo.horizontalAlignment = SwingConstants.CENTER

        panelPrincipal.add(
            titulo,
            BorderLayout.NORTH
        )

        val panelBotones = JPanel()

        panelBotones.layout =
            GridLayout(
                3,
                2,
                25,
                25
            )

        panelBotones.background =
            Color(
                30,
                41,
                59
            )

        panelBotones.border =
            EmptyBorder(
                25,
                0,
                0,
                0
            )

        panelBotones.add(
            crearBoton("📈 Registrar ingreso")
        )

        panelBotones.add(
            crearBoton("📉 Registrar gasto")
        )

        panelBotones.add(
            crearBoton("📋 Ver movimientos")
        )

        panelBotones.add(
            crearBoton("🔎 Buscar categoría")
        )

        panelBotones.add(
            crearBoton("💵 Ver saldo")
        )

        panelBotones.add(
            crearBoton("🚪 Salir")
        )

        panelPrincipal.add(
            panelBotones,
            BorderLayout.CENTER
        )

        add(panelPrincipal)

        isVisible = true
    }

    private fun crearBoton(
        texto: String
    ): JButton {

        val boton = JButton(texto)

        boton.font =
            Font(
                "Segoe UI",
                Font.BOLD,
                18
            )

        boton.background =
            Color(
                79,
                70,
                229
            )

        boton.foreground =
            Color.WHITE

        boton.isFocusPainted = false

        boton.addActionListener {

            when (texto) {

                "📈 Registrar ingreso" ->
                    registrarIngreso()

                "📉 Registrar gasto" ->
                    registrarGasto()

                "📋 Ver movimientos" ->
                    manager.mostrarMovimientos()

                "🔎 Buscar categoría" ->
                    buscarCategoria()

                "💵 Ver saldo" ->
                    manager.mostrarSaldo()

                "🚪 Salir" ->
                    dispose()
            }
        }

        return boton
    }

    private fun registrarIngreso() {

        val categoriaSeleccionada =
            JOptionPane.showInputDialog(
                this,
                "Seleccione la categoría:",
                "Nuevo Ingreso",
                JOptionPane.QUESTION_MESSAGE,
                null,
                CategoriaIngresos.values(),
                CategoriaIngresos.values().first()
            ) as? CategoriaIngresos ?: return

        val descripcion =
            JOptionPane.showInputDialog(
                this,
                "📝 Descripción:"
            ) ?: "Sin descripción"

        val monto =
            JOptionPane.showInputDialog(
                this,
                "💵 Monto:"
            )?.toDoubleOrNull()

        if (
            monto == null ||
            monto <= 0
        ) {

            JOptionPane.showMessageDialog(
                this,
                "Monto inválido."
            )

            return
        }

        manager.agregarMovimiento(
            "Ingreso",
            categoriaSeleccionada.name,
            descripcion,
            monto
        )
    }

    private fun registrarGasto() {

        val categoriaSeleccionada =
            JOptionPane.showInputDialog(
                this,
                "Seleccione la categoría:",
                "Nuevo Gasto",
                JOptionPane.QUESTION_MESSAGE,
                null,
                CategoriaGastos.values(),
                CategoriaGastos.values().first()
            ) as? CategoriaGastos ?: return

        val descripcion =
            JOptionPane.showInputDialog(
                this,
                "📝 Descripción:"
            ) ?: "Sin descripción"

        val monto =
            JOptionPane.showInputDialog(
                this,
                "💵 Monto:"
            )?.toDoubleOrNull()

        if (
            monto == null ||
            monto <= 0
        ) {

            JOptionPane.showMessageDialog(
                this,
                "Monto inválido."
            )

            return
        }

        manager.agregarMovimiento(
            "Gasto",
            categoriaSeleccionada.name,
            descripcion,
            monto
        )
    }

    private fun buscarCategoria() {

        val opciones =
            arrayOf(
                "Ingresos",
                "Gastos"
            )

        val tipo =
            JOptionPane.showInputDialog(
                this,
                "Seleccione el tipo:",
                "Buscar Categoría",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones.first()
            )?.toString() ?: return

        val categoria =
            if (tipo == "Ingresos") {

                JOptionPane.showInputDialog(
                    this,
                    "Seleccione la categoría:",
                    "Buscar",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    CategoriaIngresos.values(),
                    CategoriaIngresos.values().first()
                )

            } else {

                JOptionPane.showInputDialog(
                    this,
                    "Seleccione la categoría:",
                    "Buscar",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    CategoriaGastos.values(),
                    CategoriaGastos.values().first()
                )
            }

        if (categoria != null) {

            manager.buscarPorCategoria(
                categoria.toString()
            )
        }
    }
}