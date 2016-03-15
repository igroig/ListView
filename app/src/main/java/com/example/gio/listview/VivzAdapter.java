package com.example.gio.listview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Giorgi on 8/28/2015.
 */
public class VivzAdapter extends BaseAdapter {
 ArrayList<SingleRow> list;
    Context context;

    VivzAdapter(Context c){
        context =c;
        list=new ArrayList<SingleRow>();

        Resources res=c.getResources();
        String[] titles = res.getStringArray(R.array.titles);
        String[] descriptions = res.getStringArray(R.array.descriptions);
        int [] images = {R.drawable.download,R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,R.drawable.download5,R.drawable.download6,R.drawable.download7};

        for(int i=0; i<8; i++){
        list.add(new SingleRow(titles[i],descriptions[i], images[i]));
        }
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = inflater.inflate(R.layout.single_row, parent ,false);

        TextView title = (TextView)row.findViewById(R.id.tv_title);
        TextView description = (TextView)row.findViewById(R.id.tv_description);
        ImageView image = (ImageView)row.findViewById(R.id.iv_picture);

        SingleRow temp=list.get(i);
        title.setText(temp.title);
        description.setText(temp.description);
        image.setImageResource(temp.image);

        return row;
    }

}


class SingleRow{
    String title;
    String description;
    int image;

    SingleRow(String title,String description,int image){
        this.title=title;
        this.description=description;
        this.image= image;
    }
}
