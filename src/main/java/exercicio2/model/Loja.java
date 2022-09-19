package exercicio2.model;

import lombok.*;

import java.util.Iterator;
import java.util.List;


@Setter
@Getter
public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (livros.isEmpty()) {
            System.out.println(" A loja não tem livros no seu estoque");
        } else {
            System.out.println("A loja " + nome + " possui estes livros para venda: ");
            for (Livro livro : livros) {
                System.out.println(livro + " em estoque.");
            }

        }
    }

    public void listaVideoGames() {
        if (videoGames.isEmpty()) {
            System.out.println(" A loja não tem video-games no seu estoque.");
        } else {
            System.out.println("A loja" + nome + " possui estes video-games para venda: ");
            for (VideoGame videoGame : videoGames) {
                System.out.println(videoGame + " em estoque.");
            }
        }
    }

    public double calculaPatrimonio() {
        double patrimonio = 0d;


        Iterator<Livro> iteratorLivro = livros.iterator();
        while (iteratorLivro.hasNext()) {
            Livro livro = iteratorLivro.next();
            patrimonio += (livro.getQtd()) * (livro.getPreco());
        }

        Iterator<VideoGame> iteratorVideoGame = videoGames.iterator();
        while (iteratorVideoGame.hasNext()) {
            VideoGame videoGame = iteratorVideoGame.next();
            patrimonio += (videoGame.getQtd()) * (videoGame.getPreco());
        }

        System.out.println("O patrimonio da loja: " + nome + " é de R$ " + patrimonio);
        return patrimonio;
    }


}
