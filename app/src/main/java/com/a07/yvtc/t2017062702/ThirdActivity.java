package com.a07.yvtc.t2017062702;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }
    public void click2(View v)
    {
        Intent it = new Intent();
        EditText ed = (EditText) findViewById(R.id.editText);
        it.putExtra("username",ed.getText().toString());
        setResult( RESULT_OK, it);
        finish();
    }

}
