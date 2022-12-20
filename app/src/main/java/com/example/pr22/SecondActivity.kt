package com.example.pr22antuh

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.pr22.R


class SecondActivity : AppCompatActivity(), Fragment.OnSelectedButtonListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // Получим индекс из намерения активности
        val intent = intent
        val buttonIndex = intent.getIntExtra("buttonIndex", -1)
        if (buttonIndex != -1) {
            val fragmentManager = supportFragmentManager
            val fragment2 = fragmentManager
                .findFragmentById(R.id.fragment2) as Fragment2?
            fragment2!!.setDescription(buttonIndex)

        }

    }
    override fun onButtonSelected(buttonIndex: Int) {
        // подключаем FragmentManager
        val fragmentManager = supportFragmentManager

        // Получаем ссылку на второй фрагмент по ID
        val fragment2 = fragmentManager.findFragmentById(R.id.fragment2) as Fragment2?
        fragment2?.setDescription(buttonIndex)
    }

}


