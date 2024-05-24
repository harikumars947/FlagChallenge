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
fun Schedule() {
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
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                "SCHEDULE",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp, fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(5.dp))
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
                                .width(50.dp)
                                .height(50.dp),
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
                        Spacer(modifier = Modifier.width(5.dp))
                        Card(
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
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
                                .width(50.dp)
                                .height(50.dp),
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
                        Spacer(modifier = Modifier.width(5.dp))
                        Card(
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
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
                                .width(50.dp)
                                .height(50.dp),
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
                        Spacer(modifier = Modifier.width(5.dp))
                        Card(
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp),
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
            Spacer(modifier = Modifier.height(15.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Center) {
                Card(
                    modifier = Modifier
                        .height(30.dp)
                        .width(90.dp),
                    colors = CardDefaults.cardColors(AppColor.OrangeColor),
                    shape = RoundedCornerShape(5.dp)
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

            Spacer(modifier = Modifier.height(10.dp))


        }
//

    }
}

@Preview(showBackground = true)
@Composable
fun SchedulePreview() {

    Schedule()
}