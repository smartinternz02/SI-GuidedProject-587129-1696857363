package com.example.snacksquad

import android.widget.Toast
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
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.snacksquad.R
import com.example.snacksquad.Screen
import com.example.snacksquad.ui.theme.SpotifyFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Register(navController: NavController)
{
    BoxExample3()
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Spacer(modifier = Modifier.height(60.dp))
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        Text(
            text = "SNACKSQUAD",
            fontFamily= SpotifyFont,
            fontSize = 45.sp,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(80.dp))

        OutlinedTextField(
            label = { Text("Enter Full Name", fontFamily = SpotifyFont) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            value = fullname,
            onValueChange = { newFullname -> fullname = newFullname },
        )

        OutlinedTextField(
            label = { Text("Enter Email", fontFamily = SpotifyFont) },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Done
            ),
            value = username,
            onValueChange = { newUsername -> username = newUsername },
        )

        OutlinedTextField(
            label = { Text("Enter Password", fontFamily = SpotifyFont) },
            value = password,
            visualTransformation = PasswordVisualTransformation(),
            onValueChange = { newPassword -> password = newPassword },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            )
        )

        Spacer(modifier = Modifier.height(30.dp))

        Button(modifier=Modifier.width(250.dp),
            onClick = {
            Toast.makeText(context, "Account created successfully!", Toast.LENGTH_SHORT).show()
            })
        {
            Text("Register",
                fontFamily = SpotifyFont
            )
        }

        Spacer(modifier = Modifier.height(200.dp))

        Button(
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RectangleShape,
            onClick = {
            navController.navigate(route= Screen.HomeScreen.route)
        })
        {
            Text("Return to Log-In ",
                fontFamily = SpotifyFont
            )
        }

        Spacer(modifier = Modifier.height(40.dp))


    }
}

@Composable
fun BoxExample3() {
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
