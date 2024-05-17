package hotelaria;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        CadastroHotel cadastro = new CadastroHotel();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

//        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400); // se cadastrar esse hotel vai lançar a exceção

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
//        int indice = hoteis.indexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0)); indexOf - se ele encontar ele vai retornar um indice
        int indice = hoteis.lastIndexOf(new Hotel("Vila Selvagem", "Fortim/CE", 0)); /* lastIndexOf - faz a pesquisa do indice, mais começando do final */
        System.out.println(indice);

//        System.out.println(hoteis.get(indice));

//        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
