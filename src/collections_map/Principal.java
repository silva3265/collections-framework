package collections_map;

import java.util.*;

public class Principal {

    public static void main(String[] args) {
    	
    	/* Proprietario */
        Proprietario maria = new Proprietario("Maria", "05577788899");
        Proprietario ana = new Proprietario("Ana", "33344488811");
        Proprietario jose = new Proprietario("José", "09988877766");
        Proprietario joao = new Proprietario("João", "22233344455");

        /* Carro */
        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

        //HashMap<> - é o mais usado, mais nao garante a ordem das chaves
        Map<Carro, Proprietario> proprietarios = new HashMap<>(); //Map<k, V>, chave, valor
//        Map<Carro, Proprietario> proprietarios = new Hashtable<>(); /* Hashtable - ele nao permite nem valor e nem chave nula */
        proprietarios.put(bmw, maria); //put (colocar) - para adicionar 
        proprietarios.put(honda, ana);
        proprietarios.put(ford, jose);
        proprietarios.put(porsche, maria);

        // Substituição de valor para uma chave 
        proprietarios.put(porsche, jose); /* se o valor for diferente ele nao vai duplicar, ele vai substituir */

        // Remoção de entrada atraves da chave
//        proprietarios.remove(new Carro("JAV5A67", "XXXX")); // vai remover

        // Adição de chave nula (HashMap permite, Hashtable não)
//        proprietarios.put(null, joao);
//        proprietarios.put(null, jose);

        // Adição de valor nulo (HashMap permite, Hashtable n�o)
//        proprietarios.put(porsche, null);
//        proprietarios.put(ford, null);

        // Impressão dos dados do mapa
//        System.out.println(proprietarios);

        // Obtenção de valor pela chave
//        System.out.println(proprietarios.get(new Carro("JAV5A67", "XXXX")));
//        System.out.println(proprietarios.get(new Carro("XXX5A67", "XXXX")));

        // Iteração nas chaves
//        Set<Carro> chaves = proprietarios.keySet(); /* keySet - ele retorna um Set (conjunto)*/
//        for (Carro carro : chaves) { // atribuimos o retorno na variavel 'chaves' do tipo set
//            System.out.println(carro);
//        }

        // Iteração nas chaves
//        for (Carro carro : proprietarios.keySet()) { // podemos fazer direto sem armazenalos numa variavel
//            System.out.println(carro);
//        }

        // Iteração nos valores
//        Collection<Proprietario> proprietariosCollection = proprietarios.values();
//        for (Proprietario proprietario : proprietariosCollection) {
//
//        }

        // Iteração nos valores
//        for (Proprietario proprietario : proprietarios.values()) { /* esse metodo values a gente usa pra percorrer somente os valores */
//            System.out.println(proprietario);
//        }

        // Iteração nas chaves para depois obter os valores
//        for (Carro carro : proprietarios.keySet()) {
//            Proprietario proprietario = proprietarios.get(carro); /* pra cada carro, vai buscar o par de chave, valor*/
//            System.out.printf("%s (%s) = %s%n", carro.getPlaca(), carro.getModelo(),
//                    proprietario.getNome());
//        }

        // Iteração nas entradas (pares de chave/valor)
//        for (Map.Entry<Carro, Proprietario> entry : proprietarios.entrySet()) { /* Entry - ele esta fazendo a iteração dos pares e depois pegamos os valores)*/
//            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
//                    entry.getKey().getModelo(), entry.getValue().getNome());
//        }

        // Iteração nas entradas (pares de chave/valor)
        for (var entry : proprietarios.entrySet()) { /* nesse lugar do 'var' esta substituindo o 'Map.Entry' */
            System.out.printf("%s (%s) = %s%n", entry.getKey().getPlaca(),
                    entry.getKey().getModelo(), entry.getValue().getNome());
        }
    }

}