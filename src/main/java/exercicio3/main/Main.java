package exercicio3.main;

import exercicio3.model.Guerreiro;
import exercicio3.model.Mago;
import exercicio3.model.Personagem;

public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Mago", 5, 100, 5.5f, 20, 50, 2);
        Guerreiro guerreiro = new Guerreiro("Guerreiro", 6, 120, 6.8f, 5, 54, 1);


        System.out.println(mago);
        mago.lvlUp();
        mago.attack();
        mago.aprenderMagia("fogo");
        System.out.println(mago);


        System.out.println(guerreiro);
        guerreiro.lvlUp();
        guerreiro.attack();
        guerreiro.aprenderHabilidade("resistência");
        System.out.println(guerreiro);

       int totalPersonagens= Personagem.totalPersonagem();

        System.out.println("Total de personagens criados: "+totalPersonagens);

    }
}
