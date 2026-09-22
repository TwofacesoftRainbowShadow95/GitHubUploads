package Tag22;

// 01: Globaler Bibliothekszaehler
// Erstelle A01_Buchbestand.java.

// Die Aufgabe wird mit Konsoleingabe/Scanner geloest.

// Schreibe eine Klasse fuer ein Buch, die:

// eine private statische Zaehlvariable fuer die Gesamtzahl aller registrierten Buecher enthaelt
// einen privaten Buchtitel als Instanzvariable speichert
// im Konstruktor den Buchtitel initialisiert und den gemeinsamen Zaehler um 1 erhoeht
// eine statische Abfragemethode fuer die Gesamtzahl aller Buecher bereitstellt
// eine Methode besitzt, um den Buchtitel mit einer lokalen Praefix-Variable auszugeben
// Lese in main die Anzahl der zu erfassenden Buecher (z. B. 3) und anschliessend die Buchtitel nacheinander ueber die Konsole ein. 
// Erzeuge fuer jeden Titel ein Buchobjekt, gib jeweils den Buchtitel aus und zeige am Ende die Gesamtzahl aller Buecher an.

// Beispielhafte Eingabe:

// 3
// Java Grundlagen
// Clean Code
// Entwurfsmuster

// Erwartete Ausgabe:

// Buch: Java Grundlagen
// Buch: Clean Code
// Buch: Entwurfsmuster
// Registrierte Buecher gesamt: 3

import java.util.Scanner;

class Buch {
    private static int gesamtBuecher;
    private String buchTitel;

    Buch(String buchTitel) {
        this.buchTitel = buchTitel;
        this.gesamtBuecher += 1;
    }

    public static int getGesamtBuecher() {
        return gesamtBuecher;
    }

    // public static int setGesamtBuecher() {
    //     return gesamtBuecher;
    // }

    public static String setBuchTitel(String buchTitel) {
        return buchTitel;
    }
}

public class A01_Buchstand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Gib einen Buchtitel ein: ");
        String buchTitel1 = Buch.setBuchTitel(sc.nextLine());
        Buch buch1 = new Buch(buchTitel1);

        System.out.print("Gib einen Buchtitel ein: ");
        String buchTitel2 = Buch.setBuchTitel(sc.nextLine());
        Buch buch2 = new Buch(buchTitel2);

        System.out.print("Gib einen Buchtitel ein: ");
        String buchTitel3 = Buch.setBuchTitel(sc.nextLine());
        Buch buch3 = new Buch(buchTitel3);



        sc.close();
    }
}
