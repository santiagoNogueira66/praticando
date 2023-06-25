package padrao;

import java.util.Scanner;

public class questão_6 {
    /*FAÇA O PROGRAMA QUE MOSTRE A MEDIA E O NOME DO ALUNO*/
    public static void main (String [] args){
        double media,nota1,nota2,nota3;
        String nome_aluno;
        Scanner ent = new Scanner(System.in);

        System.out.println("informe o nome do aluno");
        nome_aluno =ent.nextLine();

        System.out.println("O nome do aluno é: " + nome_aluno);

        System.out.println("informe a primeira nota");
        nota1 = ent.nextDouble();

        System.out.println("informe a segunda nota");
        nota2 = ent.nextDouble();

        System.out.println("informe a terceira nota");
        nota3 = ent.nextDouble();

        media = (nota1 + nota2 + nota3) / 3 ;
        System.out.println("A media final é: " + media);


    }
}
