import java.util.Scanner;
public class Atividade15 {
    public static void main(String[] args) {
        //Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).

        Scanner ler = new Scanner (System.in); 

        System.out.println("Informe sua data de nascimento");
        int data = ler.nextInt();

        if (data <= 2006){
            System.out.println("Você pode votar");
        }else{
            System.out.println("Você não pode votar");
        }
        
        ler.close();
    }
}
