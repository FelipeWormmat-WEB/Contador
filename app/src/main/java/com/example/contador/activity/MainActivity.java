package com.example.contador.activity;

import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.contador.R;
import com.example.contador.config.ConfigFirebase;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
    }

    @Override
    /*Método onStart, que sempre verifica se há um usuário logado quando o app é iniciado*/
    protected void onStart() {
        super.onStart();
        verificarUserLogado();
    }
    /*Método para chamar a activity de Login caso seja selecionado "Já possuo uma conta"*/
    public void buttonEntrar(View view){
        startActivity(new Intent(this, LoginActivity.class));
    }
    /*Método para chamar a activity de cadastro caso seja selecionado "Cadastre-se"*/
    public void buttonCadastro(View view){
        startActivity(new Intent(this, CadastroActivity.class));
    }
    /*Metodo que verifica se já existe um usuário logado, para que não seja mostrados os slides/telas iniciais*/
    public void verificarUserLogado(){
        auth = ConfigFirebase.getFirebaseAuth();
        if(auth.getCurrentUser() != null){
            abrirTelaPrincipal();
        }
    }
    /*Método que chama a tela principal do aplicativo*/
    public void abrirTelaPrincipal(){
        startActivity(new Intent(this, PrincipalActivity.class));
    }
}