package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity()
{

    private lateinit var binding: ActivityMainBinding

    private val sides = listOf(R.drawable.dice_1, R.drawable.dice_2, R.drawable.dice_3,
            R.drawable.dice_4, R.drawable.dice_5, R.drawable.dice_6)

    private lateinit var dice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rollButton: Button = binding.rollButton

        rollButton.setOnClickListener {
                rollDice()
        }
        dice = binding.dice
    }

    private fun rollDice() {
        val side  = Random.nextInt(0,6)
        dice.setImageResource(sides[side])
        Toast.makeText(this, side.toString(), Toast.LENGTH_SHORT).show()
    }
}