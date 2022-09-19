package exercicio2.model;

import exercicio2.interfaces.Imposto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    @Override
    public double calcularImposto() {
        if (isUsado) {
            System.out.println("Imposto " + super.getNome() + " " + modelo + " " + "usado, R$ " + super.getPreco() * 0.25);
            return super.getPreco() * 0.25;
        } else {
            System.out.println("Imposto " + super.getNome() + " " + modelo + " R$ " + super.getPreco() * 0.45);
            return super.getPreco() * 0.45;
        }
    }

    @Override
    public String toString() {
        return
                "Video-game: " + modelo +
                        ", preço: " + super.getPreco() +
                        ", quantidade: " + super.getQtd();

    }
}
