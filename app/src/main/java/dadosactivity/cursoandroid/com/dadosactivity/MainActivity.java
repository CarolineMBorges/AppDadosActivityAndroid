package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botao = findViewById(R.id.botaoId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);

                /*
                    O método putExtra("chave","valor") serve para adicionar um objeto o valor para uma
                    intent para enviar para outra Activity.
                    O método getExtra("chave") serve para recuperar o valor enviado a uma Activity.
                */

                intent.putExtra("nome", "Caroline Machado Borges");

                startActivity( intent );
            }
        });
    }
}
