public class HelloWorld {
    public static void main(String[] args) {
        if (1 < 0) {
            System.out.println("jep");
        } else if (1 == 0) {
            System.out.println("jesh");
        } else {
            System.out.println("no ma ka ei tea");
        }
        for (int i = 0; i < 10; i++) { // for (eeltegevus, jätkamistingimus, järeltegevus)
            System.out.println(i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println(i ++);
        }
        do { // järelkontrolliga tsükkel
            // tsükli sisu
        } while (// jätkamistingimus)
    }
}
