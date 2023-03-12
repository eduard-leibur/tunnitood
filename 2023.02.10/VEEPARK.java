public class VEEPARK {

    static int juhuslik(int alumine, int ülemine) {
        return (int) (Math.random() * (ülemine - alumine) + alumine);
    }

    static int[] lapsed(int laste_arv, int alumine_piir, int ülemine_piir) {
        int[] lapsed = new int[laste_arv];
        for (int i = 0; i < laste_arv; i++) {
            lapsed[i] = juhuslik(alumine_piir, ülemine_piir);
        }
        return lapsed;
    }

    static float harmooniline_keskmine(int[] pikkused) { // harmooniline keskmine on arvude pöördväärtuste aritmeetilise keskmise pöördväärtus
        double summa = 0;
        for (double pikkus: pikkused) summa += (1 / pikkus);
        return (float) (pikkused.length / summa);
    }

    public static void main(String[] args) {
        int[] väiksemad = lapsed(10, 60, 100);
        int[] keskmised = lapsed(15, 101, 140);
        int[] suured = lapsed(20, 141, 200);

        System.out.println("Väiksemad lapsed:");
        for (int laps: väiksemad) {
            System.out.print(laps + ", ");
        }
        System.out.print("\nÜle 80cm: ");
        for (int laps: väiksemad) {
            if (laps > 80) {
                System.out.print(laps + ", ");
            }
        }

        System.out.println("\n\nKeskmised lapsed:");
        for (int laps: keskmised) {
            System.out.print(laps + ", ");
        }
        System.out.println("\nKeskmiste keskmine: " + harmooniline_keskmine(keskmised));

        System.out.println("\n\nSuuremad lapsed:");
        for (int laps: suured) {
            System.out.print(laps + ", ");
        }
    }
}
