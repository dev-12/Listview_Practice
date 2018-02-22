package com.example.lenovoadmin_dev.listview_practice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private ListView listView;

    int[] IMAGES = {R.drawable.bigb,R.drawable.gandhi,R.drawable.gopichand,R.drawable.kalam,
            R.drawable.kalpana,R.drawable.rahman,R.drawable.sachin,R.drawable.stevejobs,R.drawable.vajpayee};

    String[] NAMES = {"BIG B","GANDHI","PULLELA GOPICHAND","ABDUL KALAM","KALPANA CHAWLA","A R Rahman","SACHIN TENDULKAR","STEVE JOBS","VAJPAYEE"};

    String[] DESCRIPTIONS = {"Actor","Freedom Fighter","Sportsperson","Scientist","Astronaut","Music Director","Cricketer","Apple Founder","Former Prime Minister" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         listView = findViewById(R.id.listview);

        ArrayList<Holder> arr = new ArrayList<>();

        for(int i=0; i<9; i++){

            arr.add(new Holder(NAMES[i],DESCRIPTIONS[i],IMAGES[i]));
        }
        Log.i("Tag",String.valueOf(arr.size()));
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this,R.layout.customlayout,arr);
        listView.setAdapter(myCustomAdapter);

    }






}


