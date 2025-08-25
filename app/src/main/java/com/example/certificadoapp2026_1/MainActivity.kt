package com.example.certificadoapp2026_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificadoapp2026_1.ui.theme.CertificadoApp20261Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CertificadoApp20261Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        name = "Android",
                        hours = 5,
                        course = "Android Development",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(
    name: String,
    hours: Int,
    course: String,
    modifier: Modifier = Modifier)
{
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically

        ) {
            Image(
                painter =
                    painterResource(
                        id = R.drawable.escudounam

                    ),
                contentDescription = null,
                modifier = modifier.size(50.dp),

                )

            Text(
                text = "Departamento de programación"
            )
            Image(
                painter =
                    painterResource(
                        id = R.drawable.escudofi_azul

                    ),
                contentDescription = null,
                modifier = modifier.size(50.dp),

                )


        }
        Text(
            text = "This certificate is presented to:"
        )
        Box(
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter =
                    painterResource(
                        id = R.drawable.android_certificate

                    ),
                contentDescription = null,
                modifier = modifier.fillMaxWidth(),
                alpha = 0.1F
            )
            Text(
                text = name,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        Spacer(

            modifier = modifier.height(10.dp)
        )
        Text(
            text = "has succesfully completed $hours hours course on"
        )
        Text(
            text = course,
            fontSize = 25.sp,
            modifier = modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(

            modifier = modifier.height(20.dp)
        )
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.firma1),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(
                    text = "Isabela García Ruiz",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = R.drawable.firma2),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )
                Text(
                    text = "Raúl Juárez García",
                    fontSize = 15.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CertificadoApp20261Theme {
        CertificatingCourse("Alejandro Ortiz Quintana", hours = 14, course = "Android" )

    }
}