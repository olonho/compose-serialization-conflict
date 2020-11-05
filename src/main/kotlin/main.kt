import androidx.compose.desktop.*
import androidx.compose.ui.unit.*
import kotlinx.serialization.*

@Serializable
data class Test(val a: Int)

fun main() {
    Window(
        title = "Compose",
        size = IntSize(440, 700)
    ) {
    }
}
