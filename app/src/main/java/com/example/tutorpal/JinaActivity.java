package com.example.tutorpal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class JinaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener{
    final String [] start = {"Start Time", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM",
            "6PM", "7PM", "8PM", "9PM", "10PM", "11PM", "12AM"};

    final String [] end = {"End Time", "12PM", "1PM", "2PM", "3PM", "4PM", "5PM",
            "6PM", "7PM", "8PM", "9PM", "10PM", "11PM", "12AM"};

    ImageView imageView1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jina);

        imageView1 = findViewById(R.id.back);
        imageView1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JinaActivity.this,
                        FindTutorActivity.class);

                JinaActivity.this.startActivity(intent);
            }
        });

        imageView2 = findViewById(R.id.next);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JinaActivity.this,
                        PaymentActivity.class);

                JinaActivity.this.startActivity(intent);
            }
        });


        Spinner spinner1 = findViewById(R.id.spinner);

        ArrayAdapter<String> one = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, start);
        spinner1.setAdapter(one);

        Spinner spinner2 = findViewById(R.id.spinner2);

        ArrayAdapter<String> two = new ArrayAdapter<>(this,
                R.layout.support_simple_spinner_dropdown_item, end);
        spinner2.setAdapter(two);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
