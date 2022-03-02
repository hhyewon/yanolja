package com.example.yanolja.src.hotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yanolja.R
import com.example.yanolja.databinding.ActivityHotelListBinding

data class Hotel(
    val hotelImg: Int,
    val hotelOptionImg: Int,
    val hotelLocation: String,
    val hotelName: String,
    val grade: String,
    val starRating: Int,
    val rating: String,
    val auth:Int,
    val price:String,
    val review: String
)

class MainActivity : AppCompatActivity() {

    val HotelArrayList = ArrayList<Hotel>()

    private lateinit var hotelAdapter: HotelAdapter

    private lateinit var binding: ActivityHotelListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHotelListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        hotelAdapter = HotelAdapter(this, HotelArrayList)

        binding.hotelListRv.adapter= hotelAdapter

        binding.hotelListRv.layoutManager=LinearLayoutManager(this)

        HotelArrayList.add(
            Hotel(
               R.drawable.glad,
                R.drawable.hoteltype,
                "공덕역 바로 앞",
                "글래드 마포",
                "4성급",
                R.drawable.star,
                "4.8",
                R.drawable.auth,
                "126,500",
                "5,114"
            )
        )

        HotelArrayList.add(
            Hotel(
                R.drawable.glad,
                R.drawable.hoteltype,
                "공덕역 바로 앞",
                "롯데시티호텔 마포",
                "4성급",
                R.drawable.star,
                "4.8",
                R.drawable.auth,
                "예약마감",
                "5,114"
            )
        )

        HotelArrayList.add(
            Hotel(
                R.drawable.glad,
                R.drawable.hoteltype,
                "공덕역 바로 앞",
                "라이즈 오토그래프 컬렉션 바이 메리어트",
                "4성급",
                R.drawable.star,
                "4.8",
                R.drawable.auth,
                "218,900",
                "5,114"
            )
        )






    }
    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION)
        }
    }
}