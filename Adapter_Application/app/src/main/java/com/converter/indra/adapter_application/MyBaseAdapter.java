package com.converter.indra.adapter_application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Think.pad on 7/21/2017.
 */

public class MyBaseAdapter  extends BaseAdapter {
     String[] name;
    String[] contact;
    int[] image;
    Context context;
    LayoutInflater inflater;

    public MyBaseAdapter(String[]name, String[] contact, int[] image, Context context) {
        this.name=name;
        this.contact = contact;
        this.image = image;
        this.context = context;
        this.inflater = inflater;
        inflater=LayoutInflater.from(context);
    }

   /* public MyBaseAdapter() {
    }*/

    @Override
    public int getCount() {
        return contact.length;
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
    public View getView(int position, View view, ViewGroup parent) {
        view=inflater.inflate(R.layout.base_adapter_layout,null);
        ImageView im=(ImageView) view.findViewById(R.id.iv);
         im.setImageResource(image[position]);
        TextView tv=(TextView)view.findViewById(R.id.tv1);
        tv.setText(contact[position]);
        TextView tv1=(TextView)view.findViewById(R.id.tv2);
        tv1.setText(name[position]);
        return view;

    }
}
