import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KLASSIKAASLASED {
    public static void main(String[] args) {
        List<String> õpilased = new ArrayList<>();
        õpilased.add("Tõnu");
        õpilased.add("Tiina");
        õpilased.add("Mari");
        õpilased.add("Malle");
        õpilased.add("Peeter");
        System.out.println("Klassis on: " + õpilased);

        Scanner sisse = new Scanner(System.in);
        System.out.print("Kes võiks veel klassis olla? ");
        String nimi_sisse = sisse.next();
        sisse.nextLine();
        if (õpilased.contains(nimi_sisse)) System.out.println("Tema juba on klassis.");
        else {
            õpilased.add(nimi_sisse);
            System.out.println(õpilased);
        }

        System.out.print("Kes ei peaks klassis olema? ");
        String nimi_välja = sisse.next();
        sisse.close();
        if (õpilased.contains(nimi_välja)) õpilased.remove(nimi_välja);
        else System.out.println("Tema ei kuulugi klassi.");

        System.out.println(õpilased);
        System.out.println("Õpilaste järjendis on " + õpilased.size() + " õpilast.");

        for (int i = 0; i < 3; i++) {
            int suvaline = (int) (Math.random() * õpilased.size());
            System.out.println(õpilased.get(suvaline));
        }
    }
}
