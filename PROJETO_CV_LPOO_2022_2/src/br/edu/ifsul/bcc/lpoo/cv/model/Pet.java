package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

public class Pet {
    
    private Integer id;
    private String nome;
    private String observacao;

    private Cliente cliente;
    private Raca raca;
    private Calendar data_nascimento;

    public Pet(){}

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        this.raca = raca;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getObservacao() {
        return observacao;
    }
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }


}
