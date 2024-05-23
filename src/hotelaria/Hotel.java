package hotelaria;

import java.util.Objects;

public class Hotel implements Comparable<Hotel> { /* Atraves dessa interface transformamaos essa classe 'Comparavel '*/

    private String nome;
    private String cidade;
    private double precoDiaria;

    public Hotel(String nome, String cidade, double precoDiaria) {
        setNome(nome);
        setCidade(cidade);
        setPrecoDiaria(precoDiaria);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome);
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            throw new IllegalArgumentException("Preço da diária não pode ser negativo");
        }

        this.precoDiaria = precoDiaria;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nome='" + nome + '\'' +
                ", cidade='" + cidade + '\'' +
                ", precoDiaria=" + precoDiaria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        return nome != null ? nome.equals(hotel.nome) : hotel.nome == null;
    }

    @Override
    public int hashCode() {
        return nome != null ? nome.hashCode() : 0;
    }

    @Override
    public int compareTo(Hotel o) {
        return getNome().compareTo(o.getNome()); // 4 - opção (recomendada )

          // 3- opção
//        return Double.compare(getPrecoDiaria(), o.getPrecoDiaria());
          
          // 2- opção	
//        return Double.valueOf(getPrecoDiaria())
//                .compareTo(Double.valueOf(o.getPrecoDiaria()));

          // 1- opção	
//        if (this.getPrecoDiaria() < o.getPrecoDiaria()) {
//            return -1; /* a gente retorna negativo se esse objeto this for menor que o objeto do argumento */
//        } else if (this.getPrecoDiaria() > o.getPrecoDiaria()) {
//            return 1; /* se for retorna um numero positivo */
//        }
//        return 0;
    }

}