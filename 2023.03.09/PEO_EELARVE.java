import java.util.Scanner;

public class PEO_EELARVE {
    static int eelarve(int külalisi) {
        return külalisi * 10 + 55;
    }
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Mitu külalist on kutsutud? ");
        int mitu = sisse.nextInt();
        sisse.nextLine();
        System.out.println("Informatsioon külaliste kohta: ");
        String[] info = sisse.nextLine().split(", ");
        sisse.close();
        // ? Anna, + Peeter, + Ülle, ? Eva, ? Juhan, + Maria, + Epp

        int tulemas = 0;
        for (String inimene: info) {
            if (inimene.startsWith("+")) tulemas++;
        }

        System.out.println("\nKutsutud on " + mitu + " inimest\n" +
                tulemas + " inimest tuleb\n" +
                "Maksimaalne eelarve: " + eelarve(mitu) +
                "\nMinimaalne eelarve: " + eelarve(tulemas));
    }
}
