package com.tsaryk.hello_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Метод обработки нажатия на кнопку
    public void sendMessage(View view) {


        // действия, совершаемые после нажатия на кнопку
        // Создаем объект Intent для вызова новой Activity
        Intent intent = new Intent(this, Message_Activity.class);

        // Получаем текстовое поле в текущей Activity
        EditText editText = (EditText) findViewById(R.id.editText);

        // Получаем текст данного текстового поля
        String message = editText.getText().toString();

        // Добавляем с помощью свойства putExtra объект - первый параметр - ключ,
        // второй параметр - значение этого объекта
        intent.putExtra("message", message);

        // запуск activity
        startActivity(intent);
    }
}