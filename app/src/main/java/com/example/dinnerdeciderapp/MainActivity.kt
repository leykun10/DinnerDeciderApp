package com.example.dinnerdeciderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    var dinnerLists:MutableList<String> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       decideButton.setOnClickListener {
           if(dinnerLists.isNotEmpty()){
               val selectedMeal:Int = Random.nextInt(dinnerLists.size)
               selectedFood.text = dinnerLists[selectedMeal] }
           else{
               selectedFood.text = "empty"
           }


       }
        addFoodButton.setOnClickListener {
            val foodToBeAdded = addFoodField.text.toString()
            addFoodField.text.clear()
            dinnerLists.add(foodToBeAdded)
        }

        resetButton.setOnClickListener {
            dinnerLists.clear()
            selectedFood.text = "empty"
        }
    }
}