package com.example.listviewexampleespeciales;

import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String message = intent.getStringExtra("LISTVIEW_ITEM");
        TextView textView = findViewById(R.id.lblMensajeResultado);
        textView.setText(textView.getText().toString() + " " + message);
    }
}