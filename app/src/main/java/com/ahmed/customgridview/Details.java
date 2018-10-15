package com.ahmed.customgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    TextView titleV,priceV;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        titleV = findViewById(R.id.name);
        priceV = findViewById(R.id.price);
        image = findViewById(R.id.image2);

        String title = getIntent().getStringExtra("title");
        String price = getIntent().getStringExtra("price");
        int imageId = getIntent().getIntExtra("imageId",0);

        titleV.setText(title);
        priceV.setText(price);
        image.setImageResource(imageId);



    }
}
