package exercicio7.model;

public abstract class Funcionario {

    protected String nome;
    protected int idade;
    protected Double salario;

    public abstract Double bonificacao();

    @Override
    public String toString() {
        return getClass().getSimpleName() +", " +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", bonificação= "+ bonificacao() +
                '}';
    }
}
