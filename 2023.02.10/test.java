import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Sisesta nädalapäev: ");
        String päev = sisse.next().toLowerCase();
        sisse.close();

        String treening = switch (päev) {
            case "esmaspäev" -> "Jääger";
            case "teisipäev" -> "Pull ja Nõo";
            default -> "Iga päev trennipäev";
        };
        System.out.println(treening);
    }
}
