package com.example.petagram;

public class Datos {



    private int foto;
    private String like;
    private String nombredeanimal;

    public Datos (int foto, String like, String nombredeanimal){
        this.foto = foto;
        this.like = like;
        this.nombredeanimal = nombredeanimal;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getNombredeanimal() {
        return nombredeanimal;
    }

    public void setNombredeanimal(String nombredeanimal) {
        this.nombredeanimal = nombredeanimal;
    }

}
