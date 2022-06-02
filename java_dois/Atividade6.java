import java.util.Scanner;
public class Atividade6{
    public static void main (String [] args){
        // Faça um programa que leia 10 valores informados pelo usuário,
        // calcule, exiba os números informados e escreva a média aritmética desses valores lidos.
        Scanner valor = new Scanner (System.in);

        int num = 0;
        int soma = 0;
        int contador = 0;

        while(contador< 10){
            System.out.println("Informe um numero");
            num = valor.nextInt();
            soma += num;
            contador ++;
           }
           System.out.println("A média do numeros é: " + (soma/10));

           


             valor.close();
       }
    }
