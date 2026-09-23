package com.example.app_lima_diguital.presentacion.screens.detalle

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Edit // <-- 1. Importación que faltaba
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetalleScreen() {
    val colorAzulMedio = Color(0xFF3823AB)
    val colorAzulOscuro = Color(0xFF101140)
    val colorGris = Color(0xFF7D7F99)
    val colorGrisOscuro = Color(0xFF555B6E)
    val colorVerde = Color(0xFF00A86B)
    val colorRojo = Color(0xFFB3261E)
    val colorFondo = Color(0xFFF7F7FD)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorFondo)
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            shape = RoundedCornerShape(16.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            modifier = Modifier.size(width = 180.dp, height = 240.dp)
        ) {
            Image(
                painter = painterResource(id = com.example.app_lima_diguital.R.drawable.limadiguital),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Spacer(modifier = Modifier.height(12.dp)) // Cambiado de width a height para espaciado vertical

        // 3. Título y Autor
        Text(
            text = "Lima Digital",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = colorAzulOscuro
        )

        Spacer(modifier = Modifier.height(6.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Outlined.Edit,
                contentDescription = null,
                tint = colorAzulMedio,
                modifier = Modifier.size(14.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = "Gabriel García Márquez", // <-- 2. Texto del autor agregado
                fontSize = 14.sp,
                color = colorGrisOscuro,
                fontWeight = FontWeight.Medium
            )
        }
    }
}