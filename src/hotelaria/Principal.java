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

//        cadastro.remover(new Hotel("Vila Selvagem", "Fortim/CE", 0));
//        cadastro.removerPorCidade("Fortim/CE");
//        cadastro.removerTodos();

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
//        hoteis.set(3, new Hotel("Teste", "Teste", 0)); /* hoteis.set - vai substituir aquela posição especifica */
//        hoteis.add(3, new Hotel("Teste", "Teste", 0));
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) { /* ArrayList - ele usa array internamente, a performace pode ser ruim */
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }
    /* é recomendado que as adições de novos elemntos sejam feitos no final, e nao substituir posições ja existentes */

}
