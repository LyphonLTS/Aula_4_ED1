import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] voos = new int[1000];
    int numVoo = 0;
    String[] nomes = new String[1000];
    String numVooDesejado = "";
    String identidade = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o numero de voos");
    numVoo = Integer.parseInt(scanner.nextLine());

    for (int i = 0; i < numVoo; i++) {
      System.out.println("Entre com a identificação do voo " + (i + 1) + ": ");
      nomes[i] = scanner.nextLine();

      System.out.println("Entre com a quantidade de lugares disponiveis no voo " + (nomes[i]) + ": ");
      voos[i] = Integer.parseInt(scanner.nextLine());
    }

    System.out.println("Entre com o numero do voo desejado ou @ para terminar: ");
    numVooDesejado = scanner.nextLine();

    while (!numVooDesejado.equals("@")) {
      int i = 0;

      while (!numVooDesejado.equals(nomes[i]) && i < (numVoo - 1)) {
        i++;
      }

      if (nomes[i].equals(numVooDesejado)) {
        if (0 < voos[i]) {
          voos[i]--;

          System.out.println("Qual o numero da identidade do cliente?");
          identidade = scanner.nextLine();

          System.out.println("Identidade: " + identidade + "\nVoo: " + numVooDesejado);
        } else {
          System.out.println("Não existem mais lugares neste voo.");
        }
      } else {
        System.out.println("Não existe este voo");
      }

      System.out.println("Entre com o numero do voo desejado ou @ para terminar: ");
      numVooDesejado = scanner.nextLine();
    }

    scanner.close();
  }
}