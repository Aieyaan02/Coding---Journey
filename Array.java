import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        MaxMin();
    }
    public static void function1() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = scan.nextInt(); // Read the size as an integer
        String[] name = new String[size]; // Use the integer size to create the array

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name for index " + i + ":");
            name[i] = scan.next(); // Read a string to populate the array
        }

        System.out.println("Array contents:");
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]); // Print the array elements
        }
        scan.close(); // Close the scanner to avoid resource leaks
    }
    static void MaxMin(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number number for Array : " );
        int size = scan.nextInt();
        int[]numbers = new int[size];

        for (int i = 0;i < size;i++){
            numbers[i] = scan.nextInt();
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min = numbers[i];
            }
            if(numbers[i]>max){
                max = numbers[i];
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println();
        System.out.println();
        System.out.println();

        scan.close();
            
            }
            
        }
    }
}

