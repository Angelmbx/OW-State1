package com.example.ow_state1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import com.example.ow_state1.ui.theme.OWState1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OWState1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    StudentList()

                }
            }
        }
    }

    @Composable
    @Preview
    private fun StudentList() {
    val students = remember{mutableStateListOf("Miguel", "Esther")}
        Column(modifier = Modifier.fillMaxSize())
        {
        for(student in students){
            Text(text= student)
        }
        Button(onClick = {students.add("Jaime")}){
            Text(text = "Añadir")
        }
            
        }


    }
}

