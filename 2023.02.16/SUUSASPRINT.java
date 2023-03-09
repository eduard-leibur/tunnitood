public class SUUSASPRINT {

    static int[] stardiaegadeGeneraator(int[] stardinumbrid) {
        int[] stardiajad = new int[stardinumbrid.length];
        for (int i = 0; i < stardinumbrid.length; i++) {
            stardiajad[i] = 15 * i;
        }
        return stardiajad;
    }

    static double[] läbimisaegadeGeneraator(int[] stardiajad, double[] stopperinäidud) {
        double[] läbimisajad = new double[stardiajad.length];
        for (int i = 0; i < stardiajad.length; i++) {
            if (stopperinäidud[i] == 0) {
                läbimisajad[i] = 0;
            } else {
                double läbimisaeg = stopperinäidud[i] - stardiajad[i];
                läbimisajad[i] = läbimisaeg;
            }
        }
        return läbimisajad;
    }

    static int võitjaTulemuseIndeks(double[] läbimisajad) {
        int vähimaIndeks = 0;
        for (int i = 0; i < läbimisajad.length; i++) {
            if (läbimisajad[i] < läbimisajad[vähimaIndeks] && läbimisajad[i] != 0) {
                vähimaIndeks = i;
                }
        }
        return vähimaIndeks;
    }

    static int katkestajaid(double[] stopperinäidud) {
        int katkestajaid = 0;
        for (double näit:stopperinäidud) {
            if (näit == 0) katkestajaid++;
        }
        return katkestajaid;
    }

    public static void main(String[] args) {
        int[] stardinumbrid = {3, 56, 8, 12, 5, 7};
        double[] stopperinäidud = {148.2, 150.4, 226.0, 231.9, 0.0, 0.0};

        int[] stardiajad = stardiaegadeGeneraator(stardinumbrid);
        double[] läbimisajad = läbimisaegadeGeneraator(stardiajad, stopperinäidud);
        int võitjaIndeks = võitjaTulemuseIndeks(läbimisajad);
        System.out.println("Võitis nr. " + stardinumbrid[võitjaIndeks] +
                "\nAjaga: " + läbimisajad[võitjaIndeks]);
        System.out.println("\nKatkestajaid oli " + katkestajaid(stopperinäidud) + " tk");
    }
}
