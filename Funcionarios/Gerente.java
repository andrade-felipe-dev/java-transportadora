package Funcionarios;
public class Gerente extends Secretaria {
  protected double quantidadeComissao;

  public Gerente(String nome, int idade, String usuario, String senha, double saldo, double comissao) {
    super(nome, idade, usuario, senha, saldo);
    this.quantidadeComissao = comissao;
  }

  public double lancarComissao(Caixa caixa) {
    return caixa.saldo * (quantidadeComissao / 100);
  }
  
  @Override
  public double lancarFrete(Caixa caixa, double valorFrete) {
    return caixa.saldo + valorFrete;
  }

  @Override
  public double lancarDespesa(Caixa caixa, double valorDespesa) {
    return caixa.saldo - valorDespesa;
  }
  
}
