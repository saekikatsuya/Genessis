package com.yvjing.second_level2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yvjing on 2015/12/11.
 */
public class StudentAdapter extends ArrayAdapter<Student> {
    private int resourceId;

    public StudentAdapter(Context context,int resource,List<Student> objects){
        super(context,resource,objects);
        resourceId=resource;
    }

    @Override
    public View getView(int position,View convertView,ViewGroup parent){
        Student student=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId, null);
        TextView textView1=(TextView)view.findViewById(R.id.tv_item);
        TextView textView2=(TextView)view.findViewById(R.id.tv_item2);
        textView1.setText(student.getName());
        textView2.setText(student.getGrade());
        return view;
    }
}
