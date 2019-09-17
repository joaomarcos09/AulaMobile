package br.ufc.crateus.pratica1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class TelaCadastro extends AppCompatActivity {

    EditText editTextIdade;
    EditText editTextGenero;
    EditText editTextNome;
    EditText editTextEmail;
    CheckBox checkBoxAviso;
    Spinner spinnerPais;
    Button buttonCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);

        editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        editTextGenero = (EditText) findViewById(R.id.editTextGenero);
        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        checkBoxAviso = (CheckBox) findViewById(R.id.checkBoxAviso);
        spinnerPais = (Spinner)findViewById(R.id.spinnerPais);
        buttonCadastrar = (Button) findViewById(R.id.buttonCadastrar);

        final String[] country = { "Mecanico", "Estudante", "Desenvolvedor", "Other"};

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPais.setAdapter(aa);

        spinnerPais.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), country[position] , Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://almada-mobile.herokuapp.com/api/users/add?idade="+editTextIdade.getText().toString()+"nome="+editTextNome.getText().toString()+"email"+editTextEmail.getText().toString()+"genero="+editTextGenero.getText().toString()));
                startActivity(intent);
            }
        });

    }
}
