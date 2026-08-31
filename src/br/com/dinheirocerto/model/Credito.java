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

    public void exibirResumoCredito() {
        System.out.println("Crédito - ID " + id + ": R$ " + valorSolicitado + " em " + numeroParcelas + "x");
    }

    public Movimentacao getMovimentacao() {
        return movimentacao;
    }

    public void setMovimentacao(Movimentacao movimentacao) {
        this.movimentacao = movimentacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(Double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
        calcularSimulacao();
    }

    public Double getTaxaJurosMensal() {
        return taxaJurosMensal;
    }

    public void setTaxaJurosMensal(Double taxaJurosMensal) {
        this.taxaJurosMensal = taxaJurosMensal;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
        calcularSimulacao();
    }

    public Double getValorTotalPagar() {
        return valorTotalPagar;
    }

    public void setValorTotalPagar(Double valorTotalPagar) {
        this.valorTotalPagar = valorTotalPagar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(String dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}