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


    public Usuario obterUsuario() {
        return usuario;
    }

    public void definirUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Entrada obterEntrada() {
        return entrada;
    }

    public void definirEntrada(Entrada entrada) {
        this.entrada = entrada;
        if (entrada != null) {
            this.tipo = "Entrada";
            this.valor = entrada.getValor();
            this.descricao = entrada.getDescricao();
            this.pessoaEntidade = entrada.getPessoaEntidade();
            this.data = entrada.getData();
        }
    }

    public Saida obterSaida() {
        return saida;
    }

    public void definirSaida(Saida saida) {
        this.saida = saida;
        if (saida != null) {
            this.tipo = "Saída";
            this.valor = saida.getValor();
            this.descricao = saida.getDescricao();
            this.pessoaEntidade = saida.getFornecedorOuDestino();
            this.data = saida.getData();
        }
    }

    public Credito obterCredito() {
        return credito;
    }

    public void definirCredito(Credito credito) {
        this.credito = credito;
    }

    public Integer obterId() {
        return id;
    }

    public void definirId(Integer id) {
        this.id = id;
    }

    public String obterData() {
        return data;
    }

    public void definirData(String data) {
        this.data = data;
    }

    public String obterTipo() {
        return tipo;
    }

    public void definirTipo(String tipo) {
        this.tipo = tipo;
    }

    public String obterPessoaEntidade() {
        return pessoaEntidade;
    }

    public void definirPessoaEntidade(String pessoaEntidade) {
        this.pessoaEntidade = pessoaEntidade;
    }

    public String obterDescricao() {
        return descricao;
    }

    public void definirDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double obterValor() {
        return valor;
    }

    public void definirValor(Double valor) {
        this.valor = valor;
    }

    public void exibirMovimentacao() {
        System.out.println("Movimentação ID " + id + ": " + tipo + " de R$ " + valor + " - " + descricao);
    }
}