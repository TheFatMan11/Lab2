package com.thuydev.lab2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bai22 extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai2);

        Button btn2a = findViewById(R.id.btn22);
        EditText ten = findViewById(R.id.edithoten);
        EditText ma = findViewById(R.id.editma);
        EditText tuoi = findViewById(R.id.edittuoi);
        RadioButton man = findViewById(R.id.nam);
        RadioButton woman = findViewById(R.id.nu);
        CheckBox one = findViewById(R.id.so1);
        CheckBox two = findViewById(R.id.so2);

        TextView showname = findViewById(R.id.showten);
        TextView showid = findViewById(R.id.showma);
        TextView showyearl = findViewById(R.id.showtuoi);
        TextView showgioitinh = findViewById(R.id.showgt);
        TextView showsothich = findViewById(R.id.showst);

        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = ten.getText().toString();
                String b = ma.getText().toString();
                String c = tuoi.getText().toString();
                String h = "Đá bóng";
                String j = "Chơi game";
                String kk ="";
                boolean tes = false;
                boolean d = man.isChecked();
                boolean e = one.isChecked();
                boolean f = two.isChecked();

                showname.setText("Họ Tên : "+a);
                showid.setText("Mã : "+b);
                showyearl.setText("Tuổi: "+c);

                if(d==true){
                    showgioitinh.setText("Giới tính: Nam");
                }else{
                    showgioitinh.setText("Giới tính: Nữ");
                }

                if(e){
                    kk=h;
                    if(f){
                        kk=h+" , "+j;
                        tes=true;
                    }
                }
                if(f&&tes==false){
                    kk=j;
                }

                if(kk.length()==0){
                    showsothich.setText("Sở thích không có");
                }else{
                    showsothich.setText("Sở thích: "+kk);
                }

            }
        });

    }
}
