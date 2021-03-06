package com.example.srirgacha.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import kotlin.math.log
import kotlin.math.round

interface MathService{

    companion object {
        fun CalculateOdds(calc: Double, cost: Double): String {
            var compliment = (100 - calc) / 100
            return "50%: \n$" +
                    round(log(0.5, compliment) * cost) +
                    "\n90%: \n$" +
                    round(log(0.1, compliment) * cost) +
                    "\n99%: \n$" +
                    round(log(0.01, compliment) * cost)
        }
    }
}