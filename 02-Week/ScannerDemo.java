import java.util.Scanner;

public class ScannerDemo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first num: ");
        int num1, num2;

        num1 = s.nextInt();
        System.out.println("Enter the second num: ");
        num2 = s.nextInt();

        System.out.println("The sum is: " + (num1 + num2));
    }
}

