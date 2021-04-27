package com.example.newsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {


    private Button buttonDepartments, buttonOffices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //  load the layout resource from the app code
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create button
        buttonDepartments = findViewById(R.id.buttonDepartments);
        buttonOffices = findViewById(R.id.buttonOffices);

        buttonDepartments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecondActivity();
            }
        });

        buttonOffices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThirdActivity();
            }
        });

    }

        public void openSecondActivity() {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        }

        public void openThirdActivity() {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        }
}
