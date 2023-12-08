package com.example.projetosofrimento.dominio;

import android.annotation.SuppressLint;
import android.os.StrictMode;
import android.util.Log;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConSQL     {
    Connection con;
    @SuppressLint("NewApi")
    public Connection conclass(){
        //Preencher tudo vazio (ip, port, db, username, password, com seus atributos corretos!!
        // o IP tu consegue vendo os ajustes do teu pc!
        // se n, qualquer coisa tu faz tecla windows + "S", escreve cmd, vai aparecer uma parada chamada command prompt eu acho
        // ai tu bota no command prompt ipconfig, é o IPv4!
        // o port eu n faço a menor ideia, o DB é o nome do banco de dados, username e password acredito que tu consegue sozinha.
        String ip="192.168.0.23", port="4773",db="ProjetoIntegrador", username="", password="";

        StrictMode.ThreadPolicy a = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(a);
        String ConnectURL = null;
        try {
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            ConnectURL="jdbc:jtds:sqlserver://"+ip+":"+port+""+"databasename = "+db+ ";user = "+ username + ";" + "password = "+ password+ ";";
            con = DriverManager.getConnection(ConnectURL);
        } catch (Exception e)
        {
            Log.e("Error is: ", e.getMessage());
        }
        return con;
    }

}
