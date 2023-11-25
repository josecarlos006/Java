package telas_continuacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.codeplus.Categorias;
import com.example.codeplus.R;

import telas2.Error;
import telas2.logica_de_programacao1;

public class logica_de_programacao2 extends AppCompatActivity {

    private ImageView btVoltar;
    private ImageView btProximo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logica_de_programacao2);
        btVoltar = findViewById(R.id.btVoltar);
        btProximo = findViewById(R.id.btProximo);

        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), logica_de_programacao1.class);

                startActivity( intent );
            }
        });

        btProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), logica_de_programacao3.class);

                startActivity( intent );
            }
        });
    }
}