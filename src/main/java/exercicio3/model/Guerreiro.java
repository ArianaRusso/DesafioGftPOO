package exercicio3.model;

import lombok.Getter;
import lombok.Setter;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter
public class Guerreiro extends Personagem {

    private List<String> habilidades = new ArrayList<>();


    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        qtdPersonagem++;
    }


    public void lvlUp() {
        setLevel(getLevel() + 1);
        setVida(getVida() + 1);
        setForca(getForca() + 1);

    }

    public int attack() {
        Random gerador = new Random();
        int attack = (getForca() * getLevel()) + (gerador.nextInt(301));
        System.out.println("Attack: " + attack);

        return attack;

    }

    public void aprenderHabilidade(String habilidade) {
        habilidades.add(habilidade);
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome='" + super.getNome() + '\'' +
                ", vida=" + super.getVida() +
                ", mana=" + super.getMana() +
                ", xp=" + super.getXp() +
                ", inteligencia=" + super.getInteligencia() +
                ", forca=" + super.getForca() +
                ", level=" + super.getLevel() +
                ", habilidades=" + habilidades +
                '}';
    }
}


