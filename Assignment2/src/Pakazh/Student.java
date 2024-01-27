package Pakazh;

public class Student extends Person {  //subclass student of person superclass
    private double gpa;
    public Student(){  //calling methods from superclass
        super();
    }
    public Student(String name, String Surname, double gpa){  //parametrized constructor
        super(name, Surname);  //constructor from superclass
        setGpa(gpa);   //set gpa
    }

    public void setGpa(double gpa) {   //setGpa
        this.gpa = gpa;
    }
    public double getGpa() {
        return gpa;   //get gpa
    }


    @Override
    public String getPosition() {
        return "student";   //setting position
    }

    @Override
    public double getPaymentAmount() {  //giving scholarship if gpa>=2,67
        if (gpa>2.67){
            return 36660;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {   //print data
        return "ID: " + getId() +" "+ getPosition() +" "+ getName() + " " + getSurname() +" "+ gpa +" "+ getPaymentAmount() + "tg" + "\n";
    }
}