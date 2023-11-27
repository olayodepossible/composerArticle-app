package com.example.jetpackarticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackarticle.ui.theme.JetpackArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    ComposerArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposerArticleApp(){
    ArticleCard(
        title = stringResource(R.string.article1),
        shortDes = stringResource(R.string.article2),
        longDes = stringResource(R.string.article3),
        imagePainter = painterResource(id = R.drawable.bg_compose_background)
    )
}

@Composable
private fun ArticleCard (title: String, shortDes: String, longDes: String, imagePainter: Painter, modifier: Modifier = Modifier){

    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = "article image")
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)

        )
        Text(
            text = shortDes,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = longDes,
            fontSize = 16.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackArticleTheme {
        ComposerArticleApp()
    }
}