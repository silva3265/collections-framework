package megasena;

public class Principal {

	public static void main(String[] args) {
		Sorteador sorteador = new Sorteador();

		for (Integer i : sorteador) {
			System.out.println(i);
		}

//        Iterator<Integer> sorteadorIterator = sorteador.iterator();
//        while (sorteadorIterator.hasNext()) { /* ele faz o loop enquanto o hasnext retorna true, quando retorna false ele para o loop */
//            System.out.println(sorteadorIterator.next());
//        }
//        System.out.println(sorteadorIterator.next());
	}

}
