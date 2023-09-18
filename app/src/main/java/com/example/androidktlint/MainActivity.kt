package com.example.androidktlint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidktlint.ui.theme.AndroidKtlintTheme

/**
 * This is an Android Activity that displays a welcome message.
 *
 * @param savedInstanceState The saved instance state.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidKtlintTheme { // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) { Greeting("Android") }
            }
        }
    }
}

/**
 * This is Greeting function that displays a welcome message.
 *
 * @param name String.
 * @param modifier Modifier
 *
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    // Initialize and display the welcome message.
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidKtlintTheme {
        Greeting("Android")
    }
}
