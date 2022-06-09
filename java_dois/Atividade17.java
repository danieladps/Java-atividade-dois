import java.util.Scanner;
public class Atividade17{
    public static void main(String[] args) {
        //Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número "1234" sem aspas. Devem ser impressas as seguintes mensagens: "ACESSO PERMITIDO" caso a senha seja válida. "ACESSO NEGADO" caso a senha seja inválida.
        Scanner ler = new Scanner (System.in); 

        System.out.println();
        int senha = ler.nextInt();

        if (senha == 1234){
            System.out.println("ACESSO PERMITIDO");
        }else{
            System.out.println("ACESSO NEGADO");
        }
        
        ler.close();
    }
}