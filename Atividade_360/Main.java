import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] ultimoDia = { 20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21 };
    int data = 0;
    int dia = 0;
    int mes = 0;
    String[] signos = { "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem",
        "Libra", "Escorpião", "Sagitário" };
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a data no formato ddmm ou 9999 para terminar: ");
    data = Integer.parseInt(scanner.nextLine());

    while (data != 9999) {
      dia = data / 100;
      mes = (data % 100) - 1;

      if (ultimoDia[mes] < dia) {
        mes = (mes + 1) % 12;
      }

      System.out.println("Signo: " + signos[mes]);

      System.out.println("Digite a data no formato ddmm ou 9999 para terminar: ");
      data = Integer.parseInt(scanner.nextLine());
    }

    scanner.close();
  }
}