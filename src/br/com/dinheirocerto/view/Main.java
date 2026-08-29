package br.com.dinheirocerto.view;

import br.com.dinheirocerto.model.Credito;
import br.com.dinheirocerto.model.Entrada;
import br.com.dinheirocerto.model.Movimentacao;
import br.com.dinheirocerto.model.Saida;
import br.com.dinheirocerto.model.Usuario;

public class Main {

    public static void main(String[] args) {

        Usuario usuario = new Usuario(1, "Bruno Santos", "123.456.789-00", "bruno@exemplo.com", "+55 01 2 3456-7890", 53652.97);
        usuario.exibirDados();
        usuario.consultarSaldo();
        System.out.println();

        Entrada entrada = new Entrada(101, "22/04/2026", "Bruno Almeida de Sousa", "Venda de produto", 563.02);
        entrada.adicionarEntrada();

        Movimentacao movEntrada = new Movimentacao();
        movEntrada.definirId(1);
        movEntrada.definirUsuario(usuario);
        movEntrada.definirEntrada(entrada);
        movEntrada.exibirMovimentacao();
        System.out.println();

        Saida saida = new Saida(201, "17/04/2026", "Sousa Parafusos Ltda.", "Compra de parafusos", 166.33, "Pix");
        saida.cadastrarSaida();

        Movimentacao movSaida = new Movimentacao();
        movSaida.definirId(2);
        movSaida.definirUsuario(usuario);
        movSaida.definirSaida(saida);
        movSaida.exibirMovimentacao();
        System.out.println();

        Credito credito = new Credito(301, 30000.0, 36, 2.09, 1194.06, 42986.32, "Sem pendências", "25/10/2025", "Empréstimo para Reforma");
        credito.exibirResumoCredito();

        Movimentacao movCredito = new Movimentacao(3, "25/10/2025", "Entrada", "Banco Dinheiro Certo", "Liberação de Crédito", 30000.0);
        movCredito.definirUsuario(usuario);
        movCredito.definirCredito(credito);
        credito.definirMovimentacao(movCredito);

        System.out.println("Movimentação de Crédito ID: " + credito.obterMovimentacao().obterId() +
                " | Descrição: " + credito.obterMovimentacao().obterDescricao());
    }
}