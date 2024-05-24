package com.example.flagschallange.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.example.flagschallange.R
import com.example.flagschallange.ui.theme.AppColor

@Composable
fun QuestionAns() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp),
        RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(AppColor.lightGray200)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Heading()
            Text(
                "", modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = Color.LightGray)
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Card(
                    modifier = Modifier
                        .height(30.dp)
                        .width(50.dp), colors = CardDefaults.cardColors(Color.Black),
                    shape = RoundedCornerShape(
                        topStart = 0.dp, bottomStart = 0.dp,
                        topEnd = 5.dp,
                        bottomEnd = 5.dp
                    ),
                    elevation = CardDefaults.cardElevation(5.dp)
                )
                {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .height(30.dp)
                                .width(30.dp), shape = CircleShape,
                            colors = CardDefaults.cardColors(AppColor.OrangeColor)
                        ) {

                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "1", modifier = Modifier,
                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold

                                )

                            }
                        }
                    }


                }

                Text(
                    text = "Guess the country from flag ?",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(
                modifier = Modifier
                    .height(5.dp)
                    .fillMaxWidth()
            )
            Card(
                modifier = Modifier
                    .width(100.dp)
                    .height(80.dp)
                    .padding(start = 10.dp),
                colors = CardDefaults.cardColors(Color.LightGray)
            ){
                Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {

                    Image(
                        painter = rememberImagePainter(data = R.drawable.nz),
                        contentDescription = "", // Provide a meaningful description

                        modifier = Modifier
                            .width(70.dp)
                            .height(50.dp)
                    )

                }
            }


        }


    }

}

@Preview(showBackground = true)
@Composable
fun QuestionAnsPreview() {

    QuestionAns()
}