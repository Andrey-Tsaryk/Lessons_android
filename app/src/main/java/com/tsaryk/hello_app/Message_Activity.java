package com.tsaryk.hello_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Message_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        // Получаем объект Intent, который запустил данную activity
        Intent intent = getIntent();

        // Получаем сообщение из объекта intent
        String message = intent.getStringExtra("message");

        // Получаем TextView по его id
        TextView messageText = (TextView) findViewById(R.id.messageText);

        // устанавливаем текст для TextView
        messageText.setText(message);
    }
}