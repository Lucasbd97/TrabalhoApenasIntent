package com.example.lucas.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Lucas on 03/05/2015.
 */
public class DataBaseHelper extends SQLiteOpenHelper  {

    private static final String BANCO_DADOS = "MeuBanco";
    private static int VERSAO = 1;
    public DataBaseHelper(Context context) {
        super(context, BANCO_DADOS, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table cliente(_id integer primary key autoincrement , nome text not null , cpf text not null , rg text not null , endereco text not null , bairro text not null , cidade text not null , uf text not null , nomedopai text not null , nomedamae text not null , datadenascimento text not null , localdenascimento text not null);");




    }
     /*   String ddl = "CREATE TABLE cliente(" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT,"+
                "nome TEXT not null"+
                "cpf TEXT not null"+
                "rg TEXT not null"+
                "endereco TEXT not null"+
                "bairro TEXT not null"+
                "cidade TEXT not null"+
                "uf TEXT not null"+
                "nomedopai TEXT not null"+
                "nomedamae TEXT not null"+
                "datadenascimento TEXT not null"+
                "localdenascimento TEXT not null"+
                ")";
        db.execSQL(ddl);

    }
*/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
