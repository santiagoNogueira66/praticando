package padrao;

import java.util.Scanner;

public class questão_3 {
    /*FAÇA UM PROGRAMA QUE LEIA
    DOIS NUMEROS INTEIROS E DEPOIS MOSTRE A SOMA DELES  */
    public static void main (String [] args){
        int num1,num2,sum;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe o primeiro numero");
        num1 = ent.nextInt();
        System.out.println("informe o segundo numero");
        num2 = ent.nextInt();
        sum = num1 + num2 ;
        System.out.println("a soma dos dois numeros é: " + sum);
    }
}

