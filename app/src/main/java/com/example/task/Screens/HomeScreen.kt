package com.example.task.Screens


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task.R



@Composable
@Preview
fun HomeScreen(){
    Column (
        Modifier
            .background(Color(0xFF8CB3D3))
            .fillMaxHeight()
        , horizontalAlignment = Alignment.CenterHorizontally
){ Box(contentAlignment = Alignment.BottomCenter) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp)
                .clip(RoundedCornerShape(25.dp)),
            contentScale = ContentScale.FillBounds,
            painter = painterResource(id = R.drawable.image),
            contentDescription = null
        )
        Image(painter = painterResource(id = R.drawable.image2)
            , contentDescription = null
            ,modifier = Modifier .offset(y = (100/2).dp)
                .size(120.dp)
                .clip(CircleShape)
                .border(3.dp, Color.Gray, CircleShape),
            contentScale = ContentScale.Crop)

    }

        Spacer(modifier = Modifier.size(50.dp))
        Text(text = "Android"
            , fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White, textAlign = TextAlign.Center
        )

        Text(text = "Compose"
            , fontSize = 20.sp,
            color = Color.White, textAlign = TextAlign.Center
        )

            Button(
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(start = 25.dp, end = 25.dp),
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    Color(0xFF061777)
                ), onClick = {  }) {
                Text(color = Color.White,text = "LogOut")
            }

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp),
            shape = RoundedCornerShape(15.dp),
            border = BorderStroke(6.dp, Color(0xFF061777)),
            colors = ButtonDefaults.buttonColors(
                Color(0xFFFFFFf)
            ), onClick = {

            }) {
            Text(color = Color.White,text = "Delete Your account")
        }
        Spacer(modifier = Modifier.height(80.dp))
        ClickableText(text = AnnotatedString(("You need Support? ContaactUs")), onClick = {},
            style = androidx.compose.ui.text.TextStyle(Color.White,fontSize = 14.sp,
                 textDecoration = TextDecoration.Underline)
        )


    }
}