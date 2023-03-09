import java.util.Scanner;

public class LÜHENDAJA {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage sõne: ");
        String sõne = sisse.next();
        sisse.close();

        byte pikkus = (byte) (sõne.length() / 2);
        String uus_sõne = sõne.substring(0, pikkus);
        System.out.println(uus_sõne);
        }
    }
