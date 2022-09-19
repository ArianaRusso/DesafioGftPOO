package exercicio3.model;


import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter

public class Mago extends Personagem {

    private List<String> magias = new ArrayList<>();

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        qtdPersonagem++;
    }

    public void lvlUp() {
        setLevel(getLevel() + 1);
        setMana(getMana() + 1);
        setInteligencia(getInteligencia() + 1);
    }

    public int attack() {
        Random gerador = new Random();
        int attack = (getInteligencia() * getLevel()) + (gerador.nextInt(301));
        System.out.println("Attack: " + attack);
        return attack;
    }

    public void aprenderMagia(String magia) {
        this.magias.add(magia);
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nome='" + super.getNome() + '\'' +
                ", vida=" + super.getVida() +
                ", mana=" + super.getMana() +
                ", xp=" + super.getXp() +
                ", inteligencia=" + super.getInteligencia() +
                ", forca=" + super.getForca() +
                ", level=" + super.getLevel() +
                ", magias=" + magias +
                '}';
    }
}
