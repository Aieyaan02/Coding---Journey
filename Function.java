import java.util.Scanner;

public class Function {
    public static void PrintMyName (String name){
       System.out.println(name);
        return;
    }
    public static int Multiplication(int a, int b){
        
        return a * b;
    }
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name : ");
        String name = scan.next();
        PrintMyName (name); // calling the function

        System.out.println("Enter Multiplication number: ");
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("multiplication is : " + Multiplication(a, b));
        scan.close();

    }
    
}
