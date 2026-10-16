import java.util.ArrayList;
import java.util.Scanner;

public class personeneingabe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> personen = new ArrayList<>();

        System.out.print("Wie viele Personen sollen eingetragen werden? ");
        int personenAnzahl = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < personenAnzahl; i++) {
            System.out.println("Gib einen Namen ein:");
            personen.add(sc.nextLine());
        }

        System.out.println();

        for (String person : personen) {
            System.out.print(person + ", ");
        }

        sc.close();
    }
}
