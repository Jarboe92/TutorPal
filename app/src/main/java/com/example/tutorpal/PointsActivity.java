package com.example.tutorpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PointsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        final Button apple = (Button) findViewById(R.id.apple);
        final Button nike = (Button) findViewById(R.id.nike);
        final Button adidas = (Button) findViewById(R.id.adidas);
        final Button dell = (Button) findViewById(R.id.dell);


        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PointsActivity.class);
                startActivity(intent);

//                Snackbar mySnackbar = Snackbar.make(view, stringId, duration);
            }
        });
    }
}
