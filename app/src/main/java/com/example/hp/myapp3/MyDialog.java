package com.example.hp.myapp3;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyDialog extends Dialog {
    private TextView tvMsg;
    private EditText userName;
    private EditText password;
    private Button btnOK;
    private Button btnCancel;
    public MyDialog(Context context){
        super(context);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_dialog);
        tvMsg =(TextView) findViewById(R.id.tv_msg);
        userName=(EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnCancel=(Button) findViewById(R.id.btn_cancle);
        btnOK=(Button) findViewById(R.id.btn_ok);
        userName.setText("");
        password.setText("");
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }
}
