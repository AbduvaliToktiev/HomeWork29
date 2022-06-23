import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AirportManagement implements Management {
    ArrayList<Flight> flights = new ArrayList<>();
    Tu154 tu154 = new Tu154(1, "Tu154", "Military");
    Boing boing = new Boing(2, "Boing", "Passenger");

    public ArrayList<Flight> flights() {
        flights.add(tu154);
        flights.add(boing);
        System.out.println(flights);
        return flights;
    }


    @Override
    public String[] allFlight() {
        String[] reis = new String[4];
        reis[0] = "Бишкек - Москва";
        reis[1] = "Москва - Турция";
        reis[2] = "Нур-Султан - Ташкент";
        reis[3] = "Ташкент - Нью-Йорк";
        System.out.println(Arrays.toString(reis));
        return reis;
    }

    @Override
    public String type() {
        String[] reis = new String[4];
        reis[0] = "Бишкек - Москва";
        reis[1] = "Москва - Турция";
        reis[2] = "Нур-Султан - Ташкент";
        reis[3] = "Ташкент - Нью-Йорк";
        Scanner sc = new Scanner(System.in);
        System.out.println("Список рейсов:");
        allFlight();
        System.out.println("Введите тип самолёта: " + boing.type + ", " + tu154.type);
        String search = sc.nextLine();
        switch (search) {
            case "Passenger":
                System.out.println(reis[0] + ", " + reis[2]);
                break;
            case "Military":
                System.out.println(reis[1] + ", " + reis[3]);
                break;
            default:
        }
        return null;
    }
}
