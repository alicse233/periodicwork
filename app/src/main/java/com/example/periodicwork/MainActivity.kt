package com.example.periodicwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.periodicwork.ui.theme.PeriodicWorkTheme
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PeriodicWorkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    val show = remember { mutableStateOf(true) }
    var count = remember { mutableStateOf(1) }
    val scope = rememberCoroutineScope()

    val ishow = MutableSharedFlow<Boolean>(1)

    LaunchedEffect(show.value) {
        scope.launch {
            runBlocking {
                delay(5000)
                show.value = !show.value
                ishow.emit(show.value)
                println("32832834894398349")
            }
        }
    }

    LaunchedEffect(ishow.asSharedFlow()) {
        scope.async {
            count.value += 1
            println("prprrprprprppr ${count.value}")
        }.await()
    }

    AnimatedVisibility(show.value) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PeriodicWorkTheme {
        Greeting("Android")
    }
}