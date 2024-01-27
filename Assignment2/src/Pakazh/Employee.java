package Pakazh;
public class Employee extends Person {  //subclass of person superclass
    private String position;
    private double salary;

    public Employee() {  //default constructor
        super();   //calling contructor from superclass
        this.position = "Employee";   //setting position employee
        this.salary = getSalary();    //getting salary
    }

    public Employee(String name, String surname, double salary) {   //parametrized constructor for employee
        super(name, surname);    //getting name and surname by calling superclass
        this.position = "Employee";   //setting position
        setSalary(salary);             //setting salary
    }

    public void setPosition(String position) { //setting position
        this.position = position;
    }

    public void setSalary(double salary) { //set salary
        this.salary = salary;
    }

    public double getSalary() {  //get salary
        return salary;
    }

    @Override //overriding method from payable to get salary
    public double getPaymentAmount() {
        return salary;
    }

    @Override  //overriding getposition method to get position
    public String getPosition() {
        return this.position;
    }

    @Override  //print data
    public String toString() {
        return "ID: " + getId()+" "+ position + " " + getName() +" "+ getSurname() +" "+ salary + "tg" + "\n";

    }
}
