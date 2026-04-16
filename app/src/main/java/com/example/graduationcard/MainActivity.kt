package com.example.graduationcard

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationcard.R.string.happy_graduation_text
import com.example.graduationcard.R.string.sender_Text
import com.example.graduationcard.ui.theme.GraduationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GraduationCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage(
                        Message = stringResource(happy_graduation_text),
                        sender = stringResource(sender_Text),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingImage(Message: String,
                  sender: String,
                  modifier: Modifier = Modifier) {


    Box (modifier) {
        val image = painterResource(R.drawable.bg_1)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.5f
        )
        Greetingtex(
            Message = Message,
            sender = sender,
            modifier = modifier.fillMaxSize()
        )
    }
}
@Composable
fun Greetingtex(Message: String,
                sender: String,
                modifier: Modifier = Modifier ){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .padding(8.dp)
            .fillMaxSize()

    ) {

        Text(
            text = Message,
            fontSize = 74.sp,
            lineHeight = 110.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = sender,
            fontSize = 28.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingtextPreview() {
    GraduationCardTheme {
        GreetingImage(
                    Message =stringResource(happy_graduation_text),
                    sender = stringResource(sender_Text))
    }

}
