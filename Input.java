
import java.util.Scanner;
public class Input {
    public static void main (String []args){
        
        System.out.println("HEllo, What is your name ?");
        Scanner scan = new Scanner (System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name + " Please enter two numbers");

        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
    int sum = a + b;
    System.out.println(sum);
    
    }
}
