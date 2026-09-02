// Aufgabe Erstelle:
// int alter = 25;
// und verwende keine if/else, sondern den ternären Operator, um status zu bestimmen.
// Danach:
// System.out.println(status);
// Erwartete Ausgabe:
// Volljährig

public class ternaererOperaor {
    public static void main(String[] args) {
        int alter = 25;

        String status = alter >= 18 ? "Volljährig" : "Minderjährig";

        System.out.println(status);
    }
}
