package Controller;

public class Hotel {
  private Quarto[] quartos;
  private int countQuartos;

  public Hotel() {
    this.quartos = new Quarto[50];
    this.countQuartos = 0;
  }

  public Quarto[] getQuarto() {
    return this.quartos;
  }

  public void adicionarQuarto(Quarto quarto) {
    if (0 <= this.countQuartos && this.countQuartos < 51) {
      this.quartos[this.countQuartos] = quarto;
      this.countQuartos++;
    }
  }

  public void imprimirSituacaoDosQuartos() {
    for (int i = 0; i < countQuartos; i++) {
      System.out.print((i + 1) + " - " + quartos[i].getSit());

      if (quartos[i].getSit().toLowerCase().equals("alugado")
          || quartos[i].getSit().toLowerCase().equals("reservado")) {
        System.out.print(" - Quantidade de leitos: " + quartos[i].getQtdLeito());
        System.out.print(" - Preço do quarto: R$" + quartos[i].getPreco());
        System.out.print(" - Despesas: R$" + quartos[i].getDespesas());
        System.out.print(" - Data de entrada: " + quartos[i].getReserva().getDataEntrada());
        System.out.print(" - Data de saída: " + quartos[i].getReserva().getDataSaida());
        System.out.print(" - Número de diárias: " + quartos[i].getReserva().getQtdDiaria());
      }

      System.out.println();
    }
  }

  public void imprimirQuartosLivres() {
    for (int i = 0; i < countQuartos; i++) {
      if (quartos[i].getSit().toLowerCase().equals("livre"))
        System.out.println((i + 1) + " - " + quartos[i].getSit());
    }
  }

  public int getQtdQuartosCadastrados() {
    return this.countQuartos;
  }

  public void reservarQuarto(String dataEntrada, String dataSaida, Pessoa pessoa, int quarto, int qtdDiaria,
      String sit) {
    quartos[quarto - 1].setSit(sit);
    quartos[quarto - 1].setReserva(dataEntrada, dataSaida, pessoa, qtdDiaria);
  }
}
