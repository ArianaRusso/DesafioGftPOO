package exercicio3.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor

public abstract class Personagem {

    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;
    static int qtdPersonagem;

    public abstract void lvlUp();

    public static int totalPersonagem() {
        return qtdPersonagem;
    }
}
