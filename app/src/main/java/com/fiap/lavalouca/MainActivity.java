package com.fiap.lavalouca;

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


    public void sortearLouca(View view){

        TextView sorteado = findViewById(R.id.felicitadoLouca);

        int numero = new Random().nextInt(3);

        switch (numero){
            case 0:
                sorteado.setText("Sorteado é o Luan");
                break;

            case 1:
                sorteado.setText("Sorteado é o Luan 2");
                break;
            case 2:
                sorteado.setText("Sorteado é o Luan 3");
                break;
        }

    }
}
