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

public class TricksFragment extends Fragment {
    private static final String TAG = "TricksFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tricks_fragment, container, false);

        return view;
    }

    public void doTrick(View target) {
        Button b = (Button)target;
        String buttonText = b.getText().toString();
        System.out.println(buttonText);
    }
}
