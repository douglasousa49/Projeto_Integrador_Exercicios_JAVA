import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

// Douglas de Sousa Silva
// Realiza o calculo de venda de um produto, caculando seu preco unitario vezes quantidade vendida e somado com o valor do frete.

public class Exercicio_04_PI
{
	public static void main(String[] args) {
	    
	    Locale localeBR = new Locale("pt","BR");
	    
	    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Digite a quantidade de produtos vendidos:");
		    double produtos_vendidos = ler.nextDouble();
		
		System.out.println("Digite o valor unitario do produto:");
		    double valor_unitario = ler.nextDouble();
		    
	    System.out.println("Digite o valor do frete:");
		    double valor_frete = ler.nextDouble();
		    
		    double sub_total = produtos_vendidos * valor_unitario;
		    
		    double total = sub_total + valor_frete;
		    
		    
        System.out.println("O valor total da venda foi de: " + dinheiro.format(total) + ".");
        
    	}
}
