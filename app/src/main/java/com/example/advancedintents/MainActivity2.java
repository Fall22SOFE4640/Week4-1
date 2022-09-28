package com.example.advancedintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtName = findViewById(R.id.txtName);
    }

    public void sendDataToActivity1(View view) {
        String nameInput = txtName.getText().toString();
        if(nameInput !=null) {
            Intent intent = new Intent();
            intent.putExtra("KEY_NAME", nameInput);
            setResult(RESULT_OK, intent);
            finish();
        }


    }
}