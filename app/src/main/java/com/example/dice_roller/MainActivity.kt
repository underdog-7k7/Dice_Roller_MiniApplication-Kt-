package com.example.dice_roller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

        }
    }
}

@Composable
fun rollbutton(){
    val fontfam = FontFamily(Font(R.font.pop_med))
    var number by remember{ mutableStateOf(1) }
    var name by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()) {
        Button(onClick = {number= myname(6) }, shape = RoundedCornerShape(30.dp), modifier = Modifier
            .fillMaxWidth()
            .padding(40.dp), colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
                Text(text = "Roll the Dice", fontFamily = fontfam)
        }
        Spacer(Modifier.height(40.dp))
        Text(text = "The outcome is",Modifier.fillMaxWidth(), fontFamily = fontfam, textAlign = TextAlign.Center)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text= "$number", color = Color.Green, fontSize = 30.sp, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())


    }

}

fun myname(dicesize: Int ):Int{
    var ghemla = dicesize
    return (1..ghemla).random()
}

@Preview
@Composable
fun myprev(){
    rollbutton()
}

