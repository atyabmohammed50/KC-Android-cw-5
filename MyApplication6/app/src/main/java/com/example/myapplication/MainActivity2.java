package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    Bundle bundle = getIntent().getExtras();
        TextView Name1 = findViewById(R.id.name1);
        TextView Age2 = findViewById(R.id.age1);
    //Name
    String item1 =bundle.getString("item1");
    Name1.setText(item1);

    //Age
    int item2 = bundle.getInt("item2");
    Age2.setText(String.valueOf(item2));





    }
}