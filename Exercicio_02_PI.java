import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

// Douglas de Sousa Silva
// Realiza o calculo do volume em litros de uma caixa desejado.

public class Exercicio_02_PI
{
	public static void main(String[] args) {
	    
	    Locale localeBR = new Locale("pt","BR");
	    
	    NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Digite a altura da caixa em cm:");
		    double altura = ler.nextDouble();
		
		System.out.println("Digite a largura da caixa em cm:");
		    double largura = ler.nextDouble();
		    
	    System.out.println("Digite o comprimento da caixa em cm:");
		    double comprimento = ler.nextDouble();
		    
		    double volume_cm = altura * largura * comprimento;
		    
		    double volume_litros = volume_cm / 1000;
		    
		    
        System.out.println("O volume da caixa é: " +numberFormat.format(volume_litros) + "L.");
        
        
	}
}
