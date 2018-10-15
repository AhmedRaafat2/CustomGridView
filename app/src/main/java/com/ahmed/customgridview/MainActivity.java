package com.ahmed.customgridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> food;

    GridView gridView;
    Food foodobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food = new ArrayList<>();
        food.add(new Food("Cheese Burger","3.5$",R.drawable.burger));
        food.add(new Food("Chicken Shawrma","3.5$",R.drawable.shawerma));
        food.add(new Food("Pan Cake","2.99$",R.drawable.pancakes));
        food.add(new Food("Pepperoni Pizza","3.99$",R.drawable.pizza));
        food.add(new Food("Fillet Stick","10.5$",R.drawable.filletsteak));
        food.add(new Food("Chocolate Waffle","2.5$",R.drawable.waffles));

        gridView = findViewById(R.id.grid);
        FoodAdaptor foodAdaptor = new FoodAdaptor(this,food);
        gridView.setAdapter(foodAdaptor);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                foodobj = (Food) gridView.getAdapter().getItem(position);
                String title = foodobj.getTitle();
                String price = foodobj.getPrice();
                int imageID = foodobj.getImageId();

                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("title", title);
                intent.putExtra("price",price);
                intent.putExtra("imageId",imageID);
                startActivity(intent);
            }
        });


    }
}
