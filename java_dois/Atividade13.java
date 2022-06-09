import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
Scanner ler = new Scanner (System.in);


        System.out.println("Infome um valor");
        int n1 = ler.nextInt();

        System.out.println("Infome um valor");
        int n2 = ler.nextInt();

        System.out.println("Infome um valor");
        int n3 = ler.nextInt();

        System.out.println("Infome um valor");
        int n4 = ler.nextInt();

        int media=(n1+n2+n3+n4)/4;


        if(media>=6){
        System.out.println("PARABÉNS! Você foi aprovado!. Sua média é: "+media);
    } 

        else{
        System.out.println("Infelizmente, você foi reprovado!. Sua média é " +media);
    }

        ler.close();
            }
        }
