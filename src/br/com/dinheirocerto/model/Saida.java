package br.com.dinheirocerto.model;

public class Saida {
    private Integer idSaida;
    private String data;
    private String fornecedorOuDestino;
    private String descricao;
    private Double valor;
    private String formaPagamento;


    public Saida(){}

    public Saida(Integer idSaida, String data, String fornecedorOuDestino, String descricao, Double valor, String formaPagamento) {
        this.idSaida = idSaida;
        this.data = data;
        this.fornecedorOuDestino = fornecedorOuDestino;
        this.descricao = descricao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
    }


    public void cadastrarSaida() {
        System.out.println("Executando método: Saida.cadastrarSaida()");
    }

    public void editarSaida(Double novoValor, String novaDescricao) {
        System.out.println("Executando método: Saida.editarSaida()");
    }

    public void excluirSaida() {
        System.out.println("Executando método: Saida.excluirSaida()");
    }

    public Integer getIdSaida() { return idSaida; }
    public void setIdSaida(Integer idSaida) { this.idSaida = idSaida; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getFornecedorOuDestino() { return fornecedorOuDestino; }
    public void setFornecedorOuDestino(String fornecedorOuDestino) { this.fornecedorOuDestino = fornecedorOuDestino; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public String getFormaPagamento() { return formaPagamento; }
    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }
}
