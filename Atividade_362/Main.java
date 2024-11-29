import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] vetor10 = new int[10];
    int[] vetor20 = new int[20];
    int[] vetorComum = { -999999999, -999999999, -999999999, -999999999, -999999999, -999999999, -999999999, -999999999,
        -999999999, -999999999 };
    int L = 0;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 10; i++) {
      System.out.println("Digite o " + (i + 1) + "º elemento do vetor 1 (10 elementos)");
      vetor10[i] = Integer.parseInt(scanner.nextLine());
    }

    System.out.println();

    for (int i = 0; i < 20; i++) {
      System.out.println("Digite o " + (i + 1) + "º elemento do vetor 2 (20 elementos)");
      vetor20[i] = Integer.parseInt(scanner.nextLine());
    }

    System.out.println();

    scanner.close();

    for (int i = 0; i < 10; i++) {
      int c = 0;

      while (vetor10[i] != vetor20[c] && c < 19) {
        c++;
      }

      if (vetor10[i] == vetor20[c]) {
        int d = 0;

        while (vetor10[i] != vetorComum[d] && d < L) {
          d++;
        }

        if (d == L) {
          vetorComum[d] = vetor10[i];
          L++;
        }
      }
    }

    if (L != 0) {
      System.out.println("Elementos comuns");
      for (int i = 0; i < L; i++) {
        System.out.println(vetorComum[i]);
      }
    } else {
      System.out.println("Não existe elementos comuns");
    }
  }
}