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

class lastF : AppCompatActivity() {

    private val randomTexts = arrayOf(
        "가는 말이 고와야오는 말이 곱다",
        "고생 끝에 낙이 온다",
        "공든 탑이 무너지랴",
        "등잔 밑이 어둡다",
        "새 술은 새 부대에",
        "가는 날이 장날이다",
        "낮말은 새가 듣고 밤말은 쥐가 듣는다",
        "원숭이도 나무에서 떨어진다",
        "호랑이도 제 말 하면 온다",
        "물에 빠지면 지푸라기라도 잡는다",
        "백지장도 맞들면 낫다",
        "서당 개 삼 년에 풍월을 읊는다",
        "시작이 반이다",
        "소 잃고 외양간 고친다",
        "하늘이 무너져도 솟아날 구멍이 있다",
        "열 번 찍어 안 넘어가는 나무 없다",
        "도둑이 제 발 저리다",
        "개구리 올챙이 적 생각 못한다",
        "고양이 목에 방울 달기",
        "달면 삼키고 쓰면 뱉는다",
        "가는 날이 장날이다",
        "꿩 대신 닭",
        "도둑 맞고 사립문 고친다",
        "말 한마디에 천 냥 빚 갚는다",
        "바늘 도둑이 소 도둑 된다",
        "천 리 길도 한 걸음부터",
        "아니 땐 굴뚝에 연기 날까",
        "자라 보고 놀란 가슴 솥뚜껑 보고 놀란다",
        "친구 따라 강남 간다",
        "하늘의 별 따기"
    )
    @SuppressLint("MissingInflatedId", "WrongViewCast", )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_last_f)
        val textView: TextView = findViewById(R.id.random_f)
        val randomText = getRandomText()
        textView.text = randomText
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
        }
        val back_2: Button = findViewById(R.id.rollback)
        back_2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
    private fun getRandomText(): String {
        val randomIndex = Random.nextInt(randomTexts.size)
        return randomTexts[randomIndex]
    }
}