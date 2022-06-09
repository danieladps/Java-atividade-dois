import java.util.Scanner;
public class Atividade22 {
    public static void main(String[] args) {
//A Loja Remi du Fromage está com uma promoção onde cada capacete artesanal para tartaruga custa R$18.230 e pode ser pago em até 15 vezes sem juros. Crie um programa onde o usuário possa informar o valor parcelas que deseja pagar e exiba o valor de cada parcela.

Scanner ler = new Scanner(System.in);

System.out.println("informe o valor da parcela em até 15x sem juros");
int n1 = ler.nextInt();

Double resultado = (18.230/n1);
System.out.println("Você parcelou seu produto em " +n1+ "x" + " com o valor da pracela de "+ resultado);
        

ler.close();
    }
}
