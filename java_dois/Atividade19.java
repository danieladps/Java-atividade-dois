import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {

    //Escreva um programa para ler o número de gols marcados pelo Grêmio e o número de gols marcados pelo Inter em um GRENAL. Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE.

            Scanner ler =new Scanner (System.in);

                System.out.println("Informe o número de gols do Grêmio:");
                int num1 = ler.nextInt();

                System.out.println("Informe o número de gols do Inter:");
                int num2 = ler.nextInt();

                if(num1>num2){
                    System.out.println("O Grêmio é o vencedor com "+num1+ " gols");
                }

                if(num2>num1){
                    System.out.println("O Inter é o vencedor com " +num2+ " gols");
                }

                if(num1==num2){
                    System.out.println("Empate");
                }

               ler.close();
  }
}
