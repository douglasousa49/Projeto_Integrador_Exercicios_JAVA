import java.util.Scanner;

// Exercicio 6, Projeto Integrador
// Douglas Sousa
// Adrian Sousa
// Alex Dutra

public class Exercicio_06_PI {
  public static void Exercicio_06_PI(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a velocidade média em Km/h: ");
        float velocidade = ler.nextFloat();

        System.out.println("Digite a distancia em Km: ");
        float distancia = ler.nextFloat();

        if (velocidade < 0 || distancia < 0) {
          System.out.println("Velocidade e distancia não podem ser valores negativos");
        }
          
      else {

        float tempo = distancia / velocidade;        

        float resultado = tempo * 60;

        System.out.printf("O tempo de viagem foi de %.0f minutos.", resultado);
        System.out.println();
      
      }


  }
}
