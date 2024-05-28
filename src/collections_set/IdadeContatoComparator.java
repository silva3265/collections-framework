package collections_set;

import java.util.Comparator;

public class IdadeContatoComparator implements Comparator<Contato> {

    @Override
    public int compare(Contato o1, Contato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade()); /* comparando a idade do primeiro objeto com o segundo */
    }

}
