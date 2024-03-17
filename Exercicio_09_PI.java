import java.util.Scanner;

// Douglas Sousa
// Calcula o volume de uma esfera em cm3.

public class Exercicio_09_PI {
  public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor do diametro da esfera em cm: ");
        double diametro = ler.nextDouble();

        double pi = Math.PI;
        
        double raio = diametro / 2;
        
        double raio_ao_cubo = Math.pow(raio , 3);
        
        double resultado = (4 * pi * raio_ao_cubo) / 3;

        System.out.printf("O volume da esfera é: %.2f cm3.", resultado);
        
        }
  }
