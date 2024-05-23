package hotelaria;

public class Principal2 {

    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);
        Hotel hotel2 = new Hotel("Vila Selvagem", "Fortim/CE", 1500);

        System.out.println(hotel1.compareTo(hotel2)); /* comparando a instancia do 'hotel1' com o 'hotel2' */
    }
   

}
