package com.a07.yvtc.t2017062702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        Intent it = getIntent();
        int a = it.getIntExtra("va",0);
        int b = it.getIntExtra("vb",0);
        TextView tv = (TextView) findViewById( R.id.textView);
        tv.setText(String.valueOf(a+b));
    }
}
