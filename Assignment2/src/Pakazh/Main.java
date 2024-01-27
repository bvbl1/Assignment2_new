package Pakazh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {  //creating main class
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(); //creating a list for a person class
        Student Abylay = new Student("Abylay", "Moldakhmet", 3.86);
        Student NabegiOM = new Student("Na", "Be", 3.3);
        Employee surf = new Employee("Ermek", "Orazbaev", 1230000);
        Employee Alexus = new Employee("Alikhan", "Borashek", 4127864);
        Student Bibra = new Student("Bibragim", "Quanysh", 2.6);
        people.add(Abylay);  //adding students to list
        people.add(NabegiOM);
        people.add(surf);
        people.add(Alexus);
        people.add(Bibra);
        Collections.sort(people, new Comparator<Person>(){  //Sorting people by their salary
            @Override
            public int compare(Person per1, Person per2) {
                return Double.valueOf(per1.getPaymentAmount()).compareTo(per2.getPaymentAmount());
            }
        });
        System.out.println(people);
    }
}