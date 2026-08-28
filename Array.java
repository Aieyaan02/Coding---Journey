import java.util.Scanner;

public class Array { 
    public static void main(String[] args) { 
        MaxMin(); 
    } 

    public static void function1() { 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter size of array: "); 
        int size = scan.nextInt(); 
        String[] name = new String[size]; 
        
        for (int i = 0; i < size; i++) { 
            System.out.println("Enter name for index " + i + ":"); 
            name[i] = scan.next(); 
        } 
        
        System.out.println("Array contents:"); 
        for (int i = 0; i < size; i++) { 
            System.out.println(name[i]); 
        } 
        scan.close(); 
    } 

    static void MaxMin(){ 
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter size of Array : " ); 
        int size = scan.nextInt(); 
        int[] numbers = new int[size]; 
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++){ 
            numbers[i] = scan.nextInt(); 
        } 

        // Fix 1: Invert the starting logic or use the first element of the array
        int max = Integer.MIN_VALUE; 
        int min = Integer.MAX_VALUE; 

        for(int i = 0; i < numbers.length; i++){ 
            if(numbers[i] < min){ 
                min = numbers[i]; 
            } 
            if(numbers[i] > max){ 
                max = numbers[i]; 
            } 
        } 
        
        // Fix 2: Print the results
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        // Fix 3: Close scanner outside the loop
        scan.close(); 
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    } 
}

