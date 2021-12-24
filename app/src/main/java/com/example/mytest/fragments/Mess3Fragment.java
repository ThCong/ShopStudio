package com.example.mytest.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.mytest.All_product;
import com.example.mytest.MainActivity;
import com.example.mytest.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Mess3Fragment extends Fragment {
    Button btnShopNow;
    ImageView imvBack;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_mess3, container, false);

        btnShopNow = view.findViewById(R.id.btnShopNowMess3);
        btnShopNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), All_product.class));
            }
        });

        imvBack = view.findViewById(R.id.imvBack);
        imvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().remove(Mess3Fragment.this).commit();
                BottomNavigationView bottomNavigationView = MainActivity.bottomNavigationView;
                bottomNavigationView.setVisibility(View.VISIBLE);
            }
        });
        return view;
    }
}