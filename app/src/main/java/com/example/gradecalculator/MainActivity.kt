package com.example.gradecalculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btCalculate = calculate
        val result = result
        btCalculate.setOnClickListener(){
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            if(media > 6 && faltas <= 10){
                result.setText("Aluno foi Aprovado\n" + "Nota final: " + media + "\nFaltas: " + faltas)
                result.setTextColor(Color.GREEN)
            } else{
                result.setText("Aluno foi Reprovado\n" + "Nota final: " + media + "\nFaltas: " + faltas)
                result.setTextColor(Color.RED)
            }

        }
    }
}