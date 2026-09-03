package br.com.dinheirocerto.view;

import br.com.dinheirocerto.model.Credito;
import br.com.dinheirocerto.model.Entrada;
import br.com.dinheirocerto.model.Movimentacao;
import br.com.dinheirocerto.model.Operacao;
import br.com.dinheirocerto.model.Saida;
import br.com.dinheirocerto.model.Usuario;

public class Main {

    public static void main(String[] args) {

        // Construtores
        Usuario usuario = new Usuario(107097, "Pedro Fernando Gomes Leal", "142.252.678-35",
                "pedrofernando012@fiap.com.br", "+55 11 9 5252-7428", 2000.0, "20/03/1990");

        Entrada salario = new Entrada(360242, "05/09/2026", "Alfa Serviços Contábeis LTDA",
                "Pagamento de Salário", 10000.0);

        Saida contaluz = new Saida(203457, "05/09/2026", "Enel",
                "Conta de Energia", 250.0, "Pix");

        // Classe Crédito sendo usada
        Credito emprestimo = new Credito(35125, 30000.0, 9, 1.03,
                4233.33, 38100.0, "Aprovado", "10/09/2026", "Empréstimo Pessoal");

        // Exibindo dados completos do usuário
        usuario.exibirDados();

        // Polimorfismo
        System.out.println("\nPROCESSANDO OPERAÇÕES NO SALDO");

        // Entrada - exemplo salário
        usuario.processarOperacao(salario);
        salario.exibirDetalhes();
        usuario.consultarSaldo();

        // Saída - exemplo conta de luz
        usuario.processarOperacao(contaluz);
        contaluz.exibirDetalhes();
        usuario.consultarSaldo();

        // Crédito - exemplo de empréstimo
        usuario.processarOperacao(emprestimo);
        emprestimo.exibirDetalhes();
        usuario.consultarSaldo();

        // Exibindo resumo do crédito
        emprestimo.exibirResumoCredito();

        // Chamando a classe movimentação através dos recibos
        System.out.println("\nGERANDO RECIBOS");

        Movimentacao mov1 = new Movimentacao(1, usuario, salario);
        mov1.gerarRecibo();

        Movimentacao mov2 = new Movimentacao(2, usuario, contaluz);
        mov2.gerarRecibo();

        Movimentacao mov3 = new Movimentacao(3, usuario, emprestimo);
        mov3.gerarRecibo();
    }
}