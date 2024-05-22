package megasena;

import java.util.Iterator;

public class Sorteador implements Iterable<Integer> { /* vai implementar diretamente o Iterable */

    @Override
    public Iterator<Integer> iterator() { /* como estamos impementando uma interface temos que implementar os metodos */
        return new SorteadorIterator();
    }

}
