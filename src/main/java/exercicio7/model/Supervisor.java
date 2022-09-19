package exercicio7.model;

public class Supervisor extends Funcionario {

    public Supervisor(String nome, int idade, Double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    @Override
    public Double bonificacao() {
        return salario + 5000.00;
    }
}
