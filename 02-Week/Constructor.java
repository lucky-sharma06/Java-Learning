class Animal{
    String name, color;
    String sound;

    Animal(String a, String b){
        name = a;
        color = b;
    }
    // this is the constructor overloading
    Animal(String sound){
        this.sound = sound;
        this("Elephant", "Gray"); // this again calls the consturctor for the object depending upon the arguments
    }

    void display(){
        System.out.println(name + " is " + color);
        System.out.println(name + " says " + sound);
        System.out.println();
    }
}

class Constructor{
    public static void main(String args[]){
        Animal a1 = new Animal("Dog", "White");
        Animal a2 = new Animal("Cat", "Black");

        Animal a3 = new Animal("Meow");
        a1.sound = "Barks";
        a1.display(); // no sound but we set it using a1.sound
        a2.display(); // no sound
        a3.display(); // only sound initialized
    }
}