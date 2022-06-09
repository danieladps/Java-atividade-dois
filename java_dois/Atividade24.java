import java.util.Scanner;
public class Atividade24 {
    public static void main(String[] args) {
        //Um zoológico muito louco. Escreva um programa que leia a idade de 2 javalis e 2 girafas (considere que a idade dos javalis será sempre diferente, assim como das girafas ). Calcule e escreva a soma das idades do javali mais velho com a girafa mais nova, e o produto das idades do javali mais novo com a girafa mais velha.

        Scanner ler = new Scanner(System.in);



    System.out.println("Informe a idade do primeiro javali");
    int n1 = ler.nextInt();

    System.out.printlnt("Informe a idade do segundo javali");
    int n2 = ler.nextInt();

    System.out.println("Informe a idade da girafa");
    int n3 = ler.nextInt();

    System.out.println("Informe a idade da segunda girafa");
    int n4 = ler.nextInt();


    int soma=0;
    int multiplicacao=0;


    if(n1==n2 && n3==n4){
        System.out.println("Não foi possível calcular");
    }
      else if(n1>n2&&n3>n4){
           soma= n1+n4;
           multiplicacao= n2*n3;
          System.out.println("a soma dos maiores é: "+ soma+ " o produto é: "+ multiplicacao);
      }
      
      else if(n2>n1&&n3<n4){
          soma= n2+n4;
          multiplicacao= n1*n3;
          System.out.println("a soma dos maiores é:"+soma+ " o produto é "+ multiplicacao);
      }
      
      else if (n1>n2&&n4<n3){
          soma=n1+n4;
          maltiplicacao=n1*n3;
          System.out.println("A soma dos maiores é" +soma+ " o produto "+ multiplicacao);
      }
      
      else if(n4>n3&&n2<n1){
          soma= n3+n4;
          multiplicacao= n1*n4;
          System.out.println("A soma dos maiores é"  +soma + " o produto "+ multiplicacao);
          
      }
      
    

        ler.close();
    }
}
