import java.util.Scanner;

import Controller.Hotel;
import Controller.Pessoa;
import Controller.Quarto;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Hotel hotel = new Hotel();
    int op = 0;
    boolean isToContinue = true;

    do {
      System.out.println("\t\t## Hotel Fazenda Sucesso ##");
      System.out.println("1 - Cadastrar quartos");
      System.out.println("2 - Listar todos os quartos");
      System.out.println("3 - Listar quartos desocupados");
      System.out.println("4 - Alugar/reservar quarto");
      System.out.println("5 - Adicionar despesas extras");
      System.out.println("6 - Calcular despesas do quarto");
      System.out.println("7 - Sair");
      op = Integer.parseInt(scanner.nextLine());

      switch (op) {
        case 1:
          System.out.println("\t\t## Cadastro de quartos ##");

          System.out.print("Qual a quantidade de leitos? ");
          int qtdLeito = Integer.parseInt(scanner.nextLine());

          System.out.print("Qual o preço do quarto? R$");
          int preco = Integer.parseInt(scanner.nextLine());

          hotel.adicionarQuarto(new Quarto(qtdLeito, preco, "livre"));
          break;
        case 2:
          System.out.println("\t\t## Lista de quartos ##");

          if (hotel.getQtdQuartosCadastrados() == 0) {
            System.out.println("Atenção, nenhum quarto cadastrado!");
          } else {
            hotel.imprimirSituacaoDosQuartos();
          }
          break;

        case 3:
          System.out.println("\t\t## Lista de quartos livres ##");

          if (hotel.getQtdQuartosCadastrados() == 0) {
            System.out.println("Atenção, nenhum quarto cadastrado!");
          } else {
            hotel.imprimirQuartosLivres();
          }
          break;

        case 4:
          System.out.println("\t\t## Aluguel/Reserva de quarto ##");

          if (hotel.getQtdQuartosCadastrados() == 0) {
            System.out.println("Atenção, nenhum quarto cadastrado!");
          } else {
            System.out.print("Qual o seu nome? ");
            String nome = scanner.nextLine();

            System.out.print("Qual o seu contato? ");
            String contato = scanner.nextLine();

            System.out.println("Você deseja: ");
            System.out.println("1 - Alugar");
            System.out.println("2 - Reservar");
            op = Integer.parseInt(scanner.nextLine());

            System.out.print("Qual a data de entrada(dd/mm/yy)? ");
            String dataEntrada = scanner.nextLine();

            System.out.print("Qual a data de saída(dd/mm/yy)? ");
            String dataSaida = scanner.nextLine();

            System.out.println("Qual dos quartos a seguir você deseja? ");
            hotel.imprimirQuartosLivres();
            int quarto = Integer.parseInt(scanner.nextLine());

            System.out.print("Quantos dias deseja ficar? ");
            int qtdDiaria = Integer.parseInt(scanner.nextLine());

            switch (op) {
              case 1:
                if (0 <= quarto && quarto <= 50) {
                  hotel.reservarQuarto(dataEntrada, dataSaida, new Pessoa(contato, nome), quarto, qtdDiaria, "alugado");
                } else {
                  System.out.println("Por favor, selecione um quarto válido!");
                }
                break;

              case 2:
                if (0 <= quarto && quarto <= 50) {
                  hotel.reservarQuarto(dataEntrada, dataSaida, new Pessoa(contato, nome), quarto, qtdDiaria,
                      "reservado");
                } else {
                  System.out.println("Por favor, selecione um quarto válido!");
                }
                break;

              default:
                System.out.println("Por favor, digite o valor da opção válida!");
                break;
            }
          }

          break;

        case 5:
          System.out.println("\t\t## Cadastrar despesas extras ##");

          if (hotel.getQtdQuartosCadastrados() == 0) {
            System.out.println("Atenção, nenhum quarto cadastrado!");
          } else {
            System.out.print("Digite o número do seu quarto: ");
            int quarto = Integer.parseInt(scanner.nextLine());

            if (!hotel.getQuarto()[quarto - 1].getSit().toLowerCase().equals("livre")) {
              System.out.print("Digite o valor gasto: R$");
              double despesas = Double.parseDouble(scanner.nextLine());

              hotel.getQuarto()[quarto - 1].addDespesas(despesas);
            } else {
              System.out
                  .println("O quarto selecionado não está alugado/reservado, portanto não há despesas relacionadas!");
            }
          }
          break;

        case 6:
          System.out.println("\t\t## Calcular despesas ##");

          if (hotel.getQtdQuartosCadastrados() == 0) {
            System.out.println("Atenção, nenhum quarto cadastrado!");
          } else {
            System.out.println("Digite o número do seu quarto: ");
            int quarto = Integer.parseInt(scanner.nextLine());

            if (!hotel.getQuarto()[quarto - 1].getSit().toLowerCase().equals("livre")) {
              System.out.println("Valor total das despesas: R$" + hotel.getQuarto()[quarto - 1].getValorAPagar());
            } else {
              System.out
                  .println("O quarto selecionado não está alugado/reservado, portanto não há despesas relacionadas!");
            }
          }
          break;

        default:
          break;
      }

      if (op == 7)
        isToContinue = false;

      System.out.println();

    } while (isToContinue);

    scanner.close();
  }
}