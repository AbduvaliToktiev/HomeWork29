import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boing boing = new Boing(1, "Boing", "Military");
        System.out.println(boing.id + "\n" + boing.model + "\n" + boing.type);
        System.out.println();
        Tu154 tu154 = new Tu154(2, "Tu154", "Military");
        System.out.println(tu154.id + "\n" + tu154.model + "\n" + tu154.type);

        Flight[] flights = new Flight[2];
        flights[0] = boing;
        flights[1] = tu154;
        System.out.println(Arrays.toString(flights));
        
    }
}
