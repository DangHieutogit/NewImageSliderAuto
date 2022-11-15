package com.example.newimagesliderauto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider;



        imageSlider =findViewById(R.id.image_slider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.ic_p10_1, ScaleTypes.FIT));
        imageList.add(new SlideModel(R.drawable.ic_p10_2,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.ic_p10_3,ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.ic_iptrang,null));
        imageList.add(new SlideModel(R.drawable.ic_ipxanhduong,null));
        imageList.add(new SlideModel(R.drawable.ic_ipxanhla,null));

        imageSlider.setImageList(imageList);


    }
}