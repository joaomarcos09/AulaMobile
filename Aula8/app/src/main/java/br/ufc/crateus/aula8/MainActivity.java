package br.ufc.crateus.aula8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton fab;
    TextView nome;
    TextView idade;
    TextView cidade;
    private LineAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        nome = (TextView) findViewById(R.id.editName);
        idade = (TextView) findViewById(R.id.editIdade);
        cidade = (TextView) findViewById(R.id.editCidade);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new LineAdapter(new ArrayList<>(0));recyclerView.setAdapter(mAdapter);
        fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            UserModel model = new UserModel();
            model.setName(nome.getText().toString());
            model.setAge(Integer.parseInt(idade.getText().toString()));
            model.setCity(cidade.getText().toString());
            insertItem(model);
        });
    }

    public void insertItem(UserModel model) {
        mAdapter.insertItem(model);
    }
}
