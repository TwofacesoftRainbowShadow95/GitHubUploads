import java.util.Scanner;

class Person {
    String name;
    int alter;

    Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }    
}

public class personenDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib den Namen ein:");
        String name = sc.nextLine();

        System.out.println("Gib das Alter ein:");
        int alter = sc.nextInt();
        
        Person neu = new Person(name, alter);
        Person tim = new Person("Tim", 10);
        Person klaus = new Person("Klaus",100);

        System.out.println(tim.name + " " + tim.alter);
        System.out.println(neu.name + " " + neu.alter);

        sc.close();
    }
}
