import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BUSSILIIN {
    static ArrayList<String> väljub(String peatus, ArrayList<String> sihtkohad) {
        int väljujaid = 0;
        Object[] array = sihtkohad.toArray();
        for (Object loetav_peatus: array) {
            if (Objects.equals(loetav_peatus, peatus)) {
                väljujaid++;
                sihtkohad.remove(peatus);
            }
        }
        System.out.println("Väjub " + väljujaid + " inimest");
        return sihtkohad;
    }
    static ArrayList<String> peale(String peatus, ArrayList<String> marsruut) {
        Scanner sisse = new Scanner(System.in);
        System.out.println("Mitu inimest? ");
        int inimesi = sisse.nextInt();
        sisse.nextLine();
        ArrayList<String> sihtkohad = new ArrayList<String>(inimesi);
        for (int i = 0; i <= inimesi; i++) {
            System.out.println(i + ". reisija sihtkoht: ");

        }
        sisse.close();

    }
    public static void main(String[] args) {
        ArrayList<String> sihtkohad = new ArrayList<>();
        sihtkohad.add("Kooli");
        sihtkohad.add("Nõo");
        sihtkohad.add("Kooli");
        sihtkohad.add("Tartu");
        sihtkohad.add("Meeri");

        System.out.println(väljub("Kooli", sihtkohad));
    }
}
