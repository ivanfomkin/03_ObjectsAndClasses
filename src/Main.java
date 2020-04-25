import com.skillbox.airport.Airport;

public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        int aircaftsCount = airport.getAllAircrafts().size();
        System.out.println("Airport have " + aircaftsCount + " aircrafts");
    }
}
