package com.example.projetosofrimento.dominio;

public class CardData {
    private String Usuario;
    private String Lugar;
    private String Dia;
    private String Hora;
    private String Descrição;

    public CardData() {
    }

    public CardData(String usuario, String lugar, String dia, String hora, String descrição) {
        Usuario = usuario;
        Lugar = lugar;
        Dia = dia;
        Hora = hora;
        Descrição = descrição;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getDescrição() {
        return Descrição;
    }

    public void setDescrição(String descrição) {
        Descrição = descrição;
    }
}
