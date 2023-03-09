import java.util.Scanner;

public class NÄDALAPÄEV {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisestage päev: ");
        String päev = sisse.next();
        sisse.close();

        String päev_string = switch (päev) {
            case "1" -> "Esmaspäev";
            case "2" -> "Teisipäev";
            case "3" -> "Kolmapäev";
            case "4" -> "Neljapäev";
            case "5" -> "Reede";
            case "6" -> "Laupäev";
            case "7" -> "Pühapäev";
            default -> "Vigane";
        };
        System.out.println(päev_string);
    }
}
