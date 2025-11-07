package org.Main;

import org.Model.pagamento.Boleto;
import org.Model.pagamento.CartaoCredito;
import org.Model.pagamento.Pix;
import org.View.MetodoPagamento;

public class MainPagamento {

    public static void realizarPagamento(MetodoPagamento metodo, double valor) {
        boolean sucesso = metodo.processarPagamento(valor);
        System.out.println("Status: " + (sucesso ? "Aprovado" : "Recusado"));
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito("1234 5678 9012 3456", "João Silva", "12/28");
        MetodoPagamento boleto = new Boleto("123456789000", "10/12/2025");
        MetodoPagamento pix = new Pix("joao@banco.com");

        realizarPagamento(cartao, 250.75);
        realizarPagamento(boleto, 180.50);
        realizarPagamento(pix, 99.99);
    }
}

