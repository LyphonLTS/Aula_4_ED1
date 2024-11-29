import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] notas1 = new int[15];
    int[] notas2 = new int[15];
    int[] medias = new int[15];
    String[] nomes = new String[15];
    String[] sit = new String[15];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 15; i++) {
      System.out.println("Digite o " + (i + 1) + "º nome: ");
      nomes[i] = scanner.nextLine();

      System.out.println("Digite a 1ª nota: ");
      notas1[i] = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a 2ª nota: ");
      notas2[i] = Integer.parseInt(scanner.nextLine());

      medias[i] = Math.round((notas1[i] + notas2[i]) / 2);

      sit[i] = 5 <= medias[i] ? "AP" : "RP";

      System.out.println();
    }

    scanner.close();

    System.out.println("\n\t\tRELACAO FINAL");
    for (int i = 0; i < 15; i++) {
      System.out
          .println((i + 1) + " - " + nomes[i] + "\t" + notas1[i] + "\t" + notas2[i] + "\t" + medias[i] + "\t" + sit[i]);
    }
  }
}