class Bike{
    void run(){
        System.out.println("This is the bike");
    }
}
class Upcasting extends Bike{
    void run(){
        System.out.println("This is the child class");
    }
    public static void main(String args[]){
        Upcasting u = new Upcasting();
        u.run();
        Bike b = new Bike();
        b.run();
        Bike b2 = new Upcasting();
        b2.run(); // this will string run the child class method
        // runtime polymorphism
    }
}