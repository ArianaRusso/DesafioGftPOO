package exercicio7.model;


public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public Double bonificacao() {
        return salario + 10000.00;
    }
}
