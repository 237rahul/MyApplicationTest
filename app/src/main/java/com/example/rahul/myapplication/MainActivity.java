package com.example.rahul.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but1=(Button)findViewById(R.id.college);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int1= new Intent(MainActivity.this,college.class);
                startActivity(int1);
            }
        });
        Button but2=(Button)findViewById(R.id.discover);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int2= new Intent(MainActivity.this,discover.class);
                startActivity(int2);
            }
        });
        Button but3=(Button)findViewById(R.id.create);

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int3= new Intent(MainActivity.this,create.class);
                startActivity(int3);
            }
        });
        Button but4=(Button)findViewById(R.id.profile);

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int4= new Intent(MainActivity.this,profile.class);
                startActivity(int4);
            }
        });
        Button but5=(Button)findViewById(R.id.classroom);

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent int5= new Intent(MainActivity.this,classroom.class);
                startActivity(int5);
            }
        });

    }
}
