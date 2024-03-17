import java.util.Scanner;

// Douglas Sousa
// Calcula a quantidade de caminhoes para escoar uma safra de grãos em toneladas.

public class Exercicio_12_PI {
  public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Quantas toneladas de grãos serão colhidas nessa safra?");
        int graos = ler.nextInt();
        
        System.out.println("Qual a carga maxima dos seus caminhões em toneladas?");
        int carga = ler.nextInt();
        
        int total_caminhoes = graos / carga;
        
        if(total_caminhoes == 1){
            System.out.printf("Você vai precisar de " + total_caminhoes + " caminhão para escoar toda a safra.");
        }

        else{
        System.out.printf("Você vai precisar de " + total_caminhoes + " caminhões para escoar toda a safra.");
        
        }
  }
}