import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
    Scanner ler = new Scanner(System.in);

        int numero;
        int contador = 0;

        while(contador<5){
        System.out.println("Digite um numero");
        numero = ler.nextInt();

            if (numero>0){
                System.out.println("É positivo");
                System.out.println(" ");
            }else if (numero<0){
                System.out.println("É negativo");
                System.out.println(" ");
                
            }else{
                System.out.println("O valor é zero");
                System.out.println(" ");
            }
            contador++;
        }
        ler.close();
    }
}