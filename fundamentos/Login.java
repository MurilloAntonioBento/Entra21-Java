package Fundamentos;

import java.util.Scanner;

public class Login {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "123456";
        String tentativa = "";
        System.out.println("Digite o nome do usuário: ");
        String usuario = sc.nextLine();

        System.out.println("Digite a senha do usuario "+ usuario.toUpperCase());
        while(!tentativa.equals(senha)) {
            tentativa = sc.nextLine();
            if(!tentativa.equals(senha)) {
                if(tentativa.equals("fim")) {
                    System.out.println("Saindo...");
                    break;
                }
                System.out.println("Senha inválida, tente novamente ou digite 'fim' para sair");
            }
        }

        if(tentativa.equals(senha)) {
            System.out.println("Usuário logado com sucesso!");
        }

        sc.close();

    }
}
