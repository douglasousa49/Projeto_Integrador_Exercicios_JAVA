import java.util.Scanner;

// Douglas de Sousa Silva
// Realiza calculo para obter a corrente elétrica entre dois resistores ligados em serie sob uma tensão eletrica desejada.

public class Exercicio_03_PI
{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Digite o valor em ohms do primeiro resistor a ser ligado em serie:");
		    float r1 = ler.nextFloat();
		
		System.out.println("Digite o valor em ohms do segundo resistor a ser ligado em serie com o primeiro:");
		    float r2 = ler.nextFloat();
		    
		    System.out.println("Digite o valor da tensão em Volt para alimentar os resistores r1 e r2:");
		    float v1 = ler.nextFloat();
		    
		    float a1 = v1 / (r1 + r2);
		    
        System.out.printf("O valor da corrente eletrica no circuito R1 + R2 = " + a1 + "A.");
		    
		    
	}
}
