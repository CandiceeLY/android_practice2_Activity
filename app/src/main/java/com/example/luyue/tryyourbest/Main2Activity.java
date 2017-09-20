package com.example.luyue.tryyourbest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
     //   String name = intent.getStringExtra("name");
    //    Integer age = intent.getIntExtra("age",20);

        LayoutInflater inflater = getLayoutInflater();
       // final View v1 = inflater.inflate(R.layout.activity_main, null);
       // final EditText editText3 =(EditText)v1.findViewById(R.id.editText3);
        String str2 = intent.getStringExtra("message");
        Toast.makeText(Main2Activity.this, str2, Toast.LENGTH_LONG).show();

        Button button = (Button)findViewById(R.id.ButtonReturn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Main2Activity.this,MainActivity.class);
            //    String name = intent.getStringExtra("name");
                // Integer age = intent.getIntExtra("age",20);
                //intent.putExtra("result","姓名："+ name +" 年龄:" + age);
                EditText editText3=(EditText)findViewById(R.id.editText3);
                intent.putExtra("message",editText3.getText().toString());
                setResult(0,intent);
                finish();
            }
        });
    }

}
