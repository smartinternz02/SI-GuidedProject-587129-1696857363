@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.snacksquad

//21bce7618//
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
fun Snacks(navController: NavController)
{
    BoxExample4()
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
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "POPULAR SNACKS",
            fontFamily= SpotifyFont,
            fontSize = 32.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedButton(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = {
                navController.navigate(route= Screen.Cart.route)
            }
        )
        {
            Text("CHECK YOUR CART",
                fontFamily= RobotoFont,
                color = Color.Black)
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            modifier = Modifier.clickable {
                var a = "Vegetable Cutlet"
                Toast.makeText(context,"Added to cart!",Toast.LENGTH_SHORT).show()
            }
        )
        {
            Image(
                painter = painterResource(id = R.drawable.vegcut),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(170.dp)
                    .padding(10.dp)
                    .fillMaxWidth()
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Text(text = "Vegetable Cutlet       40Rs",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                )
            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            modifier = Modifier.clickable {
                var b = "Onion Bhaji"
                Toast.makeText(context,"Added to cart!",Toast.LENGTH_SHORT).show()
            }
        )
        {
            Image(
                painter = painterResource(id = R.drawable.onionbhaj),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Text(text = "Onion Bhaji                        15Rs",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                )
            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.clickable {
                var c = "Dahi Vada"
                Toast.makeText(context,"Added to cart!",Toast.LENGTH_SHORT).show()
            },
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.dahivada),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .height(200.dp)
                    .padding(10.dp)
                    .fillMaxWidth()
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Text(text = "Dahi Vada             40Rs",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                )
            }

        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.clickable {
                var d = "Vada Pav"
                Toast.makeText(context,"Added to cart!",Toast.LENGTH_SHORT).show()
            },
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {
            Image(
                painter = painterResource(id = R.drawable.vadapav),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
                    .fillMaxWidth()
            )
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Text(text = "Vada Pav             30Rs",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                        .align(alignment = Alignment.CenterHorizontally),
                )
            }

        }

        Spacer(modifier = Modifier.height(30.dp))

        Button(
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RectangleShape,
            onClick = {
            navController.navigate(route=Screen.HomeScreen.route)
        })
        {
            Text(text = "LOG OUT",
                fontSize = 15.sp,
                fontFamily= SpotifyFont,
                fontWeight = FontWeight.W500,
                modifier = Modifier.padding(1.dp),
            )
        }
    }
}

@Composable
fun BoxExample4() {
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


