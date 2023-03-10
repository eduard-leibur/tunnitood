import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class BUSSILIIN {
    static String[] väljub(String peatus, ArrayList<String> sihtkohad) {
        int väljujaid = 0;
        for (String loetav_peatus: sihtkohad) {
            if (Objects.equals(loetav_peatus, peatus)) {
                väljujaid++;
                sihtkohad.remove(peatus);
            }
        }
        System.out.println("Väjub " + väljujaid + " inimest");

    }
}
