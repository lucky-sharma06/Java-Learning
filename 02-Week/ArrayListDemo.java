import java.util.*;
class ArrayListDemo{
    public static void main(String args[]){
        int sum = 0;
        float avg = 0;

        ArrayList<Integer> arr = new ArrayList<Integer>(); // this is a new way to make array 
        System.out.println("Enter the input: ");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt()){
            arr.add(input.nextInt());
        }
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i);
        }
        avg = (float)sum/(arr.size());
        System.out.println("Average: " + avg);
    }
}