package execicio456;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1= new Pessoa("João", 15);
        Pessoa pessoa2= new Pessoa("Leandro", 21);
        Pessoa pessoa3= new Pessoa("Paulo", 17);
        Pessoa pessoa4= new Pessoa("Jessica", 18);


        List<Pessoa> listPessoas= new ArrayList<>();
        listPessoas.add(pessoa1);
        listPessoas.add(pessoa2);
        listPessoas.add(pessoa3);
        listPessoas.add(pessoa4);

        //exercicio 4
        listPessoas.sort(new ComparadorIdade());
        System.out.println(listPessoas.get(listPessoas.size()-1));

        //exercicio 5
        System.out.println("Quantidade de pessoas: "+ listPessoas.size());
        Iterator<Pessoa> iterator = listPessoas.iterator();
        while (iterator.hasNext()) {
            Pessoa next = iterator.next();
            if (next.getIdade() < 18) iterator.remove();
        }
        System.out.println("Quantidade de pessoas após exclusão: "+ listPessoas.size());

        //exercicio 6
        int idade = 0;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getNome() == "Jessica") {
                System.out.println("Jessica encontrada");
                idade = pessoa.getIdade();
            }
        }
        System.out.println("Idade: "+idade);
    }
}
