package padrao;

import java.util.Scanner;

public class questão_7 {
    /*FAÇA UM PROGRAMA QUE MOSTRE A MEDIA E O NOME DO ALUNO E
    EXIBA UMA MENSAGEM DE REPROVADO E APROVADO */


    public static void main(String[] args) {
        float nota1, nota2, nota3, nota4, media;
        String nome_do_aluno;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe o nome do aluno");
        nome_do_aluno = ent.nextLine();
        System.out.println("o nome do aluno e: " + nome_do_aluno);
        System.out.println("informe a primeira nota");
        nota1 = ent.nextInt();
        System.out.println("informe a segunda nota");
        nota2 = ent.nextInt();
        System.out.println("informe a terceira nota");
        nota3 = ent.nextInt();
        System.out.println("informe a quarta nota");
        nota4 = ent.nextInt();
        media = (nota1 + nota2 + nota3 + nota4);
        if (media >= 7) {
            System.out.println("você foi aprovado");
        } else {
            System.out.println("você foi reprovado");
        }
    }
}
