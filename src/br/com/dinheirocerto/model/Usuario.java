package br.com.dinheirocerto.model;

public class Usuario {

    private Integer idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Double saldo;
    private String dataNascimento;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nome, String cpf, String email, String telefone, Double saldo, String dataNascimento) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.saldo = saldo;
        this.dataNascimento = dataNascimento;
    }

    public void processarOperacao(Operacao operacao) {
        if (operacao != null && operacao.getValor() != null) {
            this.saldo += operacao.calcularImpactoSaldo();
        }
    }

    public void cadastrarUsuario() {
        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println("ID: " + idUsuario + " | Nome: " + nome + " | CPF: " + cpf);
    }

    public void atualizarDados() {
        System.out.println("Dados do usuário atualizados!");
        System.out.println("Email: " + email + " | Telefone: " + telefone);
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual de " + nome + ": R$ " + saldo);
    }

    public void exibirDados() {
        System.out.println("========================");
        System.out.println("DADOS DO USUÁRIO");
        System.out.println("ID: " + idUsuario);
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("========================");
    }

    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public Double getSaldo() { return saldo; }
    public void setSaldo(Double saldo) { this.saldo = saldo; }
}