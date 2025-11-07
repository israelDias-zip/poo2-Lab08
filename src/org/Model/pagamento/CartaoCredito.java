package org.Model.pagamento;

import org.View.MetodoPagamento;

public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String validade;

    public CartaoCredito(String numeroCartao, String nomeTitular, String validade) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento de R$" + valor + " com cartão de crédito processado para " + nomeTitular + ".");
            return true;
        }
        System.out.println("Falha no pagamento com cartão.");
        return false;
    }
}

