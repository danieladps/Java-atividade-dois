import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        // Faça um programa para ler 3 valores (considere que não serão informados
        // valores iguais) e escrever o maior deles.
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        int num1 = ler.nextInt();

        System.out.println("Informe o segundo numero:");
        int num2 = ler.nextInt();

        System.out.println("Informe o terceiro numero");
        int num3 = ler.nextInt();

        if(num1 > num2  && num1 > num3){
          System.out.println("O primeiro valor é maior");
        }
        if(num2 > num1  && num2 > num3){
            System.out.println("O segundo valor é maior");
          }
          else{
              System.out.println("O terceiro numero é maior");
          }



        ler.close();

    }
}
