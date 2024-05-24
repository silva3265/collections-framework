package collections_set;

import java.util.HashSet;
import java.util.Set;

public class Principal {

    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>(); // HashSet - ela nao garante a ordem de inserção, melhora a performace
        numeros.add(100);
        numeros.add(10);
        //numeros.add(10); // elementos duplicados nao são adicionados no mesmo conjunto
        numeros.add(200);
        numeros.add(3);
        System.out.println(numeros.add(5)); //true
        System.out.println(numeros.add(5)); //false
        numeros.add(null); // Hashset permite adcionar null
        numeros.add(null); // nao permite adcionar outro null

        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }

}
