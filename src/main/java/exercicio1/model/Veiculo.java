package exercicio1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public void acelerar() {
        this.velocidade = this.velocidade + 20;
    }

    public int abastecer(int combustivel) {
        if (this.litrosCombustivel + combustivel > 60) {
            System.out.println("Limite do tanque atingido. ");
        } else {
            this.litrosCombustivel = this.litrosCombustivel + combustivel;
        }
        return this.litrosCombustivel;
    }

    public int frear() {
        if (this.velocidade > 0) this.velocidade = this.velocidade - 20;
        return this.velocidade;
    }

    public String pintar(String cor) {
        this.cor = cor;
        return this.cor;
    }

    public void ligar() {
        if (!this.isLigado) this.isLigado = true;
    }

    public void desligar() {
        if (this.isLigado) this.isLigado = false;
    }

}
