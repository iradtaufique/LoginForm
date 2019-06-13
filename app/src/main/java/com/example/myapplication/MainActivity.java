package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    EditText etname;
    Button btnSend;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etname = findViewById(R.id.editTextName);
    }

    public void login(View view) {
        String  name = etname.getText().toString();

        Intent in = new Intent(this,second.class);
        in.putExtra("data",name);
        startActivity(in);

    }//end of button login

    public void Register(View view) {
       // String  name = etname.getText().toString();

        Intent intent = new Intent(this, Register.class);
        EditText editText = (EditText) findViewById(R.id.editTextName);
        String message = editText.getText().toString();
        startActivity(intent);

    }//end of register button

}
