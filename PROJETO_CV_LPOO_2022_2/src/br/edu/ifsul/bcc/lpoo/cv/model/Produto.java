package br.edu.ifsul.bcc.lpoo.cv.model;

public class Produto {

    private String nome;
    private Integer id;
    private Float quantidade;
    private Float valor;

    private Fornecedor fornecedor;
    private TipoProduto tipoProduto;
    
    public Produto(){}

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
  
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public Float getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


}
