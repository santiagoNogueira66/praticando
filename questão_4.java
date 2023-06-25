package padrao;

import java.util.Scanner;

public class questão_4 {
    /*FAÇA UM PROGRAMA QUE LEIA DOIS NUMEROS INTEIROS E EXIBA A
MEDIA, A SOMA, A DIVISÃO, A SUBTRAÇÃO E A MULTIPLICAÇÃO
*/

    public static void main (String [] args){
        int num1,num2, media,sub,mult,divi,sum;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe o primeiro número inteiro");
        num1 = ent.nextInt();
        System.out.println("informe o segundo número inteiro");
        num2 = ent.nextInt();
        sum = num1 + num2;
        media = sum / 2;
        System.out.println("A média dos numeros e: " + media );
        sub = num1 - num2 ;
        System.out.println("a subtração dos numeros e: " + sub);
        mult = num1 * num2 ;
        System.out.println("A multiplicação dos numeros e: " + mult);
        divi = num1 / num2 ;
        System.out.println("A divisão dos numeros e : " + divi);
    }
}
