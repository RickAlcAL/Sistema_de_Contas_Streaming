package Applications.Menus;

import Entities.Classes.ContaStreaming;
import Entities.Classes.Planos.PlanoPadrao;
import Entities.Classes.Planos.PlanoPremiun;

import java.util.Scanner;

public class MenuUsuario {

    public void menuInterface () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Boas vindas ao serviço de streaming SenaiCinematics");
        System.out.println("Insira seu nome: ");
        String receberNomeUsuario = sc.nextLine();
        System.out.println("Digite seu email: ");
        String receberEmailUsuario = sc.nextLine();

        char resp;

        do {
            System.out.println("Digite o seu plano que desejas");
            System.out.println("1. Plano Padrão");
            System.out.println("2. Plano Premium");
            resp = sc.next().charAt(0);

            if (resp != '1' && resp != '2'){
                System.out.println("Plano invalido");
            }
        }while (resp != '1' && resp != '2');

        if (resp == '1'){
            PlanoPadrao p = new PlanoPadrao(receberNomeUsuario,receberEmailUsuario);
            System.out.println(p.toString());
        }else {
            PlanoPremiun pP = new PlanoPremiun(receberNomeUsuario,receberEmailUsuario);
            System.out.println(pP.toString());
        }
    }
}
