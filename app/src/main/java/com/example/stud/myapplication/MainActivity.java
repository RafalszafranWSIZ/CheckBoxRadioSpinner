package com.example.stud.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rbOpcja1;
    RadioButton rbOpcja2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rbOpcja1 = findViewById(R.id.rbOpcja1);
        rbOpcja2 = findViewById(R.id.rbOpcja2);

        View.OnClickListener Listner = new View.OnClickListener(){

            @Override
            public void onClick (View view){

                RadioButton RADIO = (RadioButton) view;
                Toast.makeText(view.getContext(), "Przycisk został kliknięty!", Toast.LENGTH_LONG).show();
                if (view.getId() == R.id.rbOpcja1){}
                else if (view.getId() == R.id.rbOpcja2){}


            }

        };
        rbOpcja1.setOnClickListener(Listner);
        rbOpcja2.setOnClickListener(Listner);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence>adapter=ArrayAdapter.createFromResource (this ,
                R.array.planety,android.R.layout.simple_spinner_item);


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item );
        spinner.setAdapter(adapter);
        spinner.setSelection(2);
        spinner.setOnItemSelectedListener( new AdapterView.OnItemSelectedListener() {
            String[] planety = getResources().getStringArray(E.array.planety);


            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }
}


