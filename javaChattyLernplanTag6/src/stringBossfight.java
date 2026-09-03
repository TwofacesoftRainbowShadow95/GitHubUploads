// Gegeben:
//      String passwort = "Java123";
//      String richtigesPasswort = "Java123";
// Dein Programm soll:
// - Prüfen, ob passwort genau "Java123" entspricht.
// - Wenn ja → "Passwort korrekt!"
// - Wenn nein → "Passwort falsch!"
// - Danach das Passwort einmal komplett groß und einmal komplett klein ausgeben.

//Wichtig: Für String-Vergleiche benutzen wir equals(), nicht ==.

public class stringBossfight {
    public static void main(String[] args) {
        String passwort = "Java123";
        String richtigesPasswort = "Java123"; 
        boolean vergleich = passwort.equals(richtigesPasswort);

        if (vergleich == true) {
            System.out.println("Passwort korrekt!");
        } else {
            System.err.println("Passwort falsch!");
        }

        System.out.println("Passwort Groß geschrieben: " + passwort.toUpperCase());
        System.out.println("Passwort klein geschrieben: " + passwort.toLowerCase());

    }
}
