package com.example.gretingcard

// recordar usar optimize imports
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gretingcard.ui.theme.GretingCardTheme

class MainActivity : ComponentActivity() {
    // punto de entrada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // define el diseño a través de funciones de componibilidad, o sea todas las
        // marcadas con la anotación @Composable
        setContent {
            GretingCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//Cada elemento componible debe tener
// un parámetro opcional del tipo Modifier. Debe ser el primer parámetro opcional.
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Green) {
        Text(
            // rodear text con una Surface, que es un contenedor de la UI donde se
            // puede modificar el aspecto, alt+enter u option+enter,
            // surround with widget -> surround with container
            text = "hola, mi nombre es $name!",
            // modificador padding
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true) // permite vista previa
@Composable
fun GreetingPreview() {
    GretingCardTheme {
        Greeting("Andrés")
    }
}