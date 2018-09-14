package com.robot.controller.robotcontroller;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

/**
 * Created by ventsi.mihalov on 9/3/2018.
 */

public class TricksFragment extends Fragment {
    private static final String TAG = "TricksFragment";
    private Button buttonWave;
    private Button buttonDuck;
    private Button buttonLedOn;
    private Button buttonLedOff;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tricks_fragment, container, false);

        buttonWave = (Button)view.findViewById(R.id.button12);
        buttonDuck = (Button)view.findViewById(R.id.button9);
        buttonLedOn = (Button)view.findViewById(R.id.button11);
        buttonLedOff = (Button)view.findViewById(R.id.button10);

        buttonWave.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                doTrick(view);
            }
        });
        buttonDuck.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                doTrick(view);
            }
        });
        buttonLedOn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                doTrick(view);
            }
        });
        buttonLedOff.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                doTrick(view);
            }
        });

        return view;
    }

    public void doTrick(View target) {
        Button b = (Button)target;
        String buttonText = b.getText().toString();
        switch(buttonText){
            case "Wave": request("wave"); break;
            case "Duck": request("duck"); break;
            case "Turn LED ON": request("ledOn"); break;
            case "Turn LED OFF": request("ledOff"); break;
        }
        System.out.println(buttonText);
    }

    private void request(String path){
        Context context = getActivity();
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(context);
        String url ="http://192.168.4.1/" + path;

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        //mTextView.setText("Response is: "+ response.substring(0,500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //mTextView.setText("That didn't work!");
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}
