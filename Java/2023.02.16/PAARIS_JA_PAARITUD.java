import java.util.Scanner;

public class PAARIS_JA_PAARITUD {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage arvude rida (nt. 1, 2, 3, ...): ");
        String[] arvud_sõnedena = sisse.nextLine().split(", ");
        sisse.close();

        int[] arvud = new int[arvud_sõnedena.length];
        for (int i = 0; i < arvud_sõnedena.length; i++) {
            int arv = Integer.parseInt(arvud_sõnedena[i]);
            arvud[i] = arv;
        }

        int paaris = 0;
        int paaritut = 0;
        for (int arv: arvud) {
            if (arv % 2 == 0) {
                paaris++;
            } else paaritut++;
        }
        System.out.print("Paaris: " + paaris +
                "\nPaaritut: " + paaritut);
    }
}
