package hotelaria;

import java.util.Comparator;
/* Comparador de pre�o hotel */
public class PrecoHotelComparator implements Comparator<Hotel> {

    @Override
    public int compare(Hotel o1, Hotel o2) {
        return Double.compare(o1.getPrecoDiaria(), o2.getPrecoDiaria());
    }

}
