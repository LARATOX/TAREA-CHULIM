import java.awt.*
import javax.swing.*
import javax.swing.border.EmptyBorder

class IMCUI : JFrame() {

    private val manager = IMCManager()

    init {

        title = "⚕️ Calculadora IMC"

        size = Dimension(1000, 700)

        defaultCloseOperation = EXIT_ON_CLOSE

        setLocationRelativeTo(null)

        contentPane.background =
            Color(
                30,
                41,
                59
            )

        val principal = JPanel()

        principal.layout =
            BorderLayout()

        principal.background =
            Color(
                30,
                41,
                59
            )

        principal.border =
            EmptyBorder(
                20,
                20,
                20,
                20
            )

        val titulo =
            JLabel(
                "⚕️ CALCULADORA IMC"
            )

        titulo.font =
            Font(
                "Segoe UI",
                Font.BOLD,
                32
            )

        titulo.foreground =
            Color.WHITE

        titulo.horizontalAlignment =
            SwingConstants.CENTER

        principal.add(
            titulo,
            BorderLayout.NORTH
        )

        val panelBotones =
            JPanel()

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
            crearBoton("👤 Registrar persona")
        )

        panelBotones.add(
            crearBoton("📋 Historial")
        )

        panelBotones.add(
            crearBoton("🔎 Buscar persona")
        )

        panelBotones.add(
            crearBoton("📊 Promedio IMC")
        )

        panelBotones.add(
            crearBoton("ℹ️ Acerca de")
        )

        panelBotones.add(
            crearBoton("🚪 Salir")
        )

        principal.add(
            panelBotones,
            BorderLayout.CENTER
        )

        add(principal)

        isVisible = true
    }

    private fun crearBoton(texto: String): JButton {

        val boton =
            RoundedButton(texto)

        boton.addActionListener {

            when (texto) {

                "👤 Registrar persona" ->
                    registrarPersona()

                "📋 Historial" ->
                    manager.mostrarHistorial()

                "🔎 Buscar persona" ->
                    buscarPersona()

                "📊 Promedio IMC" ->
                    manager.promedioIMC()

                "ℹ️ Acerca de" ->
                    JOptionPane.showMessageDialog(
                        this,
                        "Calculadora de Índice de Masa Corporal"
                    )

                "🚪 Salir" ->
                    dispose()
            }
        }

        return boton
    }

    private fun registrarPersona() {

        val nombre =
            JOptionPane.showInputDialog(
                this,
                "👤 Nombre:"
            ) ?: return

        val peso =
            JOptionPane.showInputDialog(
                this,
                "⚖️ Peso (kg):"
            )?.toDoubleOrNull()

        val estatura =
            JOptionPane.showInputDialog(
                this,
                "📏 Estatura (m):"
            )?.toDoubleOrNull()

        if (
            peso == null ||
            estatura == null
        ) {

            JOptionPane.showMessageDialog(
                this,
                "Datos inválidos."
            )

            return
        }

        manager.registrarPersona(
            nombre,
            peso,
            estatura
        )
    }

    private fun buscarPersona() {

        val nombre =
            JOptionPane.showInputDialog(
                this,
                "🔎 Nombre:"
            ) ?: return

        manager.buscarPersona(nombre)
    }
}