package com.example.flagschallange.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
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
import com.example.flagschallange.ui.theme.AppColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Result() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(start = 15.dp, end = 15.dp, top = 15.dp),
        RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(AppColor.lightGray200)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Heading(null)
            Text(
                "", modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = Color.LightGray)
            )
            Spacer(modifier = Modifier.height(5.dp))
            Box(modifier = Modifier.fillMaxHeight(), contentAlignment = Alignment.Center) {
                Text(
                    "GAME OVER",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 50.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp, fontWeight = FontWeight.Bold
                )

            }
        }


    }

}

@Composable
fun FinalScore() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .padding(start = 15.dp, end = 15.dp, top = 15.dp),
        RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(AppColor.lightGray200)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Heading(null)
            Text(
                "", modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(color = Color.LightGray)
            )

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Row() {
                    Text(
                        "Score : ",
                        modifier = Modifier,
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp, fontWeight = FontWeight.Normal,
                        color = AppColor.OrangeColor
                    )
                    Text(
                        "20/70",
                        modifier = Modifier.padding(start = 10.dp),
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp, fontWeight = FontWeight.Bold,
                        color = Color.DarkGray
                    )
                }


            }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun ResultPreview() {

    FinalScore()
}