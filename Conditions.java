
import java.util.Scanner;

public class Conditions {
    public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a == b){
            System.out.println("equal");
        } else if (a > b){
                System.out.println(" a is greater than b");
            }
            else {
                if (a < b){
                    System.out.println(" b is greater than a");
                    scan.close();
                }
        }
    
    }
}
