@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.snacksquad

import android.graphics.Paint.Align
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.snacksquad.ui.theme.RobotoFont
import com.example.snacksquad.ui.theme.SpotifyFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cart(navController: NavController)
{
    BoxExample5()
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            modifier = Modifier.padding(30.dp),
            text = "YOUR CART",
            fontFamily = SpotifyFont,
            fontSize = 32.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(40.dp))

        Card()
        {
        }

        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Text(text = "Vegetable Cutlet",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp))
            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(20.dp),

            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Text(text = "Vada Pav",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp))
            }

        }

        OutlinedButton(

            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            onClick = {
                    navController.navigate(route= Screen.Payment.route)
            }
        )
        {
            Text("PROCEED TO PAYMENT",
                modifier=Modifier.padding(2.dp),
                fontFamily= RobotoFont,
                fontSize = 20.sp,
                color = Color.Black)
        }
    }
}

@Composable
fun BoxExample5() {
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

