import java.io.*;
class InterestCal{ // old java deprecated
    public static void main(String args[]){
        Float principal = new Float(0);
        Float roi = new Float(0);

        int years = 0;
        DataInputStream in = new DataInputStream(System.in);

        String tempString;
        System.out.println("Enter the principal amount: ");
        System.out.flush();
        tempString = in.readLine();
        principal = Float.valueOf(tempString);
        System.out.println("Enter the rate of interest: ");
        System.out.flush();
        tempString = in.readLine();
        roi = Float.valueOf(tempString);
        System.out.println("Enter the number of years: ");
        System.out.flush();
        tempString = in.readLine();
        years = Integer.parseInt(tempString);
        // Input is over: calculate the interest
        float interestTotal = principal*roi*years;
        System.out.println("Interest: " + interestTotal);
    }
}