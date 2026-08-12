import java.time.LocalDate;
class Person{
    String name;
    LocalDate dob;
    int mobileno;

    void readData(String n, LocalDate d, int m){
        name = n;
        dob = d;
        mobileno = m;
    }
    void printData(){
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob);
        System.out.println("Mobile No: " + mobileno);
    }
}
class Student extends Person{
    String clg;
    int ID;
    void printData(){
        super.printData();
        System.out.println("College: " + clg);
        System.out.println("ID: " + ID);
    }
}
public class Inheritance1{
    public static void main(String args[]){
        LocalDate d = LocalDate.of(2006, 9, 3);
        Student s1 = new Student();
        s1.clg = "XYZ";
        s1.ID = 223;
        s1.readData("Bhavya Sharma", d, 909090);
        s1.printData();
    }
}