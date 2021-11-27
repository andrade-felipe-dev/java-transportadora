package Viagem;

public class Veiculo {
  private String placa;
  private String marca;
  private String modelo;

  public Veiculo(String placa, String marca, String modelo) {
    this.placa = placa;
    this.marca = marca;
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }
  public String getModelo() {
    return modelo;
  }
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public void consultarCadastro() {
    System.out.println("Placa:" + this.placa + "\n Marca: " + this.placa + "\n Modelo: " + this.modelo);
  }
}
