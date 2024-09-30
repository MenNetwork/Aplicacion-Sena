package com.mennetwork.vitalmen.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mennetwork.vitalmen.R
import com.mennetwork.vitalmen.ui.theme.Blue10
import com.mennetwork.vitalmen.ui.theme.VitalMenTheme

@Composable
fun LoginScreen(){
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)) {

        Text(text = "!Hola!", fontSize = 25.sp, fontWeight = FontWeight.Bold, color = Color.Red )

        Text(modifier = Modifier.padding(horizontal = 20.dp), text = "Bienvenido a VitalMen, aqui podras mejorar tus habitos")

        Spacer(modifier = Modifier.height(20.dp))

        Button(modifier = Modifier.width(20.dp), colors = ButtonDefaults.buttonColors(Color = Blue10), onClick = { /*TODO*/ }) {
            Text(text = "Ingresar con Email")

        }

        ElevatedButton(onClick = { /*TODO*/ }) {
            Text(text = "Ingresar con Google", color = Color.Black)

        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    VitalMenTheme {
        LoginScreen()
    }
}