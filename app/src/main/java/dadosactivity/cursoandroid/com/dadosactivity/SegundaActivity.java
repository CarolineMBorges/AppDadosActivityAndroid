package dadosactivity.cursoandroid.com.dadosactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SegundaActivity extends Activity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        texto = findViewById(R.id.textoId);

        /*
            O método putExtra("chave","valor") serve para adicionar um objeto o valor para uma
            intent para enviar para outra Activity.
            O método getExtra("chave") serve para recuperar o valor enviado a uma Activity.
        */

        Bundle extra = getIntent().getExtras();

        if (extra != null){
            String textoPassado = extra.getString("nome");
            texto.setText(textoPassado);
        }

    }
}
