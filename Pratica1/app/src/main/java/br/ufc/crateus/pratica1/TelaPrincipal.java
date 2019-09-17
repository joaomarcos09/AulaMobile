package br.ufc.crateus.pratica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {

    Button buttonCadastrar;            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        buttonCadastrar = (Button) findViewById(R.id.buttonCadastrar);

        Intent intent = getIntent();
        String login = intent.getStringExtra("Login");
        String senha = intent.getStringExtra("Senha");
        if(login.equals("admin") && senha.equals("1234")){
            buttonCadastrar.setVisibility(View.VISIBLE);
        }else buttonCadastrar.setVisibility(View.GONE);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(TelaPrincipal.this, TelaCadastro.class);
                startActivity(i);
            }
        });

    }
}
