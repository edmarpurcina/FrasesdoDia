package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        TextView text = findViewById(R.id.textView);
        String[] frases = {
                "Bom dia Flor do dia!",
                "Onde você for, lá você estará!",
                "Hakuna Matata!",
                "Os seus problemas vcoê tem que esquecer!"
        };
        int numero = new Random().nextInt(4);

        text.setText(frases[numero]);


    }

}
