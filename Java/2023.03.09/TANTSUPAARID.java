import java.util.Arrays;

public class TANTSUPAARID {
    public static void main(String[] args) {
        int[] poisid = {180, 175, 200, 172, 169, 183, 188};
        int[] tüdrukud = {165, 167, 172, 169, 162};

        java.util.Arrays.sort(poisid);
        java.util.Arrays.sort(tüdrukud);

        int vähem = 0;
        if (poisid.length > tüdrukud.length) {
            vähem = tüdrukud.length;
        } else if (tüdrukud.length > poisid.length) {
            vähem = poisid.length;
        } else System.out.println("viga võrdlemisel");

        int[][] paarid = new int[vähem][2];
        for (int i = 0; i < vähem; i++) {
            int[] paar = {poisid[i], tüdrukud[i]};
            paarid[i] = paar;
        }

        System.out.println("Paarid on:");
        for (int[] paar: paarid) {
            System.out.print(Arrays.toString(paar) + " ");
        }
        System.out.println("\nPaariliseta jäid:");
        if (poisid.length > tüdrukud.length) {
            for (int i = 1; i < poisid.length - tüdrukud.length + 1; i++) {
                System.out.print(poisid[poisid.length - i] + ", ");
            }
        }
    }
}
