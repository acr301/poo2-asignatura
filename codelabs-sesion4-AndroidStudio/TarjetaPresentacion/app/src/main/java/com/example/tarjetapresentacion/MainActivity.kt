package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TarjetaPresentacionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PresentationCard(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun PresentationCardImage(modifier: Modifier = Modifier){
    Image(
        painter = painterResource(R.drawable.android_logo),
        contentDescription = "android logo"
    )
}

@Composable
fun PresentationCard(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF073042))
            .padding(bottom = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.weight(1f) // esto hace que la ésta columna agarre el espacio de arriba completo
        ) {
            PresentationCardImage()
            MainInfo("Andrés", "POO II")
        }
        ContactInfo("github.com/acr301", "acrothschuh@uamv.edu.ni")
    }
}

@Composable
fun MainInfo(personName: String, personTitle: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = personName,
            fontWeight = Bold,
            fontSize = 48.sp,
            color = Color.White,
            modifier = Modifier.padding(bottom = 8.dp),
        )
        Text(
            text = personTitle,
            color = Color.White,

            )

    }
}

@Composable
fun ContactInfo(githubLink: String, institutionalEmail: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        ContactUnit("commit icon for github link", R.drawable.commit_24px, githubLink)
        ContactUnit("mail icon for institutional email address", R.drawable.mail_24px, institutionalEmail)
    }
}

@Composable
fun ContactUnit(contentDescriptionText: String, iconResource: Int, contactText: String, modifier: Modifier = Modifier){
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.padding(8.dp)
    ) {
        Icon(
            modifier = Modifier.padding(end = 16.dp), // modifier fresco solo para el espacio interno del icono
            painter = painterResource(iconResource),
            tint = Color(0xFF3ddc84),
            contentDescription = null,
        )
        Text(
            text = contactText,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PresentationCardPreview() {
    TarjetaPresentacionTheme {
        PresentationCard(modifier = Modifier)
    }
}
