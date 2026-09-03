package br.com.dinheirocerto.model;

public class Movimentacao {

    private Integer id;
    private Usuario usuario;

    private Operacao operacao;

    private Credito credito;

    public Movimentacao() {
    }

    public Movimentacao(Integer id, Usuario usuario, Operacao operacao) {
        this.id = id;
        this.usuario = usuario;
        this.operacao = operacao;
    }

    public void gerarRecibo() {
        if (operacao != null) {
            System.out.println("-----------------------------");
            System.out.println("RECIBO DE MOVIMENTAÇÃO");
            System.out.println("ID Movimentação: " + id);
            System.out.println("Data: " + operacao.getData());
            System.out.println("Descrição: " + operacao.getDescricao());
            System.out.println("Valor: R$ " + operacao.getValor());
            System.out.println("-----------------------------");
        } else {
            System.out.println("Movimentação sem operação registrada.");
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Operacao getOperacao() {
        return operacao;
    }

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}