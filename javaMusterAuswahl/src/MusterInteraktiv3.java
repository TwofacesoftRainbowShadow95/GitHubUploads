import java.util.Scanner;

public class MusterInteraktiv3 {
    static void tannenbaum () {
        Scanner sc = new Scanner(System.in);


            System.out.print("Gib eine Zahl ein: ");
            int a = sc.nextInt();
            System.out.println();
            
        for (int reihe = 0; reihe <= a; reihe++) { 
            for (int space = a; reihe < space;) {
                    space -= 1;
                    System.out.print(" ");
                }
            for (int spalte = 0; spalte < reihe; ) {
                spalte ++;
                System.out.print("* ");
                }
            System.out.println();
        }
    }
}
