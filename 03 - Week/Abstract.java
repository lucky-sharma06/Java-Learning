abstract class Base{
    Base(){
        System.out.println("The is the base constructor");
    }
    abstract void fun();

    void nonAbs(){
        System.out.println("This is the non-abstract method"); // can be accessed through the sub class only
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived constructor is called");
    }
    void fun(){
        System.out.println("We are in the derived class");
    }
    void Fun(){
        System.out.println("We are in the derived class");
    }
}
class Abstract{
    public static void main(String args[]){
        Derived d = new Derived();
        d.fun();

        // Base b = new Base(); abstract class cannot be instantiated
        // b.fun();

        Base b = new Derived();
        b.fun(); // references of base type

        b.nonAbs();
        
    }
}