package com.example.graduationcard

import android.R
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.graduationcard.ui.theme.GraduationCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GraduationCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greetingtex(
                        Message = "“Semoga semua lelahmu hari ini berubah jadi bahagia esok hari.\n" +
                                "Kamu kuat, bahkan saat kamu merasa tidak baik-baik saja.”\n" +
                                "\n" +
                                "“Terima kasih sudah bertahan sejauh ini.\n" +
                                "Dunia mungkin tidak selalu ramah, tapi kamu selalu berharga.”\n" +
                                "\n" +
                                "“Aku mungkin tidak selalu ada di sampingmu,\n" +
                                "tapi doaku selalu menemukan jalan untuk sampai ke kamu.”",
                        sender = "from Zaki",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}
@Composable
fun Greetingtex(Message: String,
                sender: String,
                modifier: Modifier = Modifier ){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp).fillMaxSize()

    ) {

        Text(
            text = Message,
            fontSize = 25.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = sender,
            fontSize = 28.sp,
            modifier = Modifier
                .padding(16.dp)
                .align (alignment = Alignment.End)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingtextPreview() {
    GraduationCardTheme {
        Greetingtex(Message = "“Semoga semua lelahmu hari ini berubah jadi bahagia esok hari.\n" +
                "Kamu kuat, bahkan saat kamu merasa tidak baik-baik saja.”\n" +
                "\n" +
                "“Terima kasih sudah bertahan sejauh ini.\n" +
                "Dunia mungkin tidak selalu ramah, tapi kamu selalu berharga.”\n" +
                "\n" +
                "“Aku mungkin tidak selalu ada di sampingmu,\n" +
                "tapi doaku selalu menemukan jalan untuk sampai ke kamu.”",
                    sender = "from Zaki")
    }
}
