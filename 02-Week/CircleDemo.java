import java.lang.*;

class Circle{
    double x, y;
    double r;

    double circum(){
        return 2 * 3.14 * r;
    } // Math.PI is also available

    double area(){
        return (22.0/7) * r * r;
    }
}
class Cuboid{
    double height, width, depth;
    double area(){
        double a;
        a = 2 * (width*height + width*depth + height*depth);
        return a;
    }
    double vol(){
        return width*height*depth;
    }
}
class CircleDemo{
    public static void main(String args[]){
        Circle c = new Circle();
        c.x = 0.0;
        c.y = 0;
        c.r = 5;
        System.out.println("Circumference: " + c.circum());
        System.out.println("Area: " + c.area());

        Cuboid x = new Cuboid();
        x.width = 1;
        x.height = 2;
        x.depth = 3;

        System.out.println("Area: " + x.area());
        System.out.println("Volume: " + x.vol());
    }
}