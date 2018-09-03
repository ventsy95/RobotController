package com.robot.controller.robotcontroller;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ventsi.mihalov on 9/3/2018.
 */

public class BasicFragment extends Fragment {

    private static final String TAG = "BasicFragment";
    private Button buttonCamUp;
    private Button buttonCamDown;
    private Button buttonCamLeft;
    private Button buttonCamRigt;
    private Button buttonForward;
    private Button buttonBack;
    private Button buttonLeft;
    private Button buttonRight;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.basic_fragment, container, false);

        buttonCamUp = (Button)view.findViewById(R.id.button5);
        buttonCamDown = (Button)view.findViewById(R.id.button8);
        buttonCamLeft = (Button)view.findViewById(R.id.button6);
        buttonCamRigt = (Button)view.findViewById(R.id.button7);
        buttonForward = (Button)view.findViewById(R.id.button2);
        buttonBack = (Button)view.findViewById(R.id.button4);
        buttonLeft = (Button)view.findViewById(R.id.button);
        buttonRight = (Button)view.findViewById(R.id.button3);

        buttonCamUp.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonCamDown.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonCamLeft.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonCamRigt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonForward.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonBack.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonLeft.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });
        buttonRight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                move(view);
            }
        });

        return view;
    }

    public void move(View target) {
        Button b = (Button)target;
        String buttonText = b.getText().toString();
        System.out.println(buttonText);
    }
}
