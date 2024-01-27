package Pakazh;

public abstract class Person implements Payable{ //abstract class person with interface payable
    private static int id_gen = 1;
    private int id ;
    private String name;
    private String surname;
    private String position;

    public int compareTo(Person person){  //method to compare the salary among person
        return Double.compare(this.getPaymentAmount(), person.getPaymentAmount());
    }

    public Person() {   //default constructor
        this.id = id_gen++;
        this.name = "";
        this.surname = "";
    }
    public Person (String name, String surname){   // parameterized constructor
        this.id = id_gen++;
        this.name = name;
        this.surname=surname;
    }


    public abstract String getPosition();  //abstract method to get position
    public int getId() {  //getting other data
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
