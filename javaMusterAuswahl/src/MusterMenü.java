import java.util.Scanner;

public class MusterMenü {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int eingabe;
        System.out.println();

        do {
            
            System.out.println();
            System.out.println("Muster printen.");
            System.out.println();
            System.out.println("Für ein Viereck, drücke                    : 1");
            System.out.println("Für ein Dreieck linksbündig, drücke        : 2");
            System.out.println("Für einen Tannenbaum, drücke               : 3");
            System.out.println("Für einen Tannenbaum auf dem Kopf, drücke  : 4");
            System.out.println("Um das Programm zu verlassen drücke        : 0");
            System.out.println();
            eingabe = sc.nextInt();
            System.out.println();

            switch (eingabe) {
                case 1:
                    System.out.println("Viereck:");
                    System.err.println();                  
                    MusterInteraktiv1.viereck();
                    break;
                case 2:
                    System.out.println("Dreieck linksbündig:");
                    System.out.println();
                    MusterInteraktiv2.dreieckL();
                    break;
                case 3:
                    System.out.println("Tannenbaum:");
                    System.out.println();
                    MusterInteraktiv3.tannenbaum();
                    break;
                case 4:
                    System.out.println("Tannenbaum auf dem Kopf:");
                    System.out.println();
                    MusterInteraktiv4.tannenbaumKopf();
                    break;
                case 0:
                    System.out.println("Programm beendet.");
                    System.out.println();
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
         
        } while (eingabe != 0);

        sc.close();
    }
}
