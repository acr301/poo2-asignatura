package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTutorialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = androidx.compose.material3.MaterialTheme.colorScheme.background
                ) {
                    JetpackComposeTutorialText(
                        headingText = stringResource(R.string.heading_text_string_res),
                        subheadingText = stringResource(R.string.subheading_text_string_res),
                        bodyText = stringResource(R.string.body_text_string_res),
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun JetpackComposeImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
}


@Composable
fun JetpackComposeTutorialText(headingText: String, subheadingText: String, bodyText: String, modifier: Modifier) {
    Column(
        modifier = modifier
    ) {
        JetpackComposeImage(
            modifier = Modifier
        )
        Text(
            text = headingText,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        Text(
            text = subheadingText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                    )
        )
        Text(
            text = bodyText,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true, name = "vista previa")
@Composable
fun JetpackComposeTutorialPreview() {
    JetpackComposeTutorialTheme {
        JetpackComposeTutorialText(
            headingText = stringResource(R.string.heading_text_string_res),
            subheadingText = stringResource(R.string.subheading_text_string_res),
            bodyText = stringResource(R.string.body_text_string_res),
            modifier = Modifier
        )
    }
}




