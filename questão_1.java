package padrao;

import java.util.Scanner;

public class questão_1 {
    /*ESCREVA UM PROGRAMA QUE LEIA A IDADE DA PESSOA E
    MOSTRE QUANTOS DIAS ELA TEM DE VIDA
     */
    public static void main(String[] args) {
        int numAnos, numDias;
        Scanner ent = new Scanner(System.in);
        System.out.println("qual a sua idade ?");
        numAnos = ent.nextInt();
        numDias = numAnos*365;
        System.out.println("você tem " + numDias + "Dias na terra");
    }
}
