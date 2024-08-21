package com.artgallery.artspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.artgallery.artspace.ui.theme.ArtSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ArtSpaceTheme {
                ArtGallery()
            }
        }
    }
}

@Composable
fun ArtGallery(
    modifier: Modifier = Modifier


) {
    var index by remember {mutableStateOf(0)}

    val images = listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5

    )

    val textsName = listOf(
        R.string.text1,
        R.string.text2,
        R.string.text3,
        R.string.text4,
        R.string.text5

    )

    val textsAuth = listOf(
        R.string.auth1,
        R.string.auth2,
        R.string.auth3,
        R.string.auth4,
        R.string.auth5
    )

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 40.dp)
    ) {
       Card(
           modifier = Modifier
               .padding(8.dp)
               .width(350.dp)
               .height(450.dp),
           elevation = CardDefaults.cardElevation(10.dp),
           colors = CardDefaults.cardColors(
               containerColor = Color.White
           )
       ) {
           Column {
               Image(painter = painterResource(id = images[index]),
                   contentDescription = "null",
                   modifier = Modifier
                       .padding(18.dp)
                       .fillMaxSize()
               )

           }
       }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 50.dp,
                    bottom = 20.dp,
                    start = 10.dp,
                    end = 10.dp
                )
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = stringResource(id = textsName[index]),
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(6.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Text(
                text = stringResource(id = textsAuth[index]),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(6.dp)
                    .align(Alignment.CenterHorizontally)
                )
        }

        Row(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Button(
                onClick = {
                    index = if (index > 0) index - 1 else images.size - 1
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(140.dp)
                ) {
                Text(
                    text = "Previous"
                )
            }
            
            Spacer(modifier = Modifier.width(20.dp))

            Button(
                onClick = {
                    index = (index + 1) % textsName.size
                },
                modifier = Modifier
                    .height(50.dp)
                    .width(140.dp)
            ) {
                Text(text = "Next")
            }
        }
    }


}

@Preview
@Composable
private fun ArtGalleryPreview() {
    ArtGallery()

}

