package org.Main;

import org.Model.notificacao.EmailNotificacao;
import org.Model.notificacao.PushNotificacao;
import org.Model.notificacao.SMSNotificacao;
import org.View.Notificacao;

import java.util.ArrayList;

public class MainNotificacao {
    public static void main(String[] args) {
        ArrayList<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new EmailNotificacao("usuario@email.com"));
        notificacoes.add(new SMSNotificacao("+55 11 99999-9999"));
        notificacoes.add(new PushNotificacao("token_abc123"));

        for (Notificacao n : notificacoes) {
            n.enviar("Bem-vindo ao nosso sistema!");
        }
    }
}

