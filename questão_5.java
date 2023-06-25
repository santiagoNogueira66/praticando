package padrao;

import java.util.Scanner;

public class questão_5 {
    /*FAÇA UM PROGRAMA QUE LEIA OS CURSOS CITADOS
    EM UMA LISTA E DÊ AS BOAS VINDAS PARA OS ALUNOS
    E MOSTRE UMA MENSAGEM CASO O CURSO NÃO ESTEJA NA LISTA*/
    public static void main(String[] args) {
        int curso1;
        Scanner ent = new Scanner(System.in);
        System.out.println("digite 1 para ads");
        System.out.println("digite 2 para si ");
        System.out.println("digite 3 para redes");
        System.out.println("digite 4 para jogos digitais");
        System.out.println("qual o seu curso ?");
        curso1 = ent.nextInt();

        if (curso1 == 1) {
            System.out.println("Bem vindo aluno de ads");
        } else if (curso1 == 2) {
            System.out.println("Bem vindo aluno de si");
        } else if (curso1 == 3) {
            System.out.println("Bem vindo aluno de redes");
        } else if (curso1 == 4) {
            System.out.println("Bem vindo aluno de jogos digitais");
        }else {
            System.out.println("Seu curso não está na lista");
        }
    }
}
