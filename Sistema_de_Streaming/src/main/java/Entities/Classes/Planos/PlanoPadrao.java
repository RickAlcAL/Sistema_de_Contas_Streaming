package Entities.Classes.Planos;

import Entities.Classes.ContaStreaming;

public class PlanoPadrao extends ContaStreaming {
    private String qualidadeVideo = "Full HD";
    private int quantidadeTelas = 2;
    private double precoBase = 30.00;
    private boolean permissaoDeDownload = false;

    public PlanoPadrao (String nomeUsuario, String emailUsuario){
        super(nomeUsuario, emailUsuario);
    }

    @Override
    public String toString () {
        return "======== Plano Padrão selecionado =========" +
                "\nQualidade de video: " + qualidadeVideo +
                "\nQuantidade de tela: " + quantidadeTelas +
                "\nPermissao para baixar: " + (permissaoDeDownload ? "Permitido" : "Não permitido") +
                "\nUsuario cadastrado: " + getNomeUsuario() +
                "\nEmail registrado: " +getEmailUsuario() +
                String.format("\nPreço do plano: R$ %.2f", precoBase) +
                "\n======== // ================= // =========";

    }
}
