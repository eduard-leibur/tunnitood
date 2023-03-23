import java.util.Scanner;

public class TEINE {
    public static void main(String[] args) {
        int arv;
        do {
            Scanner sisse = new Scanner(System.in);
            System.out.print("Sisestage täisarv: ");
            arv = sisse.nextInt();
            if (arv % 2 == 0 && arv != 0) {
                System.out.println("See on paarisarv.\n");
            } else if (arv != 0){
                System.out.println("See on paaritu arv.\n");
            }
        } while (arv != 0);
    }
}
