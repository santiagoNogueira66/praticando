package padrao;

import java.util.Scanner;

public class questão_10 {
    /*FAÇA UM PROGRAMA QUE LEIA O PESO E O SEXO DO USUARIO E LOGO EM SEGUIDA
    CALCULA O IMC E MOSTRA O PESO IDEAL */
    public static void main (String[] args){
        Scanner ent = new Scanner(System.in);
        char sexo;
        float peso;
        System.out.println("Qual o seu genero ? ");
        sexo = ent.nextLine().charAt(0);
        System.out.println("Qual o seu peso ?");
        peso = ent.nextFloat();
        switch (sexo){
            case 'f':
                System.out.println("peso ideal: " + (100 - peso)*0.85);
        }
    }
}
