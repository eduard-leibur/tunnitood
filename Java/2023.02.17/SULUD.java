import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SULUD {
    public static void main(String[] args) {
        Scanner sisse = new Scanner(System.in);
        String rida = sisse.next();
        sisse.close();

        String[] sulud = rida.split(" ");
        Deque<String> pinu = new ArrayDeque<>();
        int ümar, kant, loog;
        ümar = kant = loog = 0;
        for (String sulg: sulud) {
            pinu.push(sulg);
            switch (sulg) {
                case ")": ümar = ümar - 1;
                case "]": kant--;
                case "}": loog--;
                case "(": ümar++;
                case "[": kant++;
                case "{": loog++;
            }
        }
        System.out.println(ümar);
        if (ümar == 0 && kant == 0 && loog == 0) System.out.println("Kõik korras.");
        else System.out.println("Ei ole korras.");
    }
}
// pooleli