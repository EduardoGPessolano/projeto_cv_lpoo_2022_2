package br.edu.ifsul.bcc.lpoo.cv.model;

public class Especie {

    private Integer id;
    private String nome;

    public Especie(){}
    
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


}
