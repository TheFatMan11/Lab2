package com.thuydev.lab2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnn = findViewById(R.id.btn);
        EditText te = findViewById(R.id.txtHoten);


        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = te.getText().toString();
                Intent intent = new Intent(MainActivity.this, bai22.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,a+" Đã đăng ký thành công",Toast.LENGTH_SHORT).show();
            }
        });

    }
}