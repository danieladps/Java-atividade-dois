import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        //Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa. Calcular a média do semestre considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações. Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as informações abaixo:

        Scanner ler = new Scanner(System.in);
        
        Double nota1, nota2, nota_optativa;
        
        
        System.out.println("Digite a nota 1:");
        nota1 = ler.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = ler.nextDouble();

        System.out.println("Digite a nota optativa:");
        nota_optativa = ler.nextDouble();
            
                        if(nota1<nota2){
                            nota1=nota_optativa;
                        }else{
                            nota2=nota_optativa;
                        }

                        Double media = ((nota1+nota2)/2);
                        
                        System.out.println((nota1+nota2)/2);
                        if(media>=6){
                            System.out.println(" Parabéns, você foi aprovado!");
                        
                        }else if(media<3){
                            System.out.println(" Infelizmente você foi reprovado!");
                        }else if(media>=3 && media <6){
                            System.out.println(" Você está de recuperação!");
                        }
                    ler.close();
    }
}