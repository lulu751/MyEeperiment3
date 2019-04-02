package com.example.hp.myapp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TestActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydialog);
        MyDialog myDialog = new MyDialog(this);
        myDialog.show();
    }
}
