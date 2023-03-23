import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ESINEMISSAGEDUS {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage tekst: ");
        Map<String, Integer> kujutisena = new HashMap<>();
        while (sisse.hasNext()) {
            System.out.println(sisse.hasNext());
            String sisend = sisse.next();
            System.out.println(sisend);
            if (kujutisena.containsKey(sisend)) {
                kujutisena.replace(sisend, kujutisena.get(sisend) + 1);
            } else {
                kujutisena.put(sisend, 1);
            }
        }
        sisse.close();
        System.out.println(kujutisena);
    }
}
