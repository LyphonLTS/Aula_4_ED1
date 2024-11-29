import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[][] matrizA = new int[5][5];
    int[][] matrizB = new int[5][5];
    int[][] matrizDif = new int[5][5];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("Digite o elemento de A[" + (i + 1) + "][" + (j + 1) + "]: ");
        matrizA[i][j] = Integer.parseInt(scanner.nextLine());
      }
    }

    System.out.println();

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("Digite o elemento de B[" + (i + 1) + "][" + (j + 1) + "]: ");
        matrizB[i][j] = Integer.parseInt(scanner.nextLine());

        matrizDif[i][j] = matrizA[i][j] - matrizB[i][j];
      }
    }

    scanner.close();

    System.out.println("\n\t\tMATRIZ DIFERENÇA");
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("\t" + matrizDif[i][j]);
      }
      System.out.println();
    }
  }
}