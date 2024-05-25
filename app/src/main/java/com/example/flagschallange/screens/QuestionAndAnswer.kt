package com.example.flagschallange.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.example.Questions
import com.example.example.RootQuestions
import com.example.flagschallange.Constants
import com.example.flagschallange.R
import com.example.flagschallange.ui.theme.AppColor
import com.example.flagschallange.viewmodels.QuestionAnswerViewModel


@Composable
fun QuestionAns(navController: NavHostController) {
    val viewModel: QuestionAnswerViewModel = QuestionAnswerViewModel()
    var question: Questions? = null
    val context = LocalContext.current
    val root = viewModel.readJsonFromAssets(context = LocalContext.current, "questions.json")
    val isTimerRunning = viewModel.isTimerRunning.collectAsState()
    var temp = 0
    var firstAswerTrue by remember { mutableStateOf(false) }
    var secondAswerTrue by remember { mutableStateOf(false) }
    var thirdAswerTrue by remember { mutableStateOf(false) }
    var fourthAswerTrue by remember { mutableStateOf(false) }
    var firstAswerColor by remember { mutableStateOf(false) }
    var secondAswerColor by remember { mutableStateOf(false) }
    var thirdAswerColor by remember { mutableStateOf(false) }
    var fourthAswerColor by remember { mutableStateOf(false) }
    if (isTimerRunning.value) {
        val sharedPreferences =
            context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        temp = sharedPreferences.getInt("count", 0)
        if (root != null) {
            if (temp < root.questions.size) {
                viewModel?.startTimer()
                firstAswerTrue = false
                secondAswerTrue = false
                thirdAswerTrue = false
                fourthAswerTrue = false
                firstAswerColor = false
                secondAswerColor = false
                thirdAswerColor = false
                fourthAswerColor = false
                question = root?.questions?.get(temp)
                sharedPreferences?.edit()?.putInt("count", ++temp)?.apply()
            } else {
                sharedPreferences?.edit()?.putInt("count", 0)?.apply()
                navController.navigate(Constants.GAME_OVER)
            }

        }

    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, end = 15.dp, top = 15.dp, bottom = 15.dp),
        RoundedCornerShape(5.dp),
        colors = CardDefaults.cardColors(AppColor.lightGray200)
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Heading(viewModel)
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
                                    text = temp.toString(), modifier = Modifier,
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
            Row(modifier = Modifier.fillMaxWidth()) {
                Card(
                    modifier = Modifier
                        .width(100.dp)
                        .height(80.dp)
                        .padding(start = 10.dp, bottom = 10.dp),
                    colors = CardDefaults.cardColors(Color.LightGray)
                ) {
                    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {

                        Image(
                            painter = rememberImagePainter(data = returnFlag(question?.countryCode)),
                            contentDescription = "", // Provide a meaningful description

                            modifier = Modifier
                                .width(70.dp)
                                .height(50.dp)
                        )

                    }


                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Card(
                            modifier = Modifier.clickable {
                                var temp = returnAnser(question)

                                when (temp) {
                                    0 -> {
                                        firstAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    1 -> {
                                        secondAswerTrue = true
                                        firstAswerColor = true
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    2 -> {
                                        thirdAswerTrue = true
                                        firstAswerColor = true
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    3 -> {
                                        fourthAswerTrue = true
                                        firstAswerColor = true
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }
                                }
                            },
                            colors = if (!firstAswerColor) CardDefaults.cardColors(AppColor.lightGray200)
                            else CardDefaults.cardColors(AppColor.OrangeColor),
                            shape = RoundedCornerShape(5.dp),
                            border = if (!firstAswerTrue) BorderStroke(1.dp, Color.DarkGray) else
                                BorderStroke(1.dp, Color.Green),
                            elevation = CardDefaults.cardElevation(5.dp)
                        ) {
                            Text(
                                text = limitedLengthText(question?.countries?.get(0)?.countryName + ""),
                                modifier = Modifier.padding(
                                    start = 20.dp, end = 20.dp,
                                    top = 5.dp, bottom = 5.dp
                                ),
                                maxLines = 1,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )
                        }
                        Card(
                            modifier = Modifier.clickable {
                                var temp = returnAnser(question)

                                when (temp) {
                                    0 -> {
                                        firstAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = true
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    1 -> {
                                        secondAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    2 -> {
                                        thirdAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = true
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    3 -> {
                                        fourthAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = true
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }
                                }
                            },
                            colors = if (!secondAswerColor) CardDefaults.cardColors(AppColor.lightGray200)
                            else CardDefaults.cardColors(AppColor.OrangeColor),
                            shape = RoundedCornerShape(5.dp),
                            border = if (!secondAswerTrue) BorderStroke(1.dp, Color.DarkGray) else
                                BorderStroke(1.dp, Color.Green),
                            elevation = CardDefaults.cardElevation(5.dp)
                        ) {
                            Text(
                                text = limitedLengthText(question?.countries?.get(1)?.countryName + ""),
                                modifier = Modifier.padding(
                                    start = 20.dp, end = 20.dp,
                                    top = 5.dp, bottom = 5.dp
                                ),
                                maxLines = 1,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(10.dp)
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Card(
                            modifier = Modifier.clickable {
                                var temp = returnAnser(question)

                                when (temp) {
                                    0 -> {
                                        firstAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = true
                                        fourthAswerColor = false
                                    }

                                    1 -> {
                                        secondAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = true
                                        fourthAswerColor = false
                                    }

                                    2 -> {
                                        thirdAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }

                                    3 -> {
                                        fourthAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = true
                                        fourthAswerColor = false
                                    }
                                }
                            },
                            colors = if (!thirdAswerColor) CardDefaults.cardColors(AppColor.lightGray200)
                            else CardDefaults.cardColors(AppColor.OrangeColor),
                            shape = RoundedCornerShape(5.dp),
                            border = if (!thirdAswerTrue) BorderStroke(1.dp, Color.DarkGray) else
                                BorderStroke(1.dp, Color.Green),
                            elevation = CardDefaults.cardElevation(5.dp)
                        ) {
                            Text(
                                text = limitedLengthText(question?.countries?.get(2)?.countryName + ""),
                                modifier = Modifier.padding(
                                    start = 20.dp, end = 20.dp,
                                    top = 5.dp, bottom = 5.dp
                                ),
                                maxLines = 1,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )
                        }
                        Card(
                            modifier = Modifier.clickable {
                                var temp = returnAnser(question)

                                when (temp) {
                                    0 -> {
                                        firstAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = true
                                    }

                                    1 -> {
                                        secondAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = true
                                    }

                                    2 -> {
                                        thirdAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = true
                                    }

                                    3 -> {
                                        fourthAswerTrue = true
                                        firstAswerColor = false
                                        secondAswerColor = false
                                        thirdAswerColor = false
                                        fourthAswerColor = false
                                    }
                                }
                            },
                            colors = if (!fourthAswerColor) CardDefaults.cardColors(AppColor.lightGray200)
                            else CardDefaults.cardColors(AppColor.OrangeColor),
                            shape = RoundedCornerShape(5.dp),
                            border = if (!fourthAswerTrue) BorderStroke(1.dp, Color.DarkGray) else
                                BorderStroke(1.dp, Color.Green),
                            elevation = CardDefaults.cardElevation(5.dp)
                        ) {
                            Text(
                                text = limitedLengthText(question?.countries?.get(3)?.countryName + ""),
                                modifier = Modifier.padding(
                                    start = 20.dp, end = 20.dp,
                                    top = 5.dp, bottom = 5.dp
                                ),
                                maxLines = 1,
                                color = Color.Black,
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                }
            }


        }


    }

}

@Composable
fun CountdownTimer() {


}

fun limitedLengthText(text: String): String {

    if (text.length >= 10) {
        return text.substring(0, 10)  // Add ellipsis for truncated text
    } else {
        return text
    }

//    Text(text = truncatedText)
}


fun checkTheAnswer(question: Questions?, position: Int): Boolean {
    if (question?.answerId == question?.countries?.get(position)?.id) {
        return true;
    } else {
        return false
    }
}

fun returnAnser(question: Questions?): Int {
    var temp = question?.answerId
    var index = question?.countries?.indexOfFirst { it.id == temp }
    return index!!.toInt()
}

fun returnFlag(code: String?): Int {
    when (code?.lowercase()) {
        "nz" -> return R.drawable.nz
        "aw" -> return R.drawable.aw
        "ec" -> return R.drawable.ec
        "py" -> return R.drawable.py
        "kg" -> return R.drawable.ky
        "pm" -> return R.drawable.pm
        "jp" -> return R.drawable.jp
        "tm" -> return R.drawable.jp
        "ga" -> return R.drawable.ga
        "mq" -> return R.drawable.mq
        "bz" -> return R.drawable.bz
        "cz" -> return R.drawable.cz
        "ae" -> return R.drawable.ae
        "je" -> return R.drawable.je
        "ls" -> return R.drawable.ls
    }
    return return R.drawable.aw
}

@Preview(showBackground = true)
@Composable
fun QuestionAnsPreview() {
    val navController = rememberNavController()
    QuestionAns(navController)
}