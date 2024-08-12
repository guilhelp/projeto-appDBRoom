package com.example.aulaprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aulaprojeto.ui.theme.AulaProjetoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    var nome by remember {
        mutableStateOf( "")
    }
    var telefone by remember {
        mutableStateOf("")
    }

    Column(
        Modifier.background(Color.Black)
    ) {
        Row( Modifier.padding(20.dp) ){

        }
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            Text(
                text= "App DataBase",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        }
        Row(Modifier.padding(20.dp)) {

        }
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            TextField(
                value = nome,
                onValueChange = {nome = it},
                label = {Text("Nome:")}
            )
        }
        Row(Modifier.padding(20.dp)) {

        }
        Row(Modifier.fillMaxWidth(), Arrangement.Center) {
            TextField(
                value = telefone,
                onValueChange = {telefone = it},
                label = { Text("Telefone:") }
            )
        }
        Row(Modifier.padding(20.dp)) {

        }
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Button(onClick = {

            }) {
                Text("Cadastrar")
            }
        }
        Row(Modifier.padding(20.dp)) {}
    }
}


@Preview
@Composable
fun AppPreview() {
    AulaProjetoTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            App()
        }
    }
}