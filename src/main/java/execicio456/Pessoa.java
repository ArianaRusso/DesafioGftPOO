package execicio456;

import lombok.AllArgsConstructor;

import lombok.Data;


@Data

@AllArgsConstructor
public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.getNome().compareToIgnoreCase(pessoa.getNome());
    }
}
