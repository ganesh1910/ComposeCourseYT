package com.gktech.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyColumn {
                itemsIndexed(
                    listOf("This", "is", "the", "Compose","A","B","C","D","E","F","G","H","I","J","K")
                ) { _, item ->
                    Text(
                        text = "item $item",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                    )
                }

                /* items(500) {
                     Text(
                         text = "item $it",
                         fontSize = 24.sp,
                         fontWeight = FontWeight.Bold,
                         textAlign = TextAlign.Center,
                         modifier = Modifier
                             .fillMaxWidth()
                             .padding(vertical = 24.dp)
                     )
                 }*/
                /*  val scrollState = rememberScrollState()
                  Column(modifier = Modifier.verticalScroll(scrollState)) {
                      for (i in 1..50) {
                          Text(
                              text = "item $i",
                              fontSize = 24.sp,
                              fontWeight = FontWeight.Bold,
                              textAlign = TextAlign.Center,
                              modifier = Modifier
                                  .fillMaxWidth()
                                  .padding(vertical = 24.dp)
                          )
                      }*/
            }
        }
    }
}
