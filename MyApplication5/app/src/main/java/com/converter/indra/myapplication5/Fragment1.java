package com.converter.indra.myapplication5;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.zip.Inflater;

/**
 * Created by Think.pad on 11/8/2017.
 */

public class Fragment1 extends Fragment {
    Button btn;
    Communicator comm;
    int i=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment1,container,false);
        btn=(Button)view.findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                comm=(Communicator)getActivity();
                i++;
                comm.communicate("You have clicked "+i+"Times");
            }
        });



       comm=(Communicator)getActivity();



        return view;
    }

}
