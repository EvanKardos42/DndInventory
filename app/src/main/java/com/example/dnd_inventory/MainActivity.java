package com.example.dnd_inventory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        FragmentDisplayItems frag = new FragmentDisplayItems();

        getSupportFragmentManager().beginTransaction().add(R.id.actvity_main_container,frag);
    }
}
