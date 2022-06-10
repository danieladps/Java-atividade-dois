import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
        Scanner ler = new Scanner(System.in);
        
        Double nota = 0.0;
        int contador = 0;
        Double soma = 0.0;

        while(contador<4){
            System.out.println("Informe a nota");
            nota = ler.nextDouble();

            if(nota >=0 && nota <=10){
                soma += nota;
                contador ++;
            }else{
            contador = 5;
            System.out.println("Nota Invalida, por favor tente novamente!");
            }
        }

        Double media = soma / 4;

        if (media>=6){
            System.out.println("Parabéns, você foi aprovado! Sua média: " + media);
        }else{
            System.out.println("Infelizmente você foi reprovado! Sua média: " + media);
        }
        ler.close();

        
    }
}