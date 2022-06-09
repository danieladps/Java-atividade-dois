import java.util.Scanner;
public class Atividade18 {
    public static void main(String[] args) {
        //Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1: feminino 2: masculino) de uma pessoa, construa um programa que calcule e imprima seu peso ideal, utilizando as seguintes fórmulas: para homens:(72,7*h)-58   para mulheres:(61,1*h)-44.7 observação Altura = h (na fórmula acima)

            Scanner ler = new Scanner(System.in);

            System.out.println("Digite 1 para feminino, ou 2 para masculino");
            int n1 = ler.nextInt();

            System.out.println("Digite sua altura");
            Double n2 = ler.nextDouble();

            Double somaUm = (61.1 * n2) - 44.7;
            
            Double somaDois = (72.7 * n2) - 58.0;


            if(n1==1){
                System.out.println("Seu peso ideal é: " + somaUm);
            }else{
                System.out.println("Seu peso ideal é: " +somaDois);
            }
        
            ler.close();
    }
}
