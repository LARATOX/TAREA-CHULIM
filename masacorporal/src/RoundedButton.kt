import java.awt.*
import javax.swing.JButton

class RoundedButton(text: String) : JButton(text) {

    init {
        isFocusPainted = false
        isContentAreaFilled = false
        foreground = Color.WHITE
        font = Font("Segoe UI", Font.BOLD, 18)
        cursor = Cursor(Cursor.HAND_CURSOR)
    }

    override fun paintComponent(g: Graphics) {

        val g2 = g as Graphics2D

        g2.setRenderingHint(
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        )

        g2.color = Color(79, 70, 229)

        g2.fillRoundRect(
            0,
            0,
            width,
            height,
            35,
            35
        )

        super.paintComponent(g)
    }

    override fun paintBorder(g: Graphics) {

        val g2 = g as Graphics2D

        g2.color = Color(120, 120, 255)

        g2.drawRoundRect(
            0,
            0,
            width - 1,
            height - 1,
            35,
            35
        )
    }
}