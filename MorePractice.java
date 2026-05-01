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
                if (b == 0){ // && 'AND' “ONLY run this if BOTH are true”
                            // || 'OR' “Run this if AT LEAST ONE is true” 
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

/*/int x = 3;
int y = 8;

if (x > 5 || y > 5) {
    System.out.println("Hello");
}

Answer: Hello (because y > 5 is true)/*/