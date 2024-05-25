package com.example.flagschallange.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flagschallange.R
import com.example.flagschallange.ui.theme.AppColor
import com.example.flagschallange.viewmodels.QuestionAnswerViewModel

@Composable
fun Heading(viewModel: QuestionAnswerViewModel?){
    val timeLeft = viewModel?.timeLeft?.collectAsState()

    Row(
        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box() {
            Card(
                modifier = Modifier
                    .height(dimensionResource(R.dimen._30dp))
                    .width(dimensionResource(R.dimen._50dp)), colors = CardDefaults.cardColors(Color.Black),
                shape = RoundedCornerShape(dimensionResource(R.dimen._5dp)),
                elevation = CardDefaults.cardElevation(dimensionResource(R.dimen._5dp))
            )

            {
                Box(modifier = Modifier.fillMaxHeight(),contentAlignment = Alignment.Center) {
                    Text(
                        text = "${timeLeft?.value?:"00:00"}", modifier = Modifier
                            .fillMaxWidth(), color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }

            }
            Text(
                "Flag Challenge",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = dimensionResource(R.dimen._20sp).value.sp, color = AppColor.OrangeColor,
                fontWeight = FontWeight.Bold
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun HeadingPreview() {

    Heading(QuestionAnswerViewModel())
}