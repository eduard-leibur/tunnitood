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
        ArrayList<String> sihtkohad = new ArrayList<>();
        Scanner sisse = new Scanner(System.in);
        System.out.print("Mitu sisenejat? ");
        int mitu = sisse.nextInt();
        sisse.nextLine();
        if (mitu != 0) {
            for (int i = 0; i < mitu; i++) {
                System.out.print((i + 1) + ". reisija sihtkoht: ");
                String sihtkoht = sisse.next();
                sisse.nextLine();
                if (Objects.equals(sihtkoht, peatus)) {
                    System.out.println("Juba olete selles peatuses!");
                } else if (marsruut.contains(sihtkoht)) {
                    sihtkohad.add(sihtkoht);
                } else System.out.println("Sihtkoht pole marsruudil!");
            }
        }
        sisse.close();
        return sihtkohad;
    }
    public static void main(String[] args) {
        ArrayList<String> marsruut = new ArrayList<>();
        marsruut.add("Tartu");
        marsruut.add("Kooli");
        marsruut.add("Nõo");
        marsruut.add("Peedu");
        marsruut.add("Elva");

        ArrayList<String> sihtkohad = new ArrayList<>();

        for (String peatus: marsruut) {
            System.out.println("Peatus: " + peatus);
            sihtkohad = väljub(peatus, sihtkohad);
            sihtkohad.addAll(peale(peatus, marsruut));
            System.out.println("Reisijate sihtkohad: " + sihtkohad);
            System.out.println("Buss väjub...\n");
        }
    }
}
