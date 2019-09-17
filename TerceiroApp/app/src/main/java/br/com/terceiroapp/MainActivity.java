package br.com.terceiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox pizza;
    EditText pizzaQntd;
    EditText pizzaVal;

    CheckBox refri;
    EditText refriQntd;
    EditText refriVal;

    CheckBox hamburguer;
    EditText hambQntd;
    EditText hambVal;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza = findViewById(R.id.pizza);
        pizzaQntd = findViewById(R.id.pizzaQntd);
        pizzaVal = findViewById(R.id.pizzaVal);

        refri = findViewById(R.id.refri);
        refriQntd = findViewById(R.id.refriQntd);
        refriVal = findViewById(R.id.refriVal);

        hamburguer = findViewById(R.id.hamburguer);
        hambQntd = findViewById(R.id.hambQntd);
        hambVal = findViewById(R.id.hambVal);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String alert = "Selected items:\n";
                double total = 0;
                int qnt = 0;
                double val = 0;
                if(pizza.isChecked()){
                    qnt = Integer.parseInt(pizzaQntd.getText().toString());
                    val = Double.parseDouble(pizzaVal.getText().toString());
                    alert += "Pizza - Qntd: "+qnt+" - Val: "+val+"\n";
                    total += val*qnt;
                }
                if(refri.isChecked()){
                    qnt = Integer.parseInt(refriQntd.getText().toString());
                    val = Double.parseDouble(refriVal.getText().toString());
                    alert += "Refri - Qntd: "+qnt+" - Val: "+val+"\n";
                    total += val*qnt;
                }
                if(hamburguer.isChecked()){
                    qnt = Integer.parseInt(hambQntd.getText().toString());
                    val = Double.parseDouble(hambVal.getText().toString());
                    alert += "Refri - Qntd: "+qnt+" - Val: "+val+"\n";
                    total += val*qnt;
                }
                alert += "Total: "+total+"Rs";
                Toast.makeText(getApplicationContext(), alert, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
