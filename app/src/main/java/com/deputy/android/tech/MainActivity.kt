package com.deputy.android.tech

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.deputy.android.tech.ui.animals.AnimalsScreen
import com.deputy.android.tech.ui.books.BooksScreen
import com.deputy.android.tech.ui.coffee.CoffeeScreen
import com.deputy.android.tech.ui.theme.DeputyAndroidTechTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeputyAndroidTechTheme {
                val navController = rememberNavController()
                Scaffold(
                    topBar = { TopBar() }
                ) {
                    MainNavHost(
                        navController = navController,
                        onScreenChange = { }
                    )
                }
            }
        }
    }
}

@Composable
fun TopBar() {
    TopAppBar(title = { Text("Deputy Android Tech") })
}

@Composable
@SuppressWarnings("LongMethod")
private fun MainNavHost(
    navController: NavHostController,
    onScreenChange: (String) -> Unit
) {
    NavHost(
        navController = navController,
        startDestination = Screens.Main.name
    ) {
        composable(Screens.Main.name) {
            MainContent { screen ->
                navController.navigate(screen.name)
            }
        }
        composable(Screens.Animals.name) {
            AnimalsScreen()
        }
        composable(Screens.Books.name) {
            BooksScreen()
        }
        composable(Screens.Coffee.name) {
            CoffeeScreen()
        }
    }
}

@Composable
fun MainContent(
    onClick: (Screens) -> Unit
) {
    Column(Modifier.fillMaxWidth()) {
        val topics = listOf("Animals", "Books", "Coffee")
        topics.forEach { topic ->
            TopicCard(topic, onClick = {
                when (topic) {
                    "Animals" -> onClick(Screens.Animals)
                    "Books" -> onClick(Screens.Books)
                    "Coffee" -> onClick(Screens.Coffee)
                }
            })
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
private fun TopicCard(topic: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .height(80.dp)
            .fillMaxWidth(),
        onClick = onClick
    ) {
        Column(Modifier.padding(8.dp)) {
            Text(text = topic)
        }
    }
}
