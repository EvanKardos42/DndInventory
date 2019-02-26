package com.example.dnd_inventory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentTransaction transaction ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentDisplayItems frag = new FragmentDisplayItems();

        getSupportFragmentManager().beginTransaction()
                                    .add(R.id.actvity_main_container,frag)
                                    .commit();
        transaction = getSupportFragmentManager().beginTransaction();
    }

    /*
     notes on how to do fragment transition
     transaction.replace(R.id.fragment_container, newFragment);
     transaction.addToBackStack(null);

    // Commit the transaction
    transaction.commit();
     */
}
