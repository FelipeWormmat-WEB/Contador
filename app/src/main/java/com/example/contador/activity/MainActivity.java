package com.example.contador.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.contador.R;
import com.example.contador.config.ConfigFirebase;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    private Button buttonEntrar, buttonCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Certifique-se de ter o layout correto para a tela principal

        // Inicialize FirebaseAuth
        auth = ConfigFirebase.getFirebaseAuth();

        // Encontre os botões no layout
        buttonEntrar = findViewById(R.id.buttonEntrar);
        buttonCadastro = findViewById(R.id.buttonCadastro);

        // Defina os listeners de clique
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CadastroActivity.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        verificarUserLogado();
    }

    // Método para verificar se o usuário está logado
    public void verificarUserLogado() {
        if (auth.getCurrentUser() != null) {
            abrirTelaPrincipal();
        }
    }

    // Método para abrir a tela principal
    public void abrirTelaPrincipal() {
        startActivity(new Intent(this, PrincipalActivity.class));
        finish(); // Opcional: finaliza a MainActivity para evitar que o usuário volte para ela
    }
}
