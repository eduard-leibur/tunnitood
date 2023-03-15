import java.util.*;

public class NEGATIIVSED_ARVUD_MAATRIKSIS {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        System.out.println("Sisestake arvuread");
        int[][] maatriks = new int[4][];
        for (int i = 0; i < 4; i++) {
            String[] rida_stringina = sisse.nextLine().split(" ");
            List<Integer> loend = new ArrayList<>();
            for (String s : rida_stringina) {
                int arvuna = Integer.parseInt(s);
                loend.add(arvuna);
            }
            loend.sort(Comparator.naturalOrder());
            int[] massiiv = new int[loend.size()];
            for (int j = 0; j < loend.size(); j++) {
                if (loend.contains(massiiv[j])) System.out.println("Arvud korduvad reas.");
                massiiv[j] = loend.get(j);
            }
            maatriks[i] = massiiv;
        }
        System.out.println(Arrays.deepToString(maatriks));
    }
}
// pisut perses, pole lõpuni