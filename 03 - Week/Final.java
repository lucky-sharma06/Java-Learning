abstract class Base{
    final void fun(){
        System.out.println("This is the final fun()");
    }
}
class Derived extends Base{}
class Final {
    public static void main(String args[]){
        Derived d = new Derived();
        d.fun();
    }
}