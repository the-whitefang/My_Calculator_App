package com.example.my_calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import com.example.my_calculator_app.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.util.EmptyStackException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var value: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var expression=""
        with(binding){
            btn0.setOnClickListener {
                iofield.text = iofield.text.toString()+"0"
            }
            btn00.setOnClickListener {
                iofield.text = iofield.text.toString()+"00"
            }
            btn1.setOnClickListener {
                iofield.text = iofield.text.toString()+"1"
            }
            btn2.setOnClickListener {
                iofield.text = iofield.text.toString()+"2"
            }
            btn3.setOnClickListener {
                iofield.text = iofield.text.toString()+"3"
            }
            btn4.setOnClickListener {
                iofield.text = iofield.text.toString()+"4"
            }
            btn5.setOnClickListener {
                iofield.text = iofield.text.toString()+"5"
            }
            btn6.setOnClickListener {
                iofield.text = iofield.text.toString()+"6"
            }
            btn7.setOnClickListener {
                iofield.text = iofield.text.toString()+"7"
            }
            btn8.setOnClickListener {
                iofield.text = iofield.text.toString()+"8"
            }
            btn9.setOnClickListener {
                iofield.text = iofield.text.toString()+"9"
            }
            btnDivide.setOnClickListener {
                iofield.text = iofield.text.toString()+"/"
            }
            btnProduct.setOnClickListener {
                iofield.text = iofield.text.toString()+"*"
            }
            btnSub.setOnClickListener {
                iofield.text = iofield.text.toString() + "-"
            }
            btnPlus.setOnClickListener {
                iofield.text = iofield.text.toString() + "+"
            }
            modulo.setOnClickListener {
                iofield.text = iofield.text.toString() + "%"
            }
            btnDot.setOnClickListener {
                iofield.text = iofield.text.toString() + "."
            }
            clear.setOnClickListener {
                iofield.text = ""
                iofield.hint ="0."
            }
            delete.setOnClickListener {
                if (iofield.text.toString().length > 0){
                    iofield.text = (iofield.text.toString()).
                    subSequence(0,
                        iofield.text.toString().length-1)
                }
                else{
                    iofield.text =""
                    iofield.hint = "0."
                }
            }
            btnEqualTo.setOnClickListener {

                expression = iofield.text.toString()
                val result = ExpressionBuilder(expression).build()
                val eval = result.evaluate()
                iofield.text = eval.toString()

            }
        }


    }



    }


