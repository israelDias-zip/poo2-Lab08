package org.Model.pagamento;

import org.View.MetodoPagamento;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " via Pix realizado para a chave " + chavePix + ".");
        return true;
    }
}

