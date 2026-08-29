package br.com.dinheirocerto.model;

public class Credito {

    private Integer id;
    private Double valorSolicitado;
    private Integer numeroParcelas;
    private Double taxaJurosMensal;
    private Double valorParcela;
    private Double valorTotalPagar;
    private String status;
    private String dataSolicitacao;
    private String descricao;

    private Movimentacao movimentacao;

    public Credito() {
    }

    public Credito(Integer id, Double valorSolicitado, Integer numeroParcelas, Double taxaJurosMensal, Double valorParcela, Double valorTotalPagar, String status, String dataSolicitacao, String descricao) {
        this.id = id;
        this.valorSolicitado = valorSolicitado;
        this.numeroParcelas = numeroParcelas;
        this.taxaJurosMensal = taxaJurosMensal;
        this.valorParcela = valorParcela;
        this.valorTotalPagar = valorTotalPagar;
        this.status = status;
        this.dataSolicitacao = dataSolicitacao;
        this.descricao = descricao;
    }

    public void calcularSimulacao() {
        if (this.numeroParcelas != null && this.valorParcela != null) {
            this.valorTotalPagar = this.valorParcela * this.numeroParcelas;
        }
    }

    public Movimentacao obterMovimentacao() {
        return movimentacao;
    }

    public void definirMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Integer obterId() {
        return id;
    }

    public void definirId(Integer id) {
        this.id = id;
    }

    public Double obterValorSolicitado() {
        return valorSolicitado;
    }

    public void definirValorSolicitado(Double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public Integer obterNumeroParcelas() {
        return numeroParcelas;
    }

    public void definirNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
        calcularSimulacao();
    }

    public Double obterTaxaJurosMensal() {
        return taxaJurosMensal;
    }

    public void definirTaxaJurosMensal(Double taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }

    public Double obterValorParcela() {
        return valorParcela;
    }

    public void definirValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
        calcularSimulacao();
    }

    public Double obterValorTotalPagar() {
        return valorTotalPagar;
    }

    public String obterStatus() {
        return status;
    }

    public void definirStatus(String status) {
        this.status = status;
    }

    public String obterDataSolicitacao() {
        return dataSolicitacao;
    }

    public void definirDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String obterDescricao() {
        return descricao;
    }

    public void definirDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirResumoCredito() {
        System.out.println("Crédito ID " + id + ": R$ " + valorSolicitado + " em " + numeroParcelas + "x");
    }
}