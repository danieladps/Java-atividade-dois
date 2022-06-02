import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        // Escreva um programa em que o usuário informe dois números utilizando
        // o"prompt". Então escreva em tela o maior deles.

        Scanner valor = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num1 = valor.nextInt();

        System.out.println("Informe outro numero: ");
        int num2 = valor.nextInt();

        if (num1 > num2) {
            System.out.println("O primerio número é maior");

        } 
        else {
            System.out.println("O segundo numero é maior");
        }
        valor.close();
    }
}
