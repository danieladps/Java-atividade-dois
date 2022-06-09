import java.util.Scanner;
public class Atividade12 {

    public static void main(String[] args) {
        
    

        //A equipe Mercedes deseja calcular o número mínimo de litros que deverá colocar no tanque de seu carro para que ele possa percorrer um determinado número de voltas até o primeiro reabastecimento.Escreva um programa que leia o comprimento da pista (em metros), o número total de voltas a serem percorridas no grande prêmio, o número de reabastecimentos desejados e o consumo de combustível do carro (em Km/L). O programa deve calcular e exibir o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. Observação: considere que a quantidade de voltas entre os reabastecimentos é o mesmo, mas não poderá ser maior ou igual a 2. O usuário deve informar a quantidade de quilômetros total do circuito e a quantidade de litros que o carro pode possuir. 
        Scanner ler = new Scanner (System.in); 
   
        System.out.println("qual o comprimento da pista em metros?");
        int n1 = ler.nextInt();

        System.out.println("quantas voltas a serem percorridas?");
        int voltas = ler.nextInt();
        
        System.out.println("Numéro de reabastecimento:");
        int n3 = ler.nextInt();

        System.out.println("Qual o consumo de combustivvel?:");
        int n4 = ler.nextInt();

        int voltas_1=(n2/n3);
        int reabastecimento =(voltas_1*n1)/1000;


        if(voltas> 2==2);{
            System.out.println("tente novamente");
        }
        if(voltas< 2==2);{
            System.out.println("Total de combustivel até o primeiro reabastecimento " +reabastecimento+ " Litros");
        }
        
        ler.close();
    }
}