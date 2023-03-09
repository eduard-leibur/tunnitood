import java.util.Scanner;



public class PULSS {
    private static void pulsid(short max, byte treening) {
        if (treening == 1) {
            short vähim = (short) (max * 0.5);
            short suurim = (short) (max * 0.7);
            System.out.println("Soovitatav puslisagedus: " + vähim + "-" + suurim);
        } else if (treening == 2) {
            short vähim = (short) (max * 0.7);
            short suurim = (short) (max * 0.8);
            System.out.println("Soovitatav puslisagedus: " + vähim + "-" + suurim);
        } else if (treening == 3) {
            short vähim = (short) (max * 0.8);
            short suurim = (short) (max * 0.87);
            System.out.println("Soovitatav puslisagedus: " + vähim + "-" + suurim);
        } else {
            System.out.println("Viga treeningtüübi sisestamisel.");
        }
    }


    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Vanus: ");
        byte vanus = sisse.nextByte();
        System.out.print("Sugu: ");
        String sugu = sisse.next();
        System.out.print("Treeningu tüüp: ");
        byte treening = sisse.nextByte();
        sisse.close();

        if (sugu.toLowerCase().contains("m")) {
            short max = (short) (220 - vanus);
            pulsid(max, treening);
        } else if (sugu.toLowerCase().contains("n")) {
            short max = (short) (206 - (vanus * 0.88));
            pulsid(max, treening);
        } else {
            System.out.println("Viga soo sisestamisel.");
        }
    }
}
