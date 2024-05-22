package ordenacao_natural;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(8);
        numeros.add(30);
        numeros.add(1);

//        Collections.sort(numeros); /* Ele vai Ordenar para a ordem natural, (1,8,10,30) */
        Collections.sort(numeros, Comparator.reverseOrder()); /* esse 'reverseorde' ele vai ordenar do maior pro Menor */

        System.out.println(numeros);
    }

}
