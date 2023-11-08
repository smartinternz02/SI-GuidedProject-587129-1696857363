@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.snacksquad

import android.graphics.Paint.Align
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.snacksquad.ui.theme.RobotoFont
import com.example.snacksquad.ui.theme.SpotifyFont
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Payment(navController: NavController)
{

    BoxExample5()
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
            text = "PAYMENT",
            fontFamily = SpotifyFont,
            fontSize = 32.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(65.dp))

        val str = ""
        Text(
            text = "Total amount to pay:   70Rs",
            fontFamily = RobotoFont,
            fontSize = 20.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(65.dp))

        Text(
            text = "SELECT PAYMENT METHOD",
            fontFamily = SpotifyFont,
            fontSize = 19.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(35.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.clickable {
            },
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {

                Image(
                    painter = painterResource(id = R.drawable.visa),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(10.dp)
                        .fillMaxWidth()
                )

                Text(text = "VISA",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }

        }
        Spacer(modifier = Modifier.height(25.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.clickable {
            },
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Image(
                    painter = painterResource(id = R.drawable.mastca),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(10.dp)
                        .fillMaxWidth()
                )

                Text(text = "MasterCard",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }

        }
        Spacer(modifier = Modifier.height(25.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .clickable {

            },

            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Image(
                    painter = painterResource(id = R.drawable.upi),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(10.dp)
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(25.dp))

                Text(text = "UPI",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }

        }
        Spacer(modifier = Modifier.height(35.dp))

        Card(
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier.clickable {
            },
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
        )
        {

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
            {
                Image(
                    painter = painterResource(id = R.drawable.cod),
                    contentDescription = null,
                    contentScale = ContentScale.FillHeight,
                    modifier = Modifier
                        .size(80.dp)
                        .padding(10.dp)
                        .fillMaxWidth()
                )

                Text(text = "Cash on Delivery",
                    fontSize = 20.sp,
                    fontFamily= SpotifyFont,
                    fontWeight = FontWeight.W500,
                    modifier = Modifier
                        .padding(10.dp)
                )
            }

        }
        Spacer(modifier = Modifier.height(25.dp))

        OutlinedButton(

            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            onClick = {
                navController.navigate(route= Screen.HomeScreen.route)
            }
        )
        {
            Text("PAY",
                modifier=Modifier.padding(2.dp),
                fontFamily= RobotoFont,
                fontSize = 20.sp,
                color = Color.Black)
        }
    }
}
