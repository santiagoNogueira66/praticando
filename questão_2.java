package padrao;

import java.util.Scanner;

public class questão_2 {

  /*  FAÇA UM PROGRAMA QUE LEIA A DISTÂNCIA TOTAL PERCORRIDA
    E QUANTIDADE DE COMBUSTÍVEL GASTO
    E COM BASE NESSAS INFORMAÇÕES MOSTRE O CONSUMO TOTAL*/

    public static void main (String [] args){
        float distancia_percorrida, consumo_medio,combustivel_gasto;
        Scanner ent = new Scanner(System.in);
        System.out.println("informe a distância percorrida");
        distancia_percorrida = ent.nextInt();
        System.out.println("informe o combustível gasto");
        combustivel_gasto = ent.nextInt();

        consumo_medio = distancia_percorrida / combustivel_gasto;
        System.out.println("O seu carro consome " + consumo_medio + " km por litro" );
    }
}

