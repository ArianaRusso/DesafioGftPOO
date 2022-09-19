package exercicio7.model;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public Double bonificacao() {
        return salario + 3000.00;
    }
}
