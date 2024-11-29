import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String frase;
    int op = 0;

    do {
      System.out.println("MENU");
      System.out.println("1 - Imprime o comprimento da frase");
      System.out.println("2 - Imprime os dois primeiros e os dois últimos caracteres da frase");
      System.out.println("3 - Imprime a frase espelhada");
      System.out.println("4 - Terminar o algoritmo");
      op = Integer.parseInt(scanner.nextLine());

      switch (op) {
        case 1:
          System.out.println("Digite uma frase");
          frase = scanner.nextLine();
          System.out.println("Número de caracteres da frase: " + frase.length());
          break;

        case 2:
          System.out.println("Digite uma frase");
          frase = scanner.nextLine();
          System.out.println("Os dois primeiros caracteres: " + frase.substring(0, 2));
          System.out.println("Os últimos primeiros caracteres: " + frase.substring(frase.length() - 2, frase.length()));
          break;

        case 3:
          System.out.println("Digite uma frase");
          frase = scanner.nextLine();

          String fraseEspelhada = "";
          for (int i = frase.length() - 1; i >= 0; i--) {
            fraseEspelhada += frase.charAt(i);
          }

          System.out.println(fraseEspelhada);
          break;

        case 4:
          System.out.println("FIM");
          break;

        default:
          System.out.println("Nenhuma opção válida detectada, por favor selecione uma opção válida");
          break;
      }

      System.out.println();
    } while (op != 4);

    scanner.close();
  }
}