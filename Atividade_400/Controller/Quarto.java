package Controller;

public class Quarto {
  private int qtdLeito;
  private double preco;
  private double despesas;
  private String sit;
  private Reserva reserva;

  public Quarto(int qtdLeito, double preco, String sit) {
    this.reserva = null;
    this.preco = preco;
    this.qtdLeito = qtdLeito;
    this.sit = sit;
    this.despesas = 0;
  }

  public Reserva getReserva() {
    return this.reserva;
  }

  public void setReserva(String dataEntrada, String dataSaida, Pessoa pessoa, int qtdDiaria) {
    this.reserva = new Reserva(dataEntrada, dataSaida, pessoa, qtdDiaria);
  }

  public double getDespesas() {
    return this.despesas;
  }

  public void addDespesas(double despesas) {
    this.despesas += despesas;
  }

  public void rmvDespesas(double despesas) {
    this.despesas -= despesas;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQtdLeito() {
    return this.qtdLeito;
  }

  public String getSit() {
    return this.sit;
  }

  public void setSit(String sit) {
    this.sit = sit;
  }

  public double getValorAPagar() {
    return this.preco + this.despesas;
  }
}
