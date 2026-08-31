package br.com.dinheirocerto.model;

public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Double saldo;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nome, String cpf, String email, String telefone, Double saldo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public void cadastrarUsuario() {
        System.out.println("Executando método: Usuario.cadastrarUsuario()");
    }

    public void atualizarDados() {
        System.out.println("Exucutando método: Usuario.atualizarDados()");
    }

    public void consultarSaldo() {
        System.out.println("Executando método: Usuario.consultarSaldo() - R$ " + saldo);
    }

    public void exibirDados() {
        System.out.println("Executando método: Usuario.exibirDados() - " + nome);
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}