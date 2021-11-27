package Viagem;

public class Viagem {
  public Veiculo veiculo;
  public Endereco endereco;
  public double valor;

  public Viagem(Veiculo veiculo, Endereco endereco, double valor) {
    this.veiculo = veiculo;
    this.endereco = endereco;
    this.valor = valor;
  }

  public void entregarCarga() {
    System.out.println("realizou a entrega");
  }

  public void realizarColeta() {
    System.out.println("realizar a cola");
  }

}
