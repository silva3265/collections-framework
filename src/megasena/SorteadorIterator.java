package megasena;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class SorteadorIterator implements Iterator<Integer> {

    private static final Random RANDOM = new Random(); /* Random é uma classe que poder obter numeros aleatorios, (sortear numeros) */
    private int quantidadeSorteada;

    @Override
    public boolean hasNext() {
        return quantidadeSorteada < 6;
    }

    @Override
    public Integer next() {
        if (!hasNext()) { /* se hasnext retornar false*/
            throw new NoSuchElementException("Todos os números já foram sorteados"); /* NoSuchElementException - nao existe mais elementos pra ser devolvidos */
        }

        quantidadeSorteada++;
        return RANDOM.nextInt(60); // vai retornar um numero de no maximo até 60
    }

}
