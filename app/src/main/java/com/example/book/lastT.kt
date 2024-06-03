package com.example.book

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import kotlin.random.Random

class lastT : AppCompatActivity() {

    private val randomTexts = arrayOf(
        "사실은 항상 이성의 편이다",
        "숫자는 거짓말을 하지 않는다",
        "측정할 수 없으면 관리할 수 없다",
        "논리적인 생각이 항상 답을 준다",
        "데이터가 진실을 말해준다",
        "결정은 이성적으로, 감정은 나중에",
        "말보다 행동이 중요하다",
        "계획 없는 목표는 단지 꿈일 뿐이다",
        "행동이 말보다 더 크게 말한다",
        "증거가 없으면 주장은 무의미하다",
        "효율성은 성공의 열쇠이다",
        "논리가 감정보다 우선한다",
        "말보다 실천이 중요하다",
        "결과는 노력의 산물이다",
        "신뢰할 수 있는 데이터를 사용하라",
        "분석 없이 결론을 내리지 마라",
        "효과적인 방법을 찾아라",
        "의견보다는 사실에 기반하라",
        "이성적인 접근이 항상 최선이다",
        "확실한 근거가 필요하다",
        "결정은 감정이 아니라 이성에 따라야 한다",
        "무엇이든 측정할 수 있다면, 개선할 수 있다",
        "논리적인 사고가 문제를 해결한다",
        "데이터는 우리의 길잡이다",
        "결과는 노력을 배신하지 않는다",
        "구체적인 사실이 필요하다",
        "감정은 논리를 대체할 수 없다",
        "계획 없이는 성공도 없다",
        "증거가 모든 것을 말해준다",
        "사실이 진실을 밝혀준다"
        )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_last_t)
        val textView: TextView = findViewById(R.id.random_t)
        val randomText = getRandomText()
        textView.text = randomText
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val back_1: Button = findViewById(R.id.rollback)
        back_1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun getRandomText(): String {
        val randomIndex = Random.nextInt(randomTexts.size)
        return randomTexts[randomIndex]
    }
}