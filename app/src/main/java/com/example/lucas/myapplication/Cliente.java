package com.example.lucas.myapplication;

import java.io.Serializable;

/**
 * Created by Lucas on 03/05/2015.
 */
public class Cliente implements Serializable {

    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String bairro;
    private String cidade;
    private String uf;
    private String nomedopai;
    private String nomedamae;
    private String datanascimento;
    private String localdenascimento;

    public Cliente() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNomedamae() {
        return nomedamae;
    }

    public void setNomedamae(String nomedamae) {
        this.nomedamae = nomedamae;
    }

    public String getNomedopai() {
        return nomedopai;
    }

    public void setNomedopai(String nomedopai) {
        this.nomedopai = nomedopai;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getLocaldenascimento() {
        return localdenascimento;
    }

    public void setLocaldenascimento(String localdenascimento) {
        this.localdenascimento = localdenascimento;
    }
}
