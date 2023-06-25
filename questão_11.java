package padrao;

import java.util.Scanner;

public class questão_11 {
    /*FAÇA UM PROGRA QUE LÊ DOIS NÚMEROS, E RETORNA SE OS DOIS
    SÃO IGUAIS OU DIFERENTES E QUAL O MAIOR DELES*/
    public static void main (String [] args){
        int num1,num2;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe o primeiro número");
        num1 = ent.nextInt();
        System.out.println("informe o segundo número");
        num2 = ent.nextInt();
        if (num1 == num2 && num1>num2  && num1==num2){
            System.out.println("este números são iguais");
            System.out.println("o número 1 é maior");
        } else {
            System.out.println("estes números são diferentes");
            System.out.println("o número 2 é maior");
        }
    }
}
