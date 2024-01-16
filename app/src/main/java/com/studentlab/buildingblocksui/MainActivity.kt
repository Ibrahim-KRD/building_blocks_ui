package com.studentlab.buildingblocksui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.studentlab.buildingblocksui.ui.theme.BuildingBlocksUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BuildingBlocksUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    ScrrenContent()

                }
            }
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun ScrrenContent() {
        // Text(text = "welcome to android dev course")
        /*
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "CLick me")

                }
                */
        // TextField(value = "typed information", onValueChange = {})
        // OutlinedTextField(value = "typed information", onValueChange = {})
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Card(
                Modifier
                    .fillMaxWidth(.5f)
                    .fillMaxHeight(.3f),
                elevation = CardDefaults.cardElevation(),

                ) {
                Column(Modifier.padding(10.dp).fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceAround
                ) {
                    Row(
                        Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "card title ")
                        Icon(
                            imageVector = Icons.Default.ThumbUp,
                            contentDescription = null
                        )
                    }
                    Column (Modifier.fillMaxSize(),verticalArrangement = Arrangement.SpaceBetween){
                        Text(
                            text = "Card title",

                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(text = buildAnnotatedString {
                            append("this following line should describe what this card is about")
                        })
                        Row (Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.SpaceEvenly){
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.ThumbUp, contentDescription = null)
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Edit,contentDescription = null)
                            }
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Share,contentDescription = null)
                            }
                        }
                    }

                }
            }
        }
    }

    @Preview
    @Composable
    fun Preview() {
        ScrrenContent()
    }
}