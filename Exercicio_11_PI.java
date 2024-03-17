import java.util.Scanner;

// Douglas Sousa
// Calcula quanto tempo vai demorar para limpar todos os quartos de um hotel.

public class Exercicio_11_PI {
  public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantos quartos tem o seu Hotel?");
        int quarto = ler.nextInt();
        
        System.out.println("Quantas camareiras estão trabalhando?");
        int camareira = ler.nextInt();
        
        System.out.println("Quantos minutos uma camareira demora para limpar um quarto?");
        int tempo_por_quarto = ler.nextInt();
        
        int tempo_limpeza = quarto * tempo_por_quarto / camareira;

        
        System.out.printf("A limpeza de todos os quartos vai demorar " + tempo_limpeza + "min.");
        
        }
  }
