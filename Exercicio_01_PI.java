import java.util.Scanner;

// Douglas de Sousa Silva
// Realiza o calculo do volume em centimetros de um cilindro desejado.

public class Exercicio_01_PI
{
	public static void main(String[] args) {
	    
	    Scanner ler = new Scanner(System.in);
	    
	    
		System.out.println("Digite o valor do raio do cilindro em centimetros:");
		    double raio = ler.nextDouble();
		
		System.out.println("Digite o valor da altura do cilindro em centimetros:");
		    double altura = ler.nextDouble();
		    
		    double pi = 3.1416;
		    
		    double volume = Math.pow(raio, 2) * altura;
		    
		    double volume3 = volume * pi;
		    
		    
        System.out.printf("O volume do cilindro é: %.0f cm cúbicos.", volume3);
		    
		    
	}
}
