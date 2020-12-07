package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.myapplication2.R;

public class MainToast extends AppCompatActivity {
    private  Button showToastShort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast);
        showToastShort =  findViewById(R.id.showtoast);
        showToastShort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainToast.this,"猪",Toast.LENGTH_SHORT).show();
            }
        });



    }
}
