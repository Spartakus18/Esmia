package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class API extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_p_i);

        WebView page = findViewById(R.id.web1);

        page.getSettings().setJavaScriptEnabled(true);
        page.loadUrl("https://api.lyrics.ovh/v1/PNL/Jusqu'au dernier gramme");

        EditText edt1 =findViewById(R.id.text_api);
        EditText edt2 =findViewById(R.id.text1_api);
        TextView text =findViewById(R.id.text);
        Button b =findViewById(R.id.button_api);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(API.this);
                String url = "https://api.lyrics.ovh/v1/"+edt1.getText().toString()+"/"+edt2.getText().toString();
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                text.setText("Response is:"+ response.substring(0,550));

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        text.setText("Ne marche pas");
                    }
                });

                queue.add(stringRequest);

                String valeur=edt1.getText().toString();
                String vl=edt2.getText().toString();
                Toast.makeText(getApplicationContext(),"bien ajouter la musique de:"+valeur+vl,Toast.LENGTH_SHORT).show();
            }
        });
    }
}