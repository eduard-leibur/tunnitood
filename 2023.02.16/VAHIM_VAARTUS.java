public class VAHIM_VAARTUS {
    public static void main(String[] args) {
        int[] arvude_massiiv = {3, 4, 18, 20, 11, 2};
        int vahim_element = arvude_massiiv[0];
        for (int arv:arvude_massiiv) {
            if (arv < vahim_element) vahim_element = arv;
        }
        System.out.print("Massiivi vähim väärtus on " + vahim_element);
    }
}
