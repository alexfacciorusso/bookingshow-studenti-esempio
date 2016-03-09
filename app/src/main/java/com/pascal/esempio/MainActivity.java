package com.pascal.esempio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText usernameView = (EditText) findViewById(R.id.username);
        final EditText passwordView = (EditText) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameView.getText().toString();
                String password = passwordView.getText().toString();

                if (username.equals("test") && password.equals("pass")) {
                    usernameView.setError(null);
                    Intent intent = new Intent(MainActivity.this, LoginEseguitoActivity.class);
                    startActivity(intent);
                } else {
                    usernameView.setError("Errore!!! Sei una patacca!!");
                }
            }
        });
    }
}
