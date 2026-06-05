package Entities.Classes;


public class ContaStreaming {
    private String nomeUsuario;
    private String emailUsuario;


    public ContaStreaming() {

    }
    public ContaStreaming(String nomeUsuario, String emailUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    @Override
    public String toString () {
        return "===================================" +
                "Cadastro encontrado com sucesso" +
                "Seu nome: " + getNomeUsuario() +
                "\nSeu email: " + getEmailUsuario();
    }

}
