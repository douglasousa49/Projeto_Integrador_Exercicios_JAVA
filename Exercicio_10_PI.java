import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

// Douglas de Sousa Silva
// Realiza o calculo de gasto de combustivel em uma viagem.

public class Exercicio_10_PI
{
	public static void main(String[] args) {
	    
	    Locale localeBR = new Locale("pt","BR");
	    
	    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Com 1L de combustivel, seu carro percorre quantos quilometros?");
		    double litros_quilometros = ler.nextDouble();
		    
		System.out.println("Quanto você pagou em cada litro de combustivel?");
		    double preco_litro = ler.nextDouble();
		
		System.out.println("Qual a distancia percorrida em sua viagem em quilimetros?");
		    double distancia_km = ler.nextDouble();
		    
		    double total = (distancia_km * preco_litro) / litros_quilometros;
		    
		    
        System.out.println("Você gastou em sua viagem o valor de: " + dinheiro.format(total) + ".");
        
    	}
}
