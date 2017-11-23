package com.example.a38238.nuancedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private TextView viewText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewText=(TextView)findViewById(R.id.displayText);
        viewText.setText("Mic Off");
    }
    public void onToggleClicked(View view) {
        // Is the toggle on?
        boolean on = ((ToggleButton) view).isChecked();
        if (on) {

            viewText.setText("Mic On");
        } else {
            // Disable vibrate
            viewText.setText("Mic Off");
        }
    }

    // remaining  code goes here ddd
 


}
