import java.util.Scanner;

public class eingabe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Yasmina";

        System.out.println("Hallo " + name);
        System.out.print("Wie alt bist du? ");
        int alter = sc.nextInt();

        System.out.println(name + " ist " + alter + " alt.");

        sc.close();
    }
}
