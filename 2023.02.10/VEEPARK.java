import java.util.Arrays;

public class VEEPARK {
    static int juhuslik(int alumine, int ülemine) {
        return (int) (Math.random() * (ülemine - alumine) + alumine);
    }
    static int[] test(int laste_arv, int alumine_piir, int ülemine_piir) {
        int[] lapsed = new int[laste_arv];
        for (int i = 0; i < laste_arv; i++) {
            lapsed[i] = juhuslik(alumine_piir, ülemine_piir);
        }
        return lapsed;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(test(10, 105, 180)));
    }
}
