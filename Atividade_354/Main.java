import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] nums = new int[15];

    for (int i = 0; i < 15; i++) {
      System.out.println("Digite " + (i + 1) + "º número: ");
      nums[i] = Integer.parseInt(scanner.nextLine());
    }

    for (int i = 0; i < 15; i++) {
      String tipo = nums[i] % 2 == 0 ? "par" : "ímpar";
      System.out.println((i + 1) + " - " + nums[i] + " - " + tipo);
    }
  }
}