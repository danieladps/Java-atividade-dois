import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        //Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro, o
        // último e o maior de todos eles (considere que todos os números informados serão diferentes)
        Scanner valor = new Scanner (System.in);

            System.out.println("Informe um valor: ");
            int num1 = valor.nextInt();

            System.out.println("Informe um valor: ");
            int num2 = valor.nextInt();

            System.out.println("Informe um valor: ");
            int num3 = valor.nextInt();

            System.out.println("Informe um valor: ");
            int num4 = valor.nextInt();

            if(num1 > num2 && num1 > num3 && num1 > num4){
                     System.out.println("O primeiro valor é " + num1 + ", o segundo valor é o" + num2 + " e o maior valor é o, " + num1);
           }         
                  else if (num2>num1 && num2>num3 && num2 > num4){
                     System.out.println("O primeiro valor é " + num1 + ", o segundo valor é o" + num2 + " e o maior valor é o, " + num2);
                  }
                  else if (num3>num1 && num3>num2 && num3 > num4){
                    System.out.println("O primeiro valor é " + num1 + ", o segundo valor é o" + num2 + " e o maior valor é o, " + num3);
                 }
                 else if (num4>num1 && num4>num2 && num4 > num3){
                    System.out.println("O primeiro valor é " + num1 + ", o segundo valor é o" + num2 + " e o maior valor é o, " + num4);
                 }
           valor.close();
        
    }
}