package colecoes_imutaveis;

import java.util.Collections;
import java.util.List;

public class TesteEmptyList {

    public static void main(String[] args) {
        List<Integer> numeros = Collections.emptyList(); // Vai criar uma Lista Vazia
        numeros.add(3);

        System.out.println(numeros);
    }

}
