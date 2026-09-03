package br.com.dinheirocerto.model;

public class Credito extends Operacao {

    private Integer id;
    private Integer numeroParcelas;
    private Double taxaJurosMensal;
    private Double valorParcela;
    private Double valorTotalPagar;
    private String status;

    private Movimentacao movimentacao;

    public Credito() {
    }

    public Credito(Integer id, Double valor, Integer numeroParcelas, Double taxaJurosMensal, Double valorParcela, Double valorTotalPagar, String status, String data, String descricao) {
        super(data, descricao, valor);
        this.id = id;
        this.numeroParcelas = numeroParcelas;
        this.taxaJurosMensal = taxaJurosMensal;
        this.valorParcela = valorParcela;
        this.valorTotalPagar = valorTotalPagar;
        this.status = status;
    }

    @Override
    public Double calcularImpactoSaldo() {
        return this.getValor();
    }

    public void calcularSimulacao() {
        if (this.numeroParcelas != null && this.valorParcela != null) {
            this.valorTotalPagar = this.valorParcela * this.numeroParcelas;
        }
    }

    public void exibirResumoCredito() {
        System.out.println("Crédito - ID " + id + ": R$ " + getValor() + " em " + numeroParcelas + "x");
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

    public void exibirDetalhes() {
        System.out.println("=== CRÉDITO ===");
        System.out.println("ID: " + id);
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor liberado: R$ " + getValor());
        System.out.println("Parcelas: " + numeroParcelas + "x de R$ " + valorParcela);
        System.out.println("Taxa de juros mensal: " + taxaJurosMensal + "%");
        System.out.println("Total a pagar: R$ " + valorTotalPagar);
        System.out.println("Status: " + status);
        System.out.println("Data: " + getData());
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
}