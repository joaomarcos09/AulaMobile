package br.ufc.crateus.aula7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menuConf:
                Toast.makeText(this, "Configuração", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuAjuda:
                Toast.makeText(this, "Ajuda", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuSobre:
                //Toast.makeText(this, "Sobre", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), SobreActivity.class);
                startActivity(intent);
                return true;

        }
        return false;
    }

    @SuppressLint("RestrictedApi")@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
