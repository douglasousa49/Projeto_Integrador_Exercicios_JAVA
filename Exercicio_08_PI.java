import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

// Douglas de Sousa Silva
// Realiza o calculo de faturamento de venda de pizzas.

public class Exercicio_08_PI
{
	public static void main(String[] args) {
	    
	    Locale localeBR = new Locale("pt","BR");
	    
	    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Qual é o valor da pizza de marguerita?");
		    double valor_marguerita = ler.nextDouble();
		    
		System.out.println("Quantas unidades de pizza marguerita foram vendidas?");
		    double marguerita_vendida = ler.nextDouble();
		
		System.out.println("Qual é o valor da pizza de calabresa?");
		    double valor_calabresa = ler.nextDouble();
		    
		System.out.println("Quantas unidades de pizza calabresa foram vendidas?");
		    double calabresa_vendida = ler.nextDouble();
		    
	    System.out.println("Qual é o valor da pizza de napolitana?");
		    double valor_napolitana = ler.nextDouble();
		    
		System.out.println("Quantas unidades de pizza napolitana foram vendidas?");
		    double napolitana_vendida = ler.nextDouble();
		    
		   
		    double sub_total_marguerita = valor_marguerita * marguerita_vendida;
		    
		    double sub_total_calabresa = valor_calabresa * calabresa_vendida;
		    
		    double sub_total_napolitana = valor_napolitana * napolitana_vendida;
		    
		    double total = sub_total_marguerita + sub_total_calabresa + sub_total_napolitana;
		    
		    
		    
        System.out.println("A pizzaria faturou o valor de: " + dinheiro.format(total) + ".");
        
    	}
}
