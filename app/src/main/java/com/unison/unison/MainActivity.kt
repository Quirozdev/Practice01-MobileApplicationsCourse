package com.unison.unison

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.unison.unison.ui.theme.UnisonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UnisonTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun App(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = modifier.fillMaxSize()) {
        Header()
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(horizontalArrangement = Arrangement.Center) {
        Logo()
        Column {
            HeaderText(text = "Universidad de Sonora")
            HeaderText(text = "Departamento de Ingeniería Industrial")
        }
    }
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.logo_unison), contentDescription = "Logo Unison", modifier = modifier.width(100.dp))
}

@Composable
fun HeaderText(text: String, modifier: Modifier = Modifier) {
    Text(text = text, fontSize = 35.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
}

@Composable
fun UnisonButton(text: String, modifier: Modifier = Modifier) {
    Button(onClick = { /*TODO*/ },
        colors = ButtonColors(
            containerColor = colorResource(id = R.color.unison_azul),
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.LightGray
        )
    ) {
        Text(text = text)
    }
}