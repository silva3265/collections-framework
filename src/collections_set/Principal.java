package collections_set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {
        Set<Contato> contatos = new LinkedHashSet<>(); // Vai ordenar pela a ordem natural inserida, mais com a performace ruim
//        Set<Contato> contatos = new TreeSet<>(new IdadeContatoComparator());

        System.out.println("---");
        contatos.add(new Contato("Maria", "maria@algaworks.com", 40)); 
        contatos.add(new Contato("Ana", "ana@algaworks.com", 30));
        contatos.add(new Contato("José", "jose@algaworks.com", 25));
        contatos.add(new Contato("Rosa", "rosa@algaworks.com", 50));
        contatos.add(new Contato("João", "joao@algaworks.com", 70));
        System.out.println("---");

        contatos.add(null); // aceita apenas um valor nullo

        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

}
