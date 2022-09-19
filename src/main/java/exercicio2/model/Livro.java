package exercicio2.model;

import exercicio2.interfaces.Imposto;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter

public class Livro extends Produto implements Imposto {

    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    @Override
    public double calcularImposto() {
        if (tema.equals("educativo")) {
            System.out.println("Livro educativo não tem imposto: " + super.getNome());
            return 0;
        } else {
            System.out.println("R$" + super.getPreco() * 0.1 + " de imposto sobre o livro " + super.getNome());
            return super.getPreco() * 0.1;
        }
    }

    @Override
    public String toString() {
        return
                "Titulo: '" + super.getNome() +
                        "preço: '" + super.getPreco() +
                        "quantidade: '" + super.getQtd();
    }
}
