package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter.ItemAdapter_ListView;
import com.example.model.Myorders;

import java.util.ArrayList;

public class Track_My_Order extends AppCompatActivity {

    ListView lv;
    ArrayList<Myorders> items;
    ItemAdapter_ListView adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackmyorder_layout);

        lv = findViewById(R.id.lvTrackOrders);


        items = new ArrayList<Myorders>();
        items.add(new Myorders("", R.drawable.back));
        items.add(new Myorders("dc", R.drawable.banner_1));
        items.add(new Myorders("Lưsdzq", R.drawable.back));
        items.add(new Myorders("Ldscszq", R.drawable.back));
        items.add(new Myorders("Lsdsdzq", R.drawable.back));

        adapter = new ItemAdapter_ListView(this, R.layout.trackmyorder_customview, items);

        lv.setAdapter(adapter);

    }
}