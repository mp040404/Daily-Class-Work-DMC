package com.example.app04;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private  static final  String TAG = "DetailsActivity";
    TextView textname,textemail,textmobile;
    Button back;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"onCreate()");

        textname=findViewById(R.id.textname);
        textemail=findViewById(R.id.textemail);
        textmobile=findViewById(R.id.textmobile);
        back=findViewById(R.id.back);

        Intent intent = getIntent();

        Person p1 = (Person)  intent.getSerializableExtra("person");
        textname.setText("Name :"+p1.getName());
        textemail.setText("Email: "+p1.getEmail());
        textmobile.setText("mobile"+p1.getMobile());
        getSupportActionBar().hide();



    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"onDestroy()");
    }

    public void back(View view){
        finish();
    }

}
