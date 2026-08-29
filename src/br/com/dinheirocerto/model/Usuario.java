package br.com.dinheirocerto.model;

public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Double saldo;

    // Construtor padrão
    public Usuario() {

    }

    // Construtor com parâmetros
    public Usuario(Integer idUsuario, String nome, String cpf, String email, String telefone, Double saldo) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    // Metodo para cadastrar o usuário
    public void cadastrarUsuario() {
        System.out.println("Cadastrando usuário no sistema Dinheiro Certo.");
    }

    // Metodo para atualizar os dados do usuário
    public void atualizarDados() {
        System.out.println("Atualizando os dados do usuário.");
    }

    // Metodo para consultar o saldo
    public void consultarSaldo() {
        System.out.println("Consultando saldo do usuário: R$ " + saldo);
    }

    // Metodo para exibir os dados do usuário
    public void exibirDados() {
        System.out.println("Exibindo dados do usuário: " + nome);
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