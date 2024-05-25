package com.example.flagschallange.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.flagschallange.Constants
import com.example.flagschallange.R
import com.example.flagschallange.ui.theme.AppColor
import com.example.flagschallange.ui.theme.FlagsChallangeTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Schedule(navController: NavHostController) {
    var context= LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
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
                "SCHEDULE",
                modifier = Modifier
                    .fillMaxWidth()
                  ,
                textAlign = TextAlign.Center,
                fontSize = dimensionResource(R.dimen._20sp).value.sp, fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen._5dp)))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                //Hour=====================
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Hour", textAlign = TextAlign.Center)
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(dimensionResource(R.dimen._50dp))
                                .height(dimensionResource(R.dimen._50dp)),
                            colors = CardDefaults.cardColors(Color.LightGray)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(), // Fill the Card's size
                                contentAlignment = Alignment.Center // Center the content within the Box
                            ) {
                                BasicTextField(
                                    value = "0", onValueChange = {},
                                    modifier = Modifier.background(Color.LightGray),
                                    textStyle = TextStyle(
                                        textAlign = TextAlign.Center,  // Set text alignment to center
                                        fontSize = 18.sp
                                    ),
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(dimensionResource(R.dimen._5dp)))
                        Card(
                            modifier = Modifier
                                .width(dimensionResource(R.dimen._50dp))
                                .height(dimensionResource(R.dimen._50dp)),
                            colors = CardDefaults.cardColors(Color.LightGray)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(), // Fill the Card's size
                                contentAlignment = Alignment.Center // Center the content within the Box
                            ) {
                                BasicTextField(
                                    value = "0", onValueChange = {},
                                    modifier = Modifier.background(Color.LightGray),
                                    textStyle = TextStyle(
                                        textAlign = TextAlign.Center,  // Set text alignment to center
                                        fontSize = 18.sp
                                    ),
                                )
                            }

                        }
                    }
                }
//===================================================

                //minute========================
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Minute")
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(dimensionResource(R.dimen._50dp))
                                .height(dimensionResource(R.dimen._50dp)),
                            colors = CardDefaults.cardColors(Color.LightGray)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(), // Fill the Card's size
                                contentAlignment = Alignment.Center // Center the content within the Box
                            ) {
                                BasicTextField(
                                    value = "0", onValueChange = {},
                                    modifier = Modifier.background(Color.LightGray),
                                    textStyle = TextStyle(
                                        textAlign = TextAlign.Center,  // Set text alignment to center
                                        fontSize = 18.sp
                                    ),
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(dimensionResource(R.dimen._5dp)))
                        Card(
                            modifier = Modifier
                                .width(dimensionResource(R.dimen._50dp))
                                .height(dimensionResource(R.dimen._50dp)),
                            colors = CardDefaults.cardColors(Color.LightGray)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(), // Fill the Card's size
                                contentAlignment = Alignment.Center // Center the content within the Box
                            ) {
                                BasicTextField(
                                    value = "0", onValueChange = {},
                                    modifier = Modifier.background(Color.LightGray),
                                    textStyle = TextStyle(
                                        textAlign = TextAlign.Center,  // Set text alignment to center
                                        fontSize = 18.sp
                                    ),
                                )
                            }

                        }
                    }
                }
//======================================================
                //second======================
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Second")
                    Row() {
                        Card(
                            modifier = Modifier
                                .width(dimensionResource(R.dimen._50dp))
                                .height(dimensionResource(R.dimen._50dp)),
                            colors = CardDefaults.cardColors(Color.LightGray)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(), // Fill the Card's size
                                contentAlignment = Alignment.Center // Center the content within the Box
                            ) {
                                BasicTextField(
                                    value = "0", onValueChange = {},
                                    modifier = Modifier.background(Color.LightGray),
                                    textStyle = TextStyle(
                                        textAlign = TextAlign.Center,  // Set text alignment to center
                                        fontSize = 18.sp
                                    ),
                                )
                            }

                        }
                        Spacer(modifier = Modifier.width(dimensionResource(R.dimen._5dp)))
                        Card(
                            modifier = Modifier
                                .width(dimensionResource(R.dimen._50dp))
                                .height(dimensionResource(R.dimen._50dp)),
                            colors = CardDefaults.cardColors(Color.LightGray)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize(), // Fill the Card's size
                                contentAlignment = Alignment.Center // Center the content within the Box
                            ) {
                                BasicTextField(
                                    value = "0", onValueChange = {},
                                    modifier = Modifier.background(Color.LightGray),
                                    textStyle = TextStyle(
                                        textAlign = TextAlign.Center,  // Set text alignment to center
                                        fontSize = 18.sp
                                    ),
                                )
                            }

                        }
                    }
                }
                //=======================================================
            }
            Spacer(modifier = Modifier.height(dimensionResource(R.dimen._15dp)))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Center) {
                Card(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(Constants.QUESTIO_ANSWER_SCREEN)
                        }
                        .height(dimensionResource(R.dimen._30dp))
                        .width(dimensionResource(R.dimen._90dp)),
                    colors = CardDefaults.cardColors(AppColor.OrangeColor),
                    shape = RoundedCornerShape(dimensionResource(R.dimen._5dp))
                )
                {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Center
                    ) {
                        Text(
                            "Save", color = Color.White, textAlign = TextAlign.Center,
                        )
                    }

                }
            }

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen._10dp)))


        }
//

    }
}

@Preview(showBackground = true)
@Composable
fun SchedulePreview() {
    val rememberNavController= rememberNavController()
    Schedule(rememberNavController)
}