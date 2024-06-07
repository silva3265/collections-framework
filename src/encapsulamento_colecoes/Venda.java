package encapsulamento_colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private final List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<ItemVenda> getItens() {
        return Collections.unmodifiableList(itens); /* vai retornar um coleção que permita somente leitura,  'unmodifiableList' - coleção nao modificavel   */
//        return new ArrayList<>(itens);
    }

    public void adicionarItem(ItemVenda item) {
        if (excedeLimiteDeCompra(item)) { /* se esse 'item passado no argumento exceder o limite de compra, lance a exceção'*/
            throw new LimiteDeCompraExcedidoException(
                    String.format("Limite atual: %.2f", cliente.getLimiteCompras()));
        }

        valorTotal += item.getValor();
        itens.add(item);
    }

    private boolean excedeLimiteDeCompra(ItemVenda item) {
        return valorTotal + item.getValor() > getCliente().getLimiteCompras();
    }

}
