class nestedClass{
    static double x, y, r;
    nestedClass(double r){
        this.r = r;
        x = 5;
        this.y = 6;
    }
    class Point{ // or public static class Point{} is also allowed
        double x, y;
        void display(){
            
            System.out.println("This is the point class: " + this.x + " " + this.y);
        }
        Point(double x, double y){
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args){
        nestedClass c1 = new nestedClass(2.0);
        Point p1 = new Point(1, 2); // if the class is static then no object is required 
        // if it was static Point then we could have done
        // Point p1 = c1.new Point(1, 2);
        p1.display();
    }
}