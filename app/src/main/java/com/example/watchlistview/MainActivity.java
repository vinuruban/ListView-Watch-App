package com.example.watchlistview;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        String[] phones = {"Samsung S10 5G", "iPhone 7", "Google Pixel 7A", "OnePlus Pro 8", "iPhone 11 Pro Max", "Samsung S8"};

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, phones);

        listView.setAdapter(arrayAdapter);

        // Enables Always-on
        setAmbientEnabled();
    }
}
