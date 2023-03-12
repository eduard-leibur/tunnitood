public class KOLMAS {
    static int meetod(int I_arv, int II_arv) {
        return I_arv + II_arv;
    }
    static int meetod(double arv) {
        double korrutis = arv * arv;
        return (int) Math.round(korrutis);
    }
    static void meetod(String sõne, int arv) {
        for (int i = 0; i < arv; i++) {
            System.out.println(sõne);
        }
    }

    public static void main(String[] args) {
        System.out.println(meetod(1, 1));
        System.out.println(meetod(4.6452345));
        meetod("päike", 13);
    }
}
