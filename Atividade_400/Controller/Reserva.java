package Controller;

public class Reserva {
  private Pessoa pessoa;
  private int qtdDiaria;
  private String dataEntrada;
  private String dataSaida;

  public Reserva(String dataEntrada, String dataSaida, Pessoa pessoa, int qtdDiaria) {
    this.dataEntrada = dataEntrada;
    this.dataSaida = dataSaida;
    this.pessoa = pessoa;
    this.qtdDiaria = qtdDiaria;
  }

  public String getDataEntrada() {
    return this.dataEntrada;
  }

  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  public String getDataSaida() {
    return this.dataSaida;
  }

  public void setDataSaida(String dataSaida) {
    this.dataSaida = dataSaida;
  }

  public Pessoa getPessoa() {
    return this.pessoa;
  }

  public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;
  }

  public int getQtdDiaria() {
    return this.qtdDiaria;
  }

  public void setQtdDiaria(int qtdDiaria) {
    this.qtdDiaria = qtdDiaria;
  }
}
