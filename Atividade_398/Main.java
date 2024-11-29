import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int[] codigos = new int[3];
    int[] quantidades = new int[3];
    int codi = 0;
    int codigo = 0;
    int quantidade = 0;
    int aux = 0;
    int auxQtd = 0;
    int k = 0;
    double[] precos = new double[3];
    double venda = 0;
    double geral = 0;
    double auxPreco = 0;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o código do produto ou 0 para encerrar");
    codi = Integer.parseInt(scanner.nextLine());

    while (k < 3 || codi != 0) {
      codigos[k] = codi;

      System.out.println("Digite a quantidade do produto");
      quantidades[k] = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite o preco do produto");
      precos[k] = Double.parseDouble(scanner.nextLine());

      k++;

      System.out.println("Digite o código do produto ou 0 para encerrar");
      codi = Integer.parseInt(scanner.nextLine());
    }

    System.out.println("Digite o código do produto para a venda ou 0 para encerrar");
    codigo = Integer.parseInt(scanner.nextLine());

    System.out.println("Digite a quantidade do produto para a venda ou 0 para encerrar");
    quantidade = Integer.parseInt(scanner.nextLine());

    while (codigo != 0 || quantidade != 0) {
      for (int i = 0; i < k; i++) {
        if (codigos[i] == codigo) {
          aux = codigo;

          if (quantidade <= quantidades[i]) {
            quantidades[i] -= quantidade;

            venda += precos[i] * quantidade;

            auxQtd = quantidade;
          }
        }
      }
    }

    if (aux == 0 || aux < 0) {
      System.out.println("Produto não cadastrado!");
    } else if (auxQtd == 0 || auxQtd < 0) {
      System.out.println("Quantidade indisponível no estoque!");
    } else {
      // for (int i = 0; i < k; i++) {
      // if (quantidades[i] < quantidades[i + 1]) {
      // int contextAux = quantidades[i];
      // quantidades[i] = quantidades[i + 1];
      // quantidades[i + 1] = contextAux;
      // }
      // }

      Arrays.sort(quantidades, Collections.reverseOrder());

      System.out.println("Total vendido foi: R$" + venda);
    }
  }
}