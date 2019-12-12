package com.example.tutorpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PointsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);

        final Button blaze = (Button) findViewById(R.id.blaze);
        final Button chipotle = (Button) findViewById(R.id.chipotle);
        final Button tenrens = (Button) findViewById(R.id.tenrens);
        final Button kft = (Button) findViewById(R.id.kft);
        final Button target = (Button) findViewById(R.id.target);
        final Button lidl = (Button) findViewById(R.id.lidl);
        final TextView points = (TextView) findViewById(R.id.points);

        final Button log_out = (Button) findViewById(R.id.log_out2);

//        MainActivity.start_points = 200;
        points.setText(String.valueOf(MainActivity.start_points));

        blaze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.start_points >= 800) {
                    Context context = getApplicationContext();
                    CharSequence text = "Blaze Code: blaze_code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    MainActivity.start_points -= 800;
                    points.setText(String.valueOf(MainActivity.start_points));
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Points";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        chipotle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.start_points >= 500) {
                    Context context = getApplicationContext();
                    CharSequence text = "Chipotle Code: chipotle_code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    MainActivity.start_points -= 500;
                    points.setText(String.valueOf(MainActivity.start_points));
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Points";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        tenrens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.start_points >= 200) {
                    Context context = getApplicationContext();
                    CharSequence text = "Ten Rens Code: tenrens_code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    MainActivity.start_points -= 200;
                    points.setText(String.valueOf(MainActivity.start_points));
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Points";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        kft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.start_points >= 100) {
                    Context context = getApplicationContext();
                    CharSequence text = "KFT Code: kft_code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    MainActivity.start_points -= 100;
                    points.setText(String.valueOf(MainActivity.start_points));
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Points";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        lidl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.start_points >= 1200) {
                    Context context = getApplicationContext();
                    CharSequence text = "Lidl Code: lidl_code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    MainActivity.start_points -= 1200;
                    points.setText(String.valueOf(MainActivity.start_points));
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Points";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        target.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (MainActivity.start_points >= 500) {
                    Context context = getApplicationContext();
                    CharSequence text = "Target Code: target_code";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    MainActivity.start_points -= 1500;
                    points.setText(String.valueOf(MainActivity.start_points));
                }
                else {
                    Context context = getApplicationContext();
                    CharSequence text = "Not Enough Points";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
            }
        });

        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StartActivity.class);
                startActivity(intent);
            }
        });
    }
}