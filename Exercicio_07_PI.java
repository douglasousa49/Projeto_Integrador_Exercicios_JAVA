import java.util.Scanner;

// Douglas Sousa
// Calcula a area quadrada de um estacionamento para um predio, 1 vaga de 10m2 por AP.

public class Exercicio_07_PI {
  public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a quantidade de andares do prédio: ");
        int quantidade_andares = ler.nextInt();

        System.out.println("Digite quantos apartamentos são por andar: ");
        int ap_andares = ler.nextInt();

        int quantidade_vagas = quantidade_andares * ap_andares;       

        int resultado = quantidade_vagas * 10;

        System.out.printf("O estacionamento do prédio precisa ter " + resultado + "m2 de area, para cada morador ter uma vaga de 10m2.");
        
      }
  }
