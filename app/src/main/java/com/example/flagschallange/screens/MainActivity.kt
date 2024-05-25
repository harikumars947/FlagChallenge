package com.example.flagschallange.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.example.RootQuestions
import com.example.flagschallange.ui.theme.FlagsChallangeTheme
import com.example.flagschallange.viewmodels.QuestionAnswerViewModel
import com.google.gson.Gson
import java.io.File

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*FlagsChallangeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }*/
            Surface(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
                Greeting("Android")
            }

        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val viewModel: QuestionAnswerViewModel = QuestionAnswerViewModel()
    val root=viewModel.readJsonFromAssets(context = LocalContext.current,"questions.json")
    println(root?.questions?.get(0)?.answerId)
    QuestionAns()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FlagsChallangeTheme {
        Greeting("Android")
    }
}