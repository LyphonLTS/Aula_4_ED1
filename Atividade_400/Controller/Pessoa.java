package Controller;

public class Pessoa {
  private String nome;
  private String contato;

  public Pessoa(String contato, String nome) {
    this.contato = contato;
    this.nome = nome;
  }

  public String getContato() {
    return this.contato;
  }

  public String getNome() {
    return this.nome;
  }
}
