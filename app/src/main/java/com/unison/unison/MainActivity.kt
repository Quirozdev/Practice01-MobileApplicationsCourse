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
import androidx.compose.foundation.layout.fillMaxWidth
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
fun App(modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround, modifier = modifier
        .fillMaxSize()
        .then(Modifier.padding(24.dp))) {
        Header()
        SumText()
        ButtonGroup()
        Credits()
    }
}

@Preview
@Composable
fun AppPreview() {
    App()
}

@Composable
fun Header() {
    Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
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
fun HeaderText(text: String) {
    Text(text = text, fontSize = 32.sp, textAlign = TextAlign.Center, fontWeight = FontWeight.Bold)
}

@Composable
fun SumText() {
    Text(text = "10 + 20", fontSize = 24.sp, textAlign = TextAlign.Center)
}

@Composable
fun UnisonButton(text: String) {
    Button(onClick = { /*TODO*/ },
        colors = ButtonColors(
            containerColor = colorResource(id = R.color.unison_azul),
            contentColor = Color.White,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.LightGray
        ),
        modifier = Modifier.fillMaxWidth(),
    ) {
        Text(text = text)
    }
}

@Composable
fun ButtonGroup() {
    Column {
        UnisonButton(text = "30")
        UnisonButton(text = "25")
        UnisonButton(text = "40")
    }
}

@Composable
fun Credits() {
    Text(text = "Luis Daniel Quiroz Osuna", fontSize = 16.sp)
}