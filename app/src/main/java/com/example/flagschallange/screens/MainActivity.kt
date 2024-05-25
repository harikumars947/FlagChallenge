package com.example.flagschallange.screens

import android.content.Context
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
import androidx.compose.ui.unit.Constraints
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.example.RootQuestions
import com.example.flagschallange.Constants
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
            counterSettings();
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                navigation()
            }

        }


    }

    fun counterSettings() {
        val sharedPreferences =
            this.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)
        sharedPreferences.edit().putInt("count", 0).apply()
        /*if (sharedPreferences.getInt("count", 0) == 0) {
            sharedPreferences.edit().putInt("count", 0).apply()
        }*/

    }
}

@Composable
fun navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Constants.QUESTIO_ANSWER_SCREEN) {
        composable(Constants.QUESTIO_ANSWER_SCREEN) {
            QuestionAns(navController)
        }
        composable(Constants.GAME_OVER) {
            Result()
        }
        /*composable(
            "mainscreen/{user}",
            arguments = listOf(navArgument("user") {
                type = NavType.ParcelableType(USerList::class.java)
            })
        )
        { backStackEntry ->
            val user = backStackEntry.arguments?.getParcelable<USerList>("user")
            MainScreen(user)
        }*/


        //composable("listingscreen") { ProfileListScreen(navController) }

    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    navigation()
}


