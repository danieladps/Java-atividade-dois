import java.util.Scanner;
public class Atividade16 {
    public static void main(String[] args) {
        //As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas (considere que o usuário informará a quantidade), e calcule e escreva o valor total da compra.
        Scanner ler = new Scanner (System.in);

        System.out.println("Informe a quantidade de maçãs compradas?");
        int n1 = ler.nextInt();

        Double soma= (n1 * 0.30);
        Double soma2= (n1 * 0.25);
    
        if(n1>=12){
            System.out.println("O valor total é de: " + soma + " reias" );
        }
        if(n1<12){
            System.out.println("O valor total é de: " + soma2 + "reais");
        }

        ler.close();

    }
}