public class ESIMENE {
    public static void main(String[] args) {
        int summa = 0;
        for (int arv = 1; arv <= 5; arv++) {
            System.out.print(summa + " + " + arv + " = ");
            summa = summa + arv;
            System.out.println(summa);
        }
    }
}
