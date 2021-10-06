package com.fivefowlers.hargy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //TODO make a new connection
    //TODO user info
    //TODO make a group
    //TODO see friends and past connections



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView newConnectionButton = (ImageView)findViewById(R.id.newConnection);
        newConnectionButton.setOnClickListener(v -> {
            //go to make a new connection activity
        });

        ImageView friends = (ImageView)findViewById(R.id.friends);
        friends.setOnClickListener(v -> {
            //go to friends page
        });

    }
}