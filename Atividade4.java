import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        // Faça um programa que leia 3 valores (considere que não serão informados
        // valores iguais) e escrever a soma dos 2 maiores.

        Scanner ler = new Scanner(System.in);

        System.out.println("Inform um valor: ");
        int num1 = ler.nextInt();

        System.out.println("Inform um valor: ");
        int num2 = ler.nextInt();

        System.out.println("Inform um valor: ");
        int num3 = ler.nextInt();

        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                int somaUm = num1 + num2;
                System.out.print("A soma dos maiores e " + somaUm);
            } else {
                int somaDois = num1 + num3;
                System.out.println("A soma dos maiores e " + somaDois);
            }
        }

        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                int somaTres = num2 + num1;
                System.out.print("A soma dos maiores é " + somaTres);
            } else {
                int somaQuatro = num2 + num3;
                System.out.println("A soma dos maiores e " + somaQuatro);
            }

        }

        if (num3 > num2 && num3 > num1){
            if (num2 > num1){
                int somaCinco = num3 + num2;
                System.out.println("A soma dos maiores é " + somaCinco);   
            } else{
                int somaCinco = num1 + num2;
                System.out.println("A soma dos maiores é " + somaCinco);
            }
        }

        ler.close();
    }
}