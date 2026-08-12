class Recursion{
    int n;
    int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);

    }
    public static void main(String[] args){
        Recursion x = new Recursion();

        int n = Integer.parseInt(args[0]);

        System.out.println("The factorial is: " + x.factorial(n));

    }
}