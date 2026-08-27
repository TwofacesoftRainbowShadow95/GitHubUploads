import java.util.Scanner;

public class MusterInteraktiv1 {
    static void viereck () {
            Scanner sc = new Scanner(System.in);

            System.out.print("Gib die Reihenanzahl ein: ");
            int a = sc.nextInt();
            System.out.println();
            
            System.out.print("Gib die Spaltenanzahl ein: ");
            int b = sc.nextInt();
            System.out.println();

            for (int reihe = 0; reihe < a; reihe++) {

                for (int spalte = 0; spalte < b; spalte++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
