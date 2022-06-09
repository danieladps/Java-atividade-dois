import java.util.Scanner;
    public class Atividade20 {
        public static void main(String[] args) {
        //Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
        //Calcular e imprimir o seguinte: 
        //Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu perímetro. 
        //Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área. 
        //Se o número de lados for igual a 5 escrever PENTÁGONO. 

       // Observação: Considere que o usuário só informará os valores 3, 4 ou 5. 

        //Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO. 
        //Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.


            Scanner ler = new Scanner (System.in);
            
            System.out.println("Infome 3 se for triângulo, 4 se for quadrado e 5 se for pentágono");
            int n1 = ler.nextInt();

            System.out.printlnv("Se for um triângulo digite o perimetro");
            int n2 = ler.nextInt();


            System.out.println("Caso seja um quadrado digite a área");
            int n3 = ler.nextInt();


            if(n1==3){
            System.out.println("O triângulo possui um perimetro de:" +n2+" cm."+" O valor de um dos lado do triângulo é: "+ (n2/3)+" cm");
            }


            if(n1==4){
                System.out.println("O quadrado possui um área de: "+ n3+ " cm" + "O valor de um dos lado do quadrado é: "+ (n3/4)+ "cm");
            }


            if(n1==5){
                System.out.println("A figura é um pentágono");
            }

            if(n1<3){
                System.out.println("A figura não é um poligono");
            }

            if(n1>5){
                System.out.println("Poligono não identificado");
            }
            ler.close();
        }
    }
        

