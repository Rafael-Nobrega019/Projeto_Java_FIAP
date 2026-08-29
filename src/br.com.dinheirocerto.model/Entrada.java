package br.com.dinheirocerto.model;

public class Entrada {

    private Integer idEntrada;
    private String data;
    private String pessoaEntidade;
    private String descricao;
    private Double valor;

    public Entrada() {
    }

    public Entrada(Integer idEntrada, String data, String pessoaEntidade, String descricao, Double valor) {
        this.idEntrada = idEntrada;
        this.data = data;
        this.pessoaEntidade = pessoaEntidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPessoaEntidade() {
        return pessoaEntidade;
    }

    public void setPessoaEntidade(String pessoaEntidade) {
        this.pessoaEntidade = pessoaEntidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void adicionarEntrada() {
        System.out.println("Executando o método adicionarEntrada");
    }

    public void exibirEntrada() {
        System.out.println("Executando o método exibirEntrada");
    }
}