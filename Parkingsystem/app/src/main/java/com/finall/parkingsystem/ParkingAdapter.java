package com.finall.parkingsystem;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ParkingAdapter extends BaseAdapter {
    List<book> L;
    Context c;
    int position;
    View view2;


    ParkingAdapter(List<book> L, Context c) {
        this.L = L;
        this.c = c;
    }

    @Override
    //count item  in the list
    public int getCount() {
        return L.size();
    }

    //return item on this position
    @Override
    //position بيتعرف عليه اتومتك من اللى انا واقف عليه
    public book getItem(int position) {
        return L.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    //setting the position of the selected item:
    public void selectedItem(int position)
    {
        this.position = position;
    }

    //the whole inflate
    @SuppressLint("InflateParams")
    @Override
    // convertview = activity
    //parent = listview
    public View getView(int position, View convertView, ViewGroup parent) {
        //inflate
        viewHolder h;
        if (convertView == null) {
            //inflnte done by class
            LayoutInflater inflater = LayoutInflater.from(/*where we do the inflate process*/ c);
            convertView = inflater.inflate(/*التصميم اللى عاوز اعمله انفلات*/R.layout.all ,/*يتعمله انفلات على ايه*/parent,/*عملت الكلام ده قبل كده*/false);
            h = new viewHolder(convertView);
            convertView.setTag(h);
        } else {
            h = (viewHolder) convertView.getTag();
        }
        book B = getItem(position);
        h.Img.setImageResource(B.getRimgs());
        h.Main.setText(B.getRtitle());
        h.Sub.setText(B.getRdescription());

        if(this.position == position)
        {
            LayoutInflater inflater = LayoutInflater.from(/*where we do the inflate process*/ c);
            view2 = inflater.inflate(R.layout.not_all, null);
            TextView t = (TextView) view2.findViewById(R.id.main);
            TextView s = (TextView) view2.findViewById(R.id.sub);
            ImageView I = (ImageView) view2.findViewById(R.id.pic);

            t.setText(B.getRtitle());
            s.setText(B.getRdescription());
            I.setImageResource(B.getRimgs());

            return view2;
        }


        return convertView;
    }

    //get data to put on layout
    public static class viewHolder {
        ImageView Img;
        TextView Main;
        TextView Sub;
        viewHolder( View convertView){
            Img= convertView.findViewById(R.id.pic);
            Main= convertView.findViewById(R.id.main);
            Sub= convertView.findViewById(R.id.sub);
        }

    }

}

