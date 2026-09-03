package br.com.dinheirocerto.model;

public class Entrada extends Operacao {

    private Integer idEntrada;
    private String pessoaEntidade;

    public Entrada() {
    }

    public Entrada(Integer idEntrada, String data, String pessoaEntidade, String descricao, Double valor) {
        super(data, descricao, valor);
        this.idEntrada = idEntrada;
        this.pessoaEntidade = pessoaEntidade;
    }


    @Override
    public Double calcularImpactoSaldo() {
        return this.getValor();
    }

    public Integer getIdEntrada() {
        return idEntrada;
    }
    public void setIdEntrada(Integer idEntrada) {
        this.idEntrada = idEntrada;
    }

    public String getPessoaEntidade() {
        return pessoaEntidade;
    }
    public void setPessoaEntidade(String pessoaEntidade) {
        this.pessoaEntidade = pessoaEntidade;
    }

    public void exibirDetalhes() {
        System.out.println("\nEntrada registrada: " + getDescricao() + "  \nValor: R$ " + getValor());
    }
}