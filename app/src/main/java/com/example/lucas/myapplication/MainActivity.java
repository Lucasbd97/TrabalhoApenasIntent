package com.example.lucas.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public static final String CLIENTE ="cliente";
    private EditText nome;
    private EditText cpf;
    private EditText rg;
    private EditText endereco;
    private EditText bairro;
    private EditText cidade;
    private EditText uf;
    private EditText nomedopai;
    private EditText nomedamae;
    private EditText datanascimento;
    private EditText localdenascimento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.nome);
        cpf = (EditText) findViewById(R.id.cpf);
        rg = (EditText) findViewById(R.id.rg);
        endereco = (EditText) findViewById(R.id.endereco);
        bairro = (EditText) findViewById(R.id.bairro);
        cidade = (EditText) findViewById(R.id.cidade);
        uf = (EditText) findViewById(R.id.uf);
        nomedopai = (EditText) findViewById(R.id.nomedopai);
        nomedamae = (EditText) findViewById(R.id.nomedamae);
        datanascimento = (EditText) findViewById(R.id.datanascimento);
        localdenascimento = (EditText) findViewById(R.id.localdenascimento);
    }
    public void enviar (View v){
        String Nome = nome.getText().toString();
        String Cpf = cpf.getText().toString();
        String Rg = rg.getText().toString();
        String Endereco = endereco.getText().toString();
        String Bairro = bairro.getText().toString();
        String Cidade = cidade.getText().toString();
        String Uf = uf.getText().toString();
        String Nomedopai = nomedopai.getText().toString();
        String Nomedamae = nomedamae.getText().toString();
        String Datanascimento = datanascimento.getText().toString();
        String Localnascimento = localdenascimento.getText().toString();

        Cliente cliente = new Cliente();
        cliente.setNome(Nome);
        cliente.setCpf(Cpf);
        cliente.setRg(Rg);
        cliente.setEndereco(Endereco);
        cliente.setBairro(Bairro);
        cliente.setCidade(Cidade);
        cliente.setUf(Uf);
        cliente.setNomedopai(Nomedopai);
        cliente.setNomedamae(Nomedamae);
        cliente.setDatanascimento(Datanascimento);
        cliente.setLocaldenascimento(Localnascimento);

        Intent i = new Intent(this,Destino.class);
        i.putExtra(CLIENTE,cliente);

        startActivity(i);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
