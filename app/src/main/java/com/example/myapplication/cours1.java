package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cours1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours1);

        Button b3 =findViewById(R.id.v5);
        EditText ed1 =findViewById(R.id.text1);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valeur = ed1.getText().toString();

                AlertDialog alertDialog = new AlertDialog.Builder(cours1.this).create();
                alertDialog.setTitle("Information");
                alertDialog.setMessage("welcome to dear user"+valeur);
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                });
                alertDialog.show();
                //Toast.makeText(getApplicationContext(), "io eeee"+valeur, Toast.LENGTH_LONG).show();
            }
        });
    }
}