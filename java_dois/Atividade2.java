import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        //Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int num1 = ler.nextInt();

        if(num1 > 0){
            System.out.println("O numero "+ num1 + " e positivo");
        }
        else if (num1 <0){
            System.out.println("O numero " + num1 +" é negativo ");
        }
        else if(num1 == 0){
            System.out.println("O numero " + num1 + " é 0");

        }
        ler.close();
    }
}
