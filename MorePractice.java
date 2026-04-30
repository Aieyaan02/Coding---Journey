import java.util.Scanner;
public class MorePractice {
    public static void main (String [] args){
        System.out.println("Welcome to calculator !!");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter value for a: ");
        double a = scan.nextDouble();
        System.out.println("Enter value for b: ");
        double b = scan.nextDouble();
        System.out.println(" What operation would you like to perform ? ");
        int operator = scan.nextInt();
        scan.close();
        switch (operator) {
            case 1 : 
            System.out.println(a + b);
            break;
            case 2 :
            System.out.println(a - b);
            break;
            case 3 :
            System.out.println(a * b);
            break;
            case 4 :
                if (b > a && b == 0){
                    System.out.println("Invalid");
                } else {
            System.out.println(a / b);
                }
            break;
        
            default:
                break;
        }




    }
    
}
