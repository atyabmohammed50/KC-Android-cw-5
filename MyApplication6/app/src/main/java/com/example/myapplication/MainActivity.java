package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.Name);
        EditText age = findViewById(R.id.Age);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String Nm  = name.getText().toString();
               int AG = Integer.parseInt(age.getText().toString());

                Intent it = new Intent(MainActivity.this,MainActivity2.class);
                it.putExtra("item1",Nm);
                it.putExtra("item2",AG);


                startActivity(it);





            }
        });
    }











}