package com.example.responsi_086

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvFood = findViewById(R.id.rv_food)
        rvFood.setHasFixedSize(true)
        list.addAll(Detail.listFood)
        showFoodList()

        img_acount.setOnClickListener(){
            intent = Intent(this, AcountActivity::class.java)
            startActivity(intent)
        }


    }
    private fun showFoodList(){
        rvFood.layoutManager = LinearLayoutManager(this)
        val listFood = ListFood(list)
        rvFood.adapter = listFood
    }

}
