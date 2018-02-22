package com.example.lenovoadmin_dev.listview_practice;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<Holder> {

    private ArrayList<Holder> list = new ArrayList<>();
    private int layoutRes;

    public MyCustomAdapter(@NonNull Context context, int resource, @NonNull List<Holder> objects) {
        super(context, resource, objects);
        this.layoutRes = resource;
        this.list.addAll(objects);
        Log.i("Tag",list.toString());

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public Holder getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //  convertView = getLayoutInflater().inflate(layoutRes,parent,false);

        if (convertView == null) {
            Context context = getContext();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
          //  MainActivity mainActivity = new MainActivity();
            convertView = inflater.inflate(layoutRes, parent, false);}

        ImageView imageview =  convertView.findViewById(R.id.imageView);
        TextView textView_name = convertView.findViewById(R.id.textView_name);
        TextView textView_description =  convertView.findViewById(R.id.textView_description);

        Holder holder = getItem(position);

        imageview.setImageResource(holder.imgid);
        textView_name.setText(holder.name);
        textView_description.setText(holder.description);

        return convertView;
    }


}