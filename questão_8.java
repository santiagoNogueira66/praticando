package padrao;

import java.util.Scanner;

public class questão_8 {
    /*FAÇA UM PROGRAMA QUE MOSTRE A QUANTIDADE DE FERRADURAS USADAS
     EM UMA CORRIDA A PARTIR DA QUANTIDADE DE CAVALOS
     (QUE DEVERÁ SER INFORMADA PELO USUARIO)
*/

    public class exercicio {
        public static void main(String[] args) {
            float qnt_ferradura, qnt_cavalos;
            Scanner ent = new Scanner(System.in);
            System.out.println("informe a quantidade de cavalos");
            qnt_cavalos = ent.nextFloat();
            qnt_ferradura = qnt_cavalos * 4;
            System.out.println("A quantidade de ferraduras é: " + qnt_ferradura);
        }
    }
}