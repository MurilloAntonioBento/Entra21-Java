package Fundamentos;

import java.util.Scanner;

public class Boletim {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;

        System.out.println(" BOLETIM ");

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite a nota "+ (i+1) +" do aluno");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / 10;
        if (media >= 7) {
            System.out.println("Aluno aprovado!");
            System.out.println("Nota média: "+ media);
        } else if (media >= 5) {
            System.out.println("Aluno em exame!");
            System.out.println("Nota média: "+ media);
        } else {
            System.out.println("Aluno reprovado!");
            System.out.println("Nota média: "+ media);
        }

        sc.close();
    }
}
