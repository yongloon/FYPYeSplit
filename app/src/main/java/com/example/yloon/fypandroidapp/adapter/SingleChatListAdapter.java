package com.example.yloon.fypandroidapp.adapter;

/**
 * Created by YLoon on 3/12/2015.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.yloon.fypandroidapp.R;
import com.example.yloon.fypandroidapp.view.add_chatRoom_Activity;

import java.util.ArrayList;

public class SingleChatListAdapter extends BaseAdapter{
    ArrayList<String> result;
    Context context;
   // int [] imageId;
    private static LayoutInflater inflater=null;
    public SingleChatListAdapter(add_chatRoom_Activity viewPager, ArrayList<String> prgmNameList) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        context=viewPager;

        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv;
      //  ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.listitem_buddy, null);
        holder.tv=(TextView) rowView.findViewById(R.id.buddyText);
    //    holder.img=(ImageView) rowView.findViewById(R.id.imageView1);
        holder.tv.setText(result.get(position).toString());
       // holder.img.setImageResource(imageId[position]);

        return rowView;
    }

}