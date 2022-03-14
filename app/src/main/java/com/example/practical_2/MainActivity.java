package com.example.practical_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int myCount = 0;
    private TextView myShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myShowCount = (TextView) findViewById(R.id.show_count);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view){
        myCount++;
        if (myShowCount!= null){
            myShowCount.setText(Integer.toString(myCount));
        }

    }


}