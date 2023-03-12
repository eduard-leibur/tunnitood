import java.util.Scanner;

public class NELJASS {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.print("Eesnimi: ");
        String eesnimi = sisse.next();
        sisse.nextLine();
        System.out.print("Kehamass: ");
        int kehamass = sisse.nextInt();
        sisse.nextLine();
        System.out.print("Pikkus: ");
        float pikkus = sisse.nextFloat();
        sisse.nextLine();
        sisse.close();

        float kehamassiindeks = (float) (kehamass / (Math.pow(pikkus, 2)));
        System.out.println(eesnimi + " kehamassiindeks: " + kehamassiindeks);

        if (kehamassiindeks < 18.6) {
            System.out.println("Hakka sööma!");
        } else if (kehamassiindeks > 18.6 && kehamassiindeks < 25.1) {
            System.out.println("Kõik normis!");
        } else if (kehamassiindeks > 25.1) {
            System.out.println("Toimumas on rasvumine!");
        } else System.out.println("Miski jäi segaseks!");
    }
}
