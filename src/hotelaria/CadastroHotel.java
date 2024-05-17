package hotelaria;

import java.util.ArrayList;

public class CadastroHotel {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
//        hoteis.add(0, hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();

        for (int i = 0; i < hoteis.size(); i++) { /* Vai percorrer cada hotel */
            Hotel hotel = hoteis.get(i); /* a variavel hotel vai receber 'hoteis.get(i)'*/
            if (hotel.getCidade().equals(cidade)) { /* comparação de objetos " equals "*/
                hoteisParaRemocao.add(hotel);
//                hoteis.remove(i); /* vai remover o indice que esta no (i)*/
//                i--;
            }
        }

        hoteis.removeAll(hoteisParaRemocao); // removeAll - remover todos 
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if (!removido) { // se Nao for removido lança uma exceção 
            throw new HotelNaoEncontradoException("Hotel não encontrado para remoção");
        }
    }

    public void removerTodos() {
        hoteis.clear(); // esse metodo clear vai limpar sua lista, vai remover todos os objetos da lista 
    }

}
