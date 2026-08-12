public class Fibo{
    int n;
    int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args){
        Fibo f = new Fibo();
        f.n = Integer.parseInt(args[0]);
        for(int i = 0; i < f.n; i++){
            System.out.print(" " + (f.fibo(i)));
        }
        System.out.println();
    }
}