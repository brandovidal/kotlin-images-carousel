package com.brandovidal.imagescarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.listener.CarouselListener
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity : AppCompatActivity() {
    private val list = mutableListOf<CarouselItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carousel: ImageCarousel = findViewById(R.id.carousel)

        list.add(CarouselItem("https://d2e5b8shawuel2.cloudfront.net/vehicle/273229/hlv/original.jpg", "Ford KA"))
        list.add(CarouselItem("https://i.ytimg.com/vi/oH5U9EMG19k/maxresdefault.jpg", "Suran 2013"))
        list.add(CarouselItem("https://fotos.perfil.com/2019/03/27/toyota-gt86-653436.jpg", "Toyota 86"))

        carousel.addData(list)

        // Carousel listener
        carousel.carouselListener = object : CarouselListener {
            override fun onClick(position: Int, carouselItem: CarouselItem) {
                Toast.makeText(this@MainActivity, "Auto: ${carouselItem.caption}", Toast.LENGTH_SHORT).show()
            }

            override fun onLongClick(position: Int, dataObject: CarouselItem) {
                // ...
            }

        }
    }
}