package com.example.snacksquad

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.snacksquad.ui.theme.SpotifyFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OpeningScreen(navController: NavController)
{
    BoxExample2()
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Spacer(modifier = Modifier.height(50.dp))
        Box {
            val image = painterResource(id = R.drawable.snacksicon)
            Image(modifier = Modifier
                .align(Alignment.Center)
                .width(200.dp)
                .height(300.dp), painter = image, contentDescription = null)
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "SNACKSQUAD",
                fontFamily= SpotifyFont,
                fontSize = 45.sp,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Button(
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RectangleShape,
            onClick = {
            navController.navigate(route= Screen.HomeScreen.route)
        },modifier = Modifier.height(50.dp).width(300.dp) )
        {
            Text("LOG-IN",
                fontSize = 16.sp,
                fontFamily = SpotifyFont
            )
        }

        Spacer(modifier = Modifier.height(30.dp))


        Button(
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RectangleShape,
            modifier = Modifier.height(50.dp).width(300.dp) ,
            onClick = {
            navController.navigate(route= Screen.Register.route)
        })
        {
            Text("REGISTER",
                fontSize = 16.sp,
                fontFamily = SpotifyFont
            )
        }
    }
}

@Composable
fun BoxExample2() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg),
                modifier = Modifier.fillMaxSize(),
                contentDescription = "Background Image",
                contentScale = ContentScale.Crop
            )
        }
    }
}