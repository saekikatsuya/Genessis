package com.yvjing.third_fragment;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentActivity extends Fragment {

    private TextView tv1;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.activity_fragment,container,false);
        tv1=(TextView)view.findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"四级考试完了,我们都很怀念它【笑着哭",Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}