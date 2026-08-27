import java.util.Scanner;

public class MusterInteraktiv2 {
    static void dreieckL () {
        Scanner sc = new Scanner(System.in);

            System.out.print("Gib eine Zahl ein: ");
            int a = sc.nextInt();
            System.out.println();

        for (int reihe = 0; reihe < a; reihe++) {

            for (int spalte = 0; spalte < reihe + 1;) {
                spalte ++;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
