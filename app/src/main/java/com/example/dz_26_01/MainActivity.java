package com.example.dz_26_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText plainText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Получаем ссылку на TextView
        textView = findViewById(R.id.textView);

        // Получаем ссылку на кнопку
        Button button = findViewById(R.id.button);

        // Получаем ссылку на Plain Text (EditText)
        plainText = findViewById(R.id.editTextText);

        // Настраиваем слушатель кликов для кнопки
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Получаем текст из Plain Text
                String inputText = plainText.getText().toString();
                // Устанавливаем текст в TextView
                textView.setText(inputText);
                // При нажатии кнопки делаем textView2 видимым
                textView.setVisibility(View.VISIBLE);
            }
        });
    }
}
