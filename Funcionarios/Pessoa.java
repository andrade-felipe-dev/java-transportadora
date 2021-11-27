package Funcionarios;

import Viagem.Endereco;

/**
 * Pessoa
 */
abstract class Pessoa {
  private String nome;
  private int idade;
  public Endereco endereco;
  
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
}