package com.example.dnd_inventory;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FragmentAddItem extends Fragment {

   private EditText name, weight, amount, describtion;
   private Spinner type;
   private CheckBox magical;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_display_items, container, false);
        init(view);

        return view;
    }

    private void init(View v){
        //editText
        name = v.findViewById(R.id.editText_nameOfItem);
        weight = v.findViewById(R.id.editText_WeightOfItem);
        amount = v.findViewById(R.id.editText_AmountOfItem);
        describtion = v.findViewById(R.id.editText_describtion);

        //Spinner
        type = v.findViewById(R.id.spinner_item_type);
        ArrayAdapter<CharSequence> adapter =  ArrayAdapter.createFromResource(
                Objects.requireNonNull(getContext()),
                R.array.spin_data,
                android.R.layout.simple_spinner_dropdown_item);

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        type.setAdapter(adapter);
        //checkbox
        magical = v.findViewById(R.id.checkbox_isMagical);

    }
}
