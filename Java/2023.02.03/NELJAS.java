public class NELJAS {
    public static void main(String[] args) {
        double arv = 1;
        double summa = 0;
        while (arv != 101) {
            System.out.println("Arv: " + arv);
            summa = summa + (arv / (arv + 2));
            arv += 2;
            System.out.println(summa);
        }
    }
}
