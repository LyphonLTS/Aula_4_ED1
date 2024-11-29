import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[][] matriz = new int[5][5];
    int soma = 0;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("Digite o elemento: " + (i + 1) + " - " + (j + 1));
        matriz[i][j] = Integer.parseInt(scanner.nextLine());
      }
    }

    scanner.close();

    System.out.println("\n\t\tMATRIZ");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (matriz[i][j] % 2 == 1) {
          soma += matriz[i][j] * matriz[i][j];
        }
      }
    }

    System.out.print("Raiz quadrada da soma dos quadrados dos números ímpares: " + Math.floor(Math.sqrt(soma)));
  }
}