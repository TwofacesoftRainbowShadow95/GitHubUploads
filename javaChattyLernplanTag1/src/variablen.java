//         Aufgabe 1 – Variablen

// Schreibe ein Java-Programm mit diesen Variablen:

// String → dein Name
// int → dein Alter
// double → deine Körpergröße
// boolean → ob du Java lernst

// Gib anschließend alle vier Werte mit System.out.println() aus.
package chattyJava.src.tag1;

public class variablen {
    public static void main(String[] args) {

        String name = "Yasmina Breuherr";
        int alter = 31;
        double koerpergroesse = 1.53;
        boolean javaLernen = true;

        System.out.println("Mein Name ist " + name);
        System.out.println("Ich bin " + alter + " Jahre alt.");
        System.out.println("Ich bin " + koerpergroesse + " m groß.");
        System.out.println("Java Lernstatus = " + javaLernen);

    }
}
