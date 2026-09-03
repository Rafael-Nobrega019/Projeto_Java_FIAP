package br.com.dinheirocerto.model;

public class Saida extends Operacao {

    private Integer idSaida;
    private String fornecedorOuDestino;
    private String formaPagamento;

    public Saida() {
    }

    public Saida(Integer idSaida, String data, String fornecedorOuDestino, String descricao, Double valor, String formaPagamento) {
        super(data, descricao, valor);
        this.idSaida = idSaida;
        this.fornecedorOuDestino = fornecedorOuDestino;
        this.formaPagamento = formaPagamento;
    }

    @Override
    public Double calcularImpactoSaldo() {
        return -this.getValor();
    }

    public Integer getIdSaida() {
        return idSaida;
    }
    public void setIdSaida(Integer idSaida) {
        this.idSaida = idSaida;
    }

    public String getFornecedorOuDestino() {
        return fornecedorOuDestino;
    }
    public void setFornecedorOuDestino(String fornecedorOuDestino) {
        this.fornecedorOuDestino = fornecedorOuDestino;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void exibirDetalhes() {
        System.out.println("\nSaída registrada: " + getDescricao() + "  \nValor: R$ " + getValor());
    }
}