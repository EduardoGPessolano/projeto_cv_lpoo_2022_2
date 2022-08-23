package br.edu.ifsul.bcc.lpoo.cv.model;

public class Raca {
    private String nome;
    private Integer id;
    private Especie especie;

    public Raca(){}
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
    
}
