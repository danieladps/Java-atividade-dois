import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        //Faça um programa que leia 10 números informados pelo usuário e ao final da leitura escrever a soma total dos 10 números lidos.
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
           System.out.println("A soma dos numeros é: " + soma);
           valor.close();





    }
}