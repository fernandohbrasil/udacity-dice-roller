package com.fernandohbrasil.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fernandohbrasil.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bind()
    }

    private fun bind() {
        with(binding) {
            rollButton.text = getString(R.string.lets_roll)
            rollButton.setOnClickListener {
                rollDice()
            }
        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val drawbleResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.diceImage.setImageResource(drawbleResource)
    }
}