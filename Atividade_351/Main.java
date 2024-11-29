import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nomes[] = new String[5];
    int num = 0;

    for (int i = 0; i < 5; i++) {
      System.out.println("Digite o " + (i + 1) + "º nome: ");
      nomes[i] = scanner.nextLine();
    }

    System.out.println("Digite o número da pessoa: ");
    num = Integer.parseInt(scanner.nextLine());

    while (1 < num || 5 < num) {
      System.out.println("Digite o número da pessoa: ");
      num = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();

    System.out.println(nomes[num - 1]);
  }
}
