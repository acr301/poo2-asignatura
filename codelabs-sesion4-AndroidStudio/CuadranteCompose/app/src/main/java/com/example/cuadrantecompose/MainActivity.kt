package com.example.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CuadranteComposeTheme {

                // { innerPadding -> } es sintaxis "Trailing Lambda"
                // Surface es visual, Scaffold es estructural
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // ese inner padding crea la "safe-zone" para el contenido
                    // en la UI del celular
                    FourQuadrants(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// layout es una columna con dos filas dentro
@Composable
fun FourQuadrants(modifier: Modifier = Modifier) {
    // columna raiz toma modificador que ocupa completo el tamaño de la pantalla
    Column(modifier = modifier.fillMaxSize()) {
        // el weight que se pasa a Row es para la altura 1:1
        Row(Modifier.weight(1f)) {
            SingleQuadrant(
                title = stringResource(R.string.q1_title),
                body = stringResource(R.string.q1_body),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f) // para compartir ancho 1:1
            )
            SingleQuadrant(
                title = stringResource(R.string.q2_title),
                body = stringResource(R.string.q2_body),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            SingleQuadrant(
                title = stringResource(R.string.q3_title),
                body = stringResource(R.string.q3_body),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            SingleQuadrant(
                title = stringResource(R.string.q4_title),
                body = stringResource(R.string.q4_body),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun SingleQuadrant(
    title: String,
    body: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    // donde Column = 1 cuadrante (porque es un titulo sobre un cuerpo)
    // le pasamos el modifier, fondo(para el color) y alineamiento
    Column(
        modifier = modifier
            .background(backgroundColor)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FourQuadrantsPreview() {
    CuadranteComposeTheme {
        FourQuadrants()
    }
}
