package Funcionarios;
public class Secretaria extends Pessoa {
  private String usuario;
  private String senha;
  

  public Secretaria(String nome, int idade, String usuario, String senha, double saldo) {
    super(nome, idade);
    this.usuario = usuario;
    this.senha = senha;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public double lancarDespesa(Caixa caixa, double valorDespesa) {
    return caixa.saldo - valorDespesa;
  }

  public double lancarFrete(Caixa caixa, double valorFrete) {
    return caixa.saldo + valorFrete;
  }

}
