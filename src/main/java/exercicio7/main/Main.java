package exercicio7.main;

import exercicio7.model.Gerente;
import exercicio7.model.Supervisor;
import exercicio7.model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Gerente gerente= new Gerente("Paulo",42, 5000.00);
        Supervisor supervisor = new Supervisor("Marcelo",50, 3000.00);
        Vendedor vendedor=new Vendedor("Gustavo", 25,1800.00);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
