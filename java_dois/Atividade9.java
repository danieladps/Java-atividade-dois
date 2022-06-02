import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        // Faça um programa que leia 6 números que o usuário vai informar. Todos os
        // números
        // lidos com valor inferior a 72 devem ser somados. Escreva o valor final da
        // soma efetuada e também todos valores que o usuário informou.

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n2 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n3 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n4 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n5 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n6 = valor.nextInt();

        int soma = 0;

        if (n1 < 72) {
            soma += n1;
        }

        if (n2 < 72) {
            soma += n2;
        }

        if (n3 < 72) {
            soma += n3;
        }

        if (n4 < 72) {
            soma += n4;
        }

        if (n5 < 72) {
            soma += n5;
        }

        if (n6 < 72) {
            soma += n6;
        }

        System.out.println("Você informou os valores: " + n1+"+"+ n2 +"+"+ n2+"+" + n3 +"+"+ n4+"+" + n5+"+" + n6+ " a soma deles e " + soma);

        valor.close();

    }
}