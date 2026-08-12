class Animal{
    Animal(){
        System.out.println("This is the animal constructor");
    }
}
class Dog extends Animal{
    String color;
    Dog(){
        // super(); by default is called by java
        color = "White";
    }
    void Details(){
        System.out.printf("The dog is %s in color", color);
        System.out.println();
    }
}
public class Super{
    public static void main(String args[]){
        Dog d = new Dog();
        d.Details();
    }
}