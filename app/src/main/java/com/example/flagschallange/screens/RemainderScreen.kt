package com.example.flagschallange.screens



import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flagschallange.ui.theme.AppColor
import com.example.flagschallange.ui.theme.FlagsChallangeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Remainder() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
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
            Text(
                "CHALLENGE",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp, fontWeight = FontWeight.Normal
            )
            Text(
                "WILL START IN",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            )
            Text(
                "00:20",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                textAlign = TextAlign.Center,
                color = Color.LightGray,
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            )
        }
//


    }

}

@Preview(showBackground = true)
@Composable
fun RemainderPreview() {

    Remainder()
}