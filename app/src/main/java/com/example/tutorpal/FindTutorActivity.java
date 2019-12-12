package com.example.tutorpal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FindTutorActivity extends AppCompatActivity {

    int [] images = {R.drawable.raghav, R.drawable.robert, R.drawable.sofia,
            R.drawable.jina, R.drawable.btrix, R.drawable.jerry};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_tutor);

        listView = findViewById(R.id.listview);

        MyAdapter customAdapter = new MyAdapter();
        listView.setAdapter(customAdapter);

        //handle item clicks
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //Raghav
                if(position == 0) {
                    Intent intent = new Intent();
                    intent.setClass(FindTutorActivity.this, RaghavActivity.class);
                    startActivity(intent);
                }

                if(position == 1){
                    Intent intent = new Intent();
                    intent.setClass(FindTutorActivity.this, RobertActivity.class);
                    startActivity(intent);
                }

                if(position == 2){
                    Intent intent = new Intent();
                    intent.setClass(FindTutorActivity.this, SofiaActivity.class);
                    startActivity(intent);
                }

                if(position == 3){
                    Intent intent = new Intent();
                    intent.setClass(FindTutorActivity.this, JinaActivity.class);
                    startActivity(intent);
                }
            }
        });
    }




    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.tutor_layout, null);
            ImageView imageView = view.findViewById(R.id.avatar);
            imageView.setImageResource(images[position]);

            return view;
        }
    }
}