import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

// Douglas de Sousa Silva
// Realiza o calculo de venda de um produto, caculando seu preco unitario vezes quantidade vendida e somado com o valor do frete.

public class Exercicio_05_PI
{
	public static void main(String[] args) {
	    
	    Locale localeBR = new Locale("pt","BR");
	    
	    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Digite o valor/hora do funcionário:");
		    double valor_hora = ler.nextDouble();
		
		System.out.println("Digite quantos dias o funcionário trabalhou no mês:");
		    double dias_trabalhados = ler.nextDouble();
		    
	    System.out.println("Digite quantas horas o funcionário trabalha por dia:");
		    double horas_trabalhadas_dia = ler.nextDouble();
		    
		    double total = valor_hora * dias_trabalhados * horas_trabalhadas_dia;
		    
		    
        System.out.println("O valor do salario do funcionário sera de: " + dinheiro.format(total) + ".");
        
    	}
}
