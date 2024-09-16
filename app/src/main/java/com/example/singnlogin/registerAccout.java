package com.example.singnlogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registerAccout extends AppCompatActivity {
    EditText Name;
    EditText sdt;
    EditText userName;
    EditText passWord;
    EditText passWordComfirm;
    Button buttonDangKi;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register_accout);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        Name = findViewById(R.id.name);
        sdt = findViewById(R.id.sdt);
        userName = findViewById(R.id.username);
        passWord = findViewById(R.id.password);
        passWordComfirm = findViewById(R.id.passwordConfirm);
        buttonDangKi = findViewById(R.id.registerButton);
        tv = findViewById(R.id.showDangKi);
        buttonDangKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Name: " + Name.getText().toString() + " "+ "SDT: "+sdt.getText().toString() + "\nUserName: "+userName.getText().toString()+ " "+ "PassWord: "+passWord.getText().toString()+" "+ "PassWordComfirm: "+passWordComfirm.getText().toString());
            }
        });
    }
}