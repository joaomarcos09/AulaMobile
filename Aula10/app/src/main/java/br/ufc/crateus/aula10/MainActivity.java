package br.ufc.crateus.aula10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {

                        try {
                            Socket socket = new Socket("10.5.30.113", 50000);
                            DataInputStream dIn = new DataInputStream(socket.getInputStream());
                            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

                            dOut.writeUTF(text.getText().toString());

                            dIn.close();

                            dOut.close();

                            socket.close();


                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                }).start();
            }
        });
    }
}





