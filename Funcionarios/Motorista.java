package Funcionarios;
public class Motorista extends Pessoa {
  public String tipoCarteira;

  public Motorista(String nome, int idade, String tipoCarteira) {
    super(nome, idade);
    this.tipoCarteira = tipoCarteira;
  }

  public String getTipoCarteira() {
    return tipoCarteira;
  }

  public void setTipoCarteira(String tipoCarteira) {
    this.tipoCarteira = tipoCarteira;
  }
}
