package com.example.responsi_086

object Detail {
    private val foodName = arrayOf(
        "Bika Ambon",
        "Gudek",
        "Kerak Telor",
        "Mendoan",
        "Mie Aceh",
        "Pempek Kapal Selam",
        "Rendang Jengkol",
        "Rendang",
        "Sate Padang",
        "Soto Ayam"
    )

    private val detail = arrayOf(
        "Bika Ambon adalah makanan yang berasal dari kota Medan",
        "Gudek adalah makanan yang berasal dari kota Yogyakarta",
        "Kerak Telor adalah makanan yang berhasal dari kota Jakarta",
        "Mendoan adalah makanan yang berhasal dari Banyumas ",
        "Mie Aceh adalah makanan yang berhasal dari Aceh",
        "Pempek Kapal Selam adalah makanan yang berhasal dari Palembang",
        "Rendang Jengkol adalah makanan yang berhasal dari Padang",
        "Rendang adalah makanan yang berhasal dari Padang",
        "Sate Padang adalah makanan yang berhasal dari Padang",
        "Soto Ayam adalah makanan yang berhasal dari Indonesia"
    )

    private val foodPoster = intArrayOf(
        R.drawable.pict1,
        R.drawable.pict2,
        R.drawable.pict3,
        R.drawable.pict4,
        R.drawable.pict5,
        R.drawable.pict6,
        R.drawable.pict7,
        R.drawable.pict8,
        R.drawable.pict9,
        R.drawable.pict10
    )

    val listFood: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodName.indices) {
                val food = Food()
                food.name = foodName[position]
                food.detail = detail[position]
                food.poster = foodPoster[position]
                list.add(food)
            }
            return list
        }
}