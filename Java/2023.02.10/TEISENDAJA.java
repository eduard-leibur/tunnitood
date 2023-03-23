import java.util.Scanner;

public class TEISENDAJA {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage temperatuur: ");
        String sisend = sisse.next();
        sisse.close();

        if (sisend.contains("F")) {
            String ilma = sisend.replace("F", "");
            double arvuna = Double.parseDouble(ilma);
            System.out.println(sisend + " on " + ((arvuna - 32) / 1.8));
        } else {
            double arvuna = Double.parseDouble(sisend);
            System.out.println(sisend + " on " + ((1.8 * arvuna) + 32) + "F");
        }
        // vaja erandid lisada
    }
}
