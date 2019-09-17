package br.ufc.crateus.pratica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editTextLogin;
    EditText editTextSenha;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLogin = (EditText) findViewById(R.id.editTextLogin);
        editTextSenha = (EditText) findViewById(R.id.editTextSenha);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TelaPrincipal.class);
                i.putExtra("Login", editTextLogin.getText().toString());
                i.putExtra("Senha", editTextSenha.getText().toString());
                startActivity(i);
            }
        });

    }
}
