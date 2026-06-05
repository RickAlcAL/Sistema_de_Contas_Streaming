package Entities.Classes.Planos;

import Entities.Classes.ContaStreaming;


public class PlanoPremiun extends ContaStreaming {
    private String qualidadeVideo = "4k Ultra HD";
    private int limiteDeTela = 4;
    private boolean permissaoDeDownload = true;
    private double precoBase = 50.00;

    public PlanoPremiun(String nomeUsuario, String emailUsuario) {
        super(nomeUsuario, emailUsuario);
    }


    @Override
    public String toString () {
        return "======== Plano Premium selecionado =========" +
                "\nQualidade de video: " + qualidadeVideo +
                "\nQuantidade de tela: " + limiteDeTela +
                "\nPermissao para baixar: " + (permissaoDeDownload ? "Permitido" : "Não permitido") +
                "\nUsuario cadastrado: " + getNomeUsuario() +
                "\nEmail registrado: " +getEmailUsuario() +
                String.format("\nPreço do plano: R$ %.2f", precoBase) +
                "\n======== // ================= // =========";

    }
}
