package br.com.dinheirocerto.model;

public abstract class Operacao {

    private String data;
    private String descricao;
    private Double valor;
    public abstract String getTipoOperacao();

    public Operacao() {
    }

    public Operacao(String data, String descricao, Double valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract Double calcularImpactoSaldo();

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
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
}