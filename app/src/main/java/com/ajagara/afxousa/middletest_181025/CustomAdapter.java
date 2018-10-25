/*
package com.ajagara.afxousa.middletest_181025;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {
    private Context mContext;
    private int mResource;
    private ArrayList<Item> mArray = new ArrayList<Item>();

    public CustomAdapter(Context context, int resource, ArrayList<Item> array){
        mContext = context;
        mResource = resource;
        mArray = array;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(mResource,parent,false);
        }

        TextView textView=(TextView)convertView.findViewById(R.id.);
        textView.setText();

        return convertView;
    }
}

class Item{
    String Class;
    String Date;
    String Location;
}
*/
