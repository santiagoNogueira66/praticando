package padrao;

import java.util.Scanner;

public class questão_9 {
    /*FAÇA UM PROGRAMA QUE LEIA A QUANTIDADE DO PRODUTO E CALCULE O
     VALOR DO PRODUTO A 1.80 SE FOR COMPRADO MENOS QUE 20,
     E A 1.40 SE FOR COMPRADO MAIS QUE 20*/
    public static void main (String [] args){
        int qnt_produto;
        double valor;
        Scanner ent = new Scanner(System.in);
        System.out.println("Informe a quantidade do produto");
        qnt_produto = ent.nextInt();
        if (qnt_produto <= 20 ){
            valor = qnt_produto * 1.80;
            System.out.println("O valor total e de: " + valor);
        }else {
            valor = qnt_produto * 1.40;
            System.out.println("O valor total e de: " + valor);
        }
    }
}
