package collections_set;

public class Principal {

    public static void main(String[] args) {
        Contato contato1 = new Contato("Maria", "maria@algaworks.com", 40);
        Contato contato2 = new Contato("José", "jose@algaworks.com", 30);
        Contato contato3 = new Contato("João", "joao@algaworks.com", 25);
        Contato contato4 = new Contato("João da Silva", "joao@algaworks.com", 80);

        System.out.println(contato1.hashCode());
        System.out.println(contato2.hashCode());
        System.out.println(contato3.hashCode());
        System.out.println(contato4.hashCode());

//        System.out.println(contato2.equals(contato3)); // false
//        System.out.println(contato2.hashCode() == contato3.hashCode()); /* vai retornar verdadeiro porque no hashcode tem a logica para comparar os emails */
    }
     	/* se o equals é igual, o hashcode tambem tem que ser igual, é uma boa pratica */
    	/* sempre implementa o hashcode usando como base  a mesma propriedade que usamos para implementar o metodo euquals */

}
