import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double[] precoCompras = new double[100];
    double[] precoVendas = new double[100];
    double lucro = 0;
    int totalLucroMenor10 = 0;
    int totalLucroMenor20 = 0;
    int totalLucroMaior20 = 0;
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 100; i++) {
      System.out.println("Digite o preco de compra: ");
      precoCompras[i] = Double.parseDouble(scanner.nextLine());

      System.out.println("Digite o preco de venda: ");
      precoVendas[i] = Double.parseDouble(scanner.nextLine());

      lucro = precoVendas[i] - precoCompras[i];

      if (lucro < 10) {
        totalLucroMenor10++;
      } else if (20 < lucro) {
        totalLucroMaior20++;
      } else {
        totalLucroMenor20++;
      }
    }

    scanner.close();

    System.out.println("Total de mercadorias com lucro < 10%: " + totalLucroMenor10);
    System.out.println("Total de mercadorias com lucro entre 10% e 20%: " + totalLucroMenor20);
    System.out.println("Total de mercadorias com lucro > 20%: " + totalLucroMaior20);
  }
}