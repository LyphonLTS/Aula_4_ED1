import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nomes = new String[5];
    double[] notas1 = new double[5];
    double[] notas2 = new double[5];
    double[] medias = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.print("Digite o " + (i + 1) + "º nome: ");
      nomes[i] = scanner.nextLine();

      System.out.print("Digite a 1ª nota: ");
      int nota = Integer.parseInt(scanner.nextLine());
      notas1[i] = nota < 0 ? 0 : nota;

      System.out.print("Digite a 2ª nota: ");
      nota = Integer.parseInt(scanner.nextLine());
      notas2[i] = nota < 0 ? 0 : nota;

      medias[i] = (notas1[i] + notas2[i]) / 2;

      System.out.println();
    }

    scanner.close();

    for (int i = 0; i < 5; i++) {
      System.out.println((i + 1) + " - " + nomes[i]);
      System.out.println(notas1[i] + "\t" + notas2[i] + "\t" + medias[i]);
    }
  }
}