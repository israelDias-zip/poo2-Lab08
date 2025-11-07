package org.Model.pagamento;

import org.View.MetodoPagamento;

public class Boleto implements MetodoPagamento {
    private String codigoBarra;
    private String dataVencimento;

    public Boleto(String codigoBarra, String dataVencimento) {
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Boleto gerado no valor de R$" + valor + ". Pague até " + dataVencimento + ".");
        return true;
    }
}

