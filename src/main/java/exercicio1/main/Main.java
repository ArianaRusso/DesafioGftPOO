package exercicio1.main;

import exercicio1.model.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo= new Veiculo("Hunday","HB20","GFT8084", "Branca",
                500,false, 25, 0, 60.000);

        System.out.println(veiculo);

        veiculo.acelerar();
        System.out.println("Velocidade: " + veiculo.getVelocidade());
        veiculo.abastecer(25);
        System.out.println("Litros de combustível: "+veiculo.getLitrosCombustivel());
        veiculo.frear();
        System.out.println("Velocidade: "+ veiculo.getVelocidade());
        veiculo.pintar("preto");
        System.out.println("Cor: "+veiculo.getCor());
        veiculo.ligar();
        System.out.println("Ligado: "+veiculo.isLigado());
        veiculo.desligar();
        System.out.println("Ligado: "+veiculo.isLigado());
        veiculo.abastecer(50);


    }
}
