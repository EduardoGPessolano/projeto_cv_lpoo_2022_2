package br.edu.ifsul.bcc.lpoo.cv.model;

import java.util.Calendar;

public abstract class Pessoa {
    private String nome;
    private String senha;
    private String email;
    private String cpf;
    private String rg;
    
    private String cep;
    private String endereco;
    private String complemento;
    private String numero_celular;
    
    private Calendar data_nascimento;

    public Pessoa(){}

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
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
        
    public String getNumero_celular() {
        return numero_celular;
    }
    public void setNumero_celular(String numero_celular) {
        this.numero_celular = numero_celular;
    }
    
    public Calendar getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getComplemento() {
        return complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
