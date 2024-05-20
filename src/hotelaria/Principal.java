package hotelaria;

import java.util.ArrayList;
import java.util.Iterator; /* Iterator é um componente que permite iterar em uma coleção de elementos, um por um */

public class Principal {

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.removerPorCidade("Fortim/CE");  

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        Iterator<Hotel> hotelIterator = hoteis.iterator(); /* hoteis.iterator() - vai buscar um objeto do tipo iterator */
        while (hotelIterator.hasNext()) { // hasNext() - siguinfica 'tem proximo?', ele retorna um boleano
            Hotel hotel = hotelIterator.next();
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
