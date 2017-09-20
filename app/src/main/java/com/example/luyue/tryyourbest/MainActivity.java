package com.example.luyue.tryyourbest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.ButtonTransfer);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                EditText editText1 =(EditText)findViewById(R.id.editText1);
                intent.putExtra("message", editText1.getText().toString());
                startActivityForResult(intent, 0);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        LayoutInflater inflater = getLayoutInflater();
        // final View v2 = inflater.inflate(R.layout.activity_main2, null);
        if(requestCode==0 && resultCode==0){
            String str = data.getStringExtra("message");
            Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG).show();
        }
    }


}

