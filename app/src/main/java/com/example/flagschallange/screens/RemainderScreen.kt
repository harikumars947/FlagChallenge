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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.flagschallange.Constants
import com.example.flagschallange.R
import com.example.flagschallange.ui.theme.AppColor
import com.example.flagschallange.ui.theme.FlagsChallangeTheme
import com.example.flagschallange.viewmodels.GlobalModel
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Remainder(navController: NavHostController, globalViewModel: GlobalModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth().wrapContentHeight()
            .padding(
                start = dimensionResource(R.dimen._15dp),
                end = dimensionResource(R.dimen._15dp),
                top = dimensionResource(R.dimen._15dp),
                bottom = dimensionResource(R.dimen._15dp)
            ),
        RoundedCornerShape(dimensionResource(R.dimen._5dp)),
        colors = CardDefaults.cardColors(AppColor.lightGray200)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Heading(null)
            Text(
                "", modifier = Modifier
                    .fillMaxWidth()
                    .height(dimensionResource(R.dimen._1dp))
                    .background(color = Color.LightGray)
            )
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen._5dp)))
            Text(
                "CHALLENGE",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = dimensionResource(R.dimen._20dp).value.sp, fontWeight = FontWeight.Normal
            )
            Text(
                "WILL START IN",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = dimensionResource(R.dimen._20dp).value.sp, fontWeight = FontWeight.Bold
            )
            Text(
                "00:20",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.DarkGray,
                fontSize = dimensionResource(R.dimen._20dp).value.sp, fontWeight = FontWeight.Bold
            )
        }
//


    }
    LaunchedEffect(true) {
        delay(2000)  // the delay of 3 seconds
        navController.navigate(Constants.QUESTIO_ANSWER_SCREEN)
    }
}

@Preview(showBackground = true)
@Composable
fun RemainderPreview() {

   // Remainder()
}