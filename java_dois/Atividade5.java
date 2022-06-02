import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        // Faça um programa que leia dois valores informados pelo usuário e exiba uma
        // das três mensagens a seguir: ‘Números iguais’, caso os números sejam iguais
        // ‘Primeiro é maior’, caso o primeiro seja maior que o segundo; ‘Segundo
        // maior’, caso o segundo seja maior que o primeiro.

        Scanner ler = new Scanner(System.in);

        System.out.println("Inform um valor: ");
        int num1 = ler.nextInt();

        System.out.println("Inform um valor: ");
        int num2 = ler.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais");
        } else if (num1 > num2) {
            System.out.println("O primeiro numero é maior");
        } else if (num2 > num1) {
            System.out.println("O segundo numero é maior");
        }

        ler.close();

    }
}
