import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        //Escreva um programa que calcule a média de quatro números informados pelo usuário, mas somente se esses números forem maiores que 
        //0 e menores que 10. No final, se a média for maior que cinco o usuário receberá uma mensagem 
        //"Você passou no teste". Em qualquer outra situação, ele receberá uma mensagem de "tente novamente"

        Scanner valor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n1 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n2 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n3 = valor.nextInt();

        System.out.println("Digite um numero: ");
        int n4 = valor.nextInt();

        int soma = n1+n2+n3+n4/4;

         if(n1 > 0 && n1 <10  || n2 > 0 &&  n2 <10 || n3 > 0 && n3 <10 || n4 > 0 && n4 < 10){
          if (soma>=5){
                    System.out.println("Você passou no teste " + soma);
                }else if(n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0);
            }
                
                else{
                    System.out.println("Tente novamente " + soma);
                }

     valor.close();
      }
    }
