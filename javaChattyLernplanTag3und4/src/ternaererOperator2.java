// Aufgabe 19 – Ternär-Test
// Jetzt nehmen wir den Scanner wieder raus, damit es wirklich nur um den Operator geht.
// Gegeben: int alter = 31;
// Erstelle eine Variable kategorie, die mithilfe eines ternären Operators folgendes festlegt:
// - Alter unter 18 → "Minderjährig"
// - Alter 18 oder älter → "Volljährig"
// Danach soll kategorie ausgegeben werden.
// Aber:
// Diesmal möchte ich, dass du nicht wieder status verwendest, sondern dir selbst überlegst:
// - Welcher Datentyp?
// - Wie heißt die Variable?
// - Welche Bedingung?
// - Welcher Wert bei true?
// - Welcher Wert bei false?

public class ternaererOperator2 {
    public static void main(String[] args) {
        int alter = 31;

        String kategorie = alter < 18 ? "Minderjährig" : "Volljährig";
        System.out.println(kategorie);
        boolean kategorie2 = alter >= 18 ? true : false;
        System.out.println(kategorie2);
    }
}
