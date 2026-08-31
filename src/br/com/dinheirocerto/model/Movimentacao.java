package br.com.dinheirocerto.model;

public class Movimentacao {

    private Integer id;
    private String data;
    private String tipo;
    private String pessoaEntidade;
    private String descricao;
    private Double valor;

    private Usuario usuario;
    private Entrada entrada;
    private Saida saida;
    private Credito credito;

    public Movimentacao() {
    }

    public Movimentacao(Integer id, String data, String tipo, String pessoaEntidade, String descricao, Double valor) {
        this.id = id;
        this.data = data;
        this.tipo = tipo;
        this.pessoaEntidade = pessoaEntidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public void exibirMovimentacao() {
        System.out.println("Movimentacao - ID " + id + ": " + tipo + " de R$ " + valor + " - " + descricao);
    }


    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
        if (entrada != null) {
            this.tipo = "Entrada";
            this.valor = entrada.getValor();
            this.descricao = entrada.getDescricao();
            this.pessoaEntidade = entrada.getPessoaEntidade();
            this.data = entrada.getData();
        }
    }

    public Saida getSaida() {
        return saida;
    }

    public void setSaida(Saida saida) {
        this.saida = saida;
        if (saida != null) {
            this.tipo = "Saida";
            this.valor = saida.getValor();
            this.descricao = saida.getDescricao();
            this.pessoaEntidade = saida.getFornecedorOuDestino();
            this.data = saida.getData();
        }
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
}