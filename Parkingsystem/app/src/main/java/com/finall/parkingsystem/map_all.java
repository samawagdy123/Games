package com.finall.parkingsystem;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class map_all extends AppCompatActivity {
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_all);
        list = findViewById(R.id.ListOfParking);

        List<book> b = new ArrayList<>();
        String[] mTitle = {"A1", "A2"};
        String[] mdescription = {"This parking is Available for you", "This parking is NOT Available"};
        int[] img = {R.drawable.car2, R.drawable.car1};
        for (int i = 0; i <= mTitle.length; i++) {
            b.add(new book(mTitle[i], mdescription[i], img[i]));
        }
//creat adapter
        ParkingAdapter adapter = new ParkingAdapter(b, this);
        //put adapter on list
        list.setAdapter(adapter);
   list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
       @Override
       public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

           adapter.selectedItem(position);
           adapter.notifyDataSetChanged();

       }
   });
    }
}