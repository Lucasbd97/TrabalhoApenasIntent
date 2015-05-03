package com.example.lucas.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Destino extends ActionBarActivity {

    private TextView saidanome;
    private TextView saidacpf;
    private TextView saidarg;
    private TextView saidaendereco;
    private TextView saidabairro;
    private TextView saidacidade;
    private TextView saidauf;
    private TextView saidanomedopai;
    private TextView saidanomedamae;
    private TextView saidadatadenascimento;
    private TextView saidalocaldenascimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destino);

        saidanome = (TextView) findViewById(R.id.saidanome);
        saidacpf = (TextView) findViewById(R.id.saidacpf);
        saidarg = (TextView) findViewById(R.id.saidarg);
        saidaendereco = (TextView) findViewById(R.id.saidaendereco);
        saidabairro = (TextView) findViewById(R.id.saidabairro);
        saidacidade = (TextView) findViewById(R.id.saidacidade);
        saidauf = (TextView) findViewById(R.id.saidauf);
        saidanomedopai = (TextView) findViewById(R.id.saidanomedopai);
        saidanomedamae = (TextView) findViewById(R.id.saidanomedamae);
        saidadatadenascimento = (TextView) findViewById(R.id.saidadatadenascimento);
        saidalocaldenascimento = (TextView) findViewById(R.id.saidalocaldenascimento);

        Intent i = getIntent();

        Cliente cliente = (Cliente) i.getSerializableExtra(MainActivity.CLIENTE);
        String Nome = cliente.getNome();
        String Cpf = cliente.getCpf();
        String Rg = cliente.getRg();
        String Endereco = cliente.getEndereco();
        String Bairro = cliente.getBairro();
        String Cidade = cliente.getCidade();
        String Uf = cliente.getUf();
        String Nomedopai = cliente.getNomedopai();
        String Nomedamae = cliente.getNomedamae();
        String Datanascimento = cliente.getDatanascimento();
        String Localdenascimento = cliente.getLocaldenascimento();

        saidanome.setText(Nome);
        saidacpf.setText(Cpf);
        saidarg.setText(Rg);
        saidaendereco.setText(Endereco);
        saidabairro.setText(Bairro);
        saidacidade.setText(Cidade);
        saidauf.setText(Uf);
        saidanomedopai.setText(Nomedopai);
        saidanomedamae.setText(Nomedamae);
        saidadatadenascimento.setText(Datanascimento);
        saidalocaldenascimento.setText(Localdenascimento);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_destino, menu);
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
