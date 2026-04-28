import java.util.Scanner;
public class Calculator {

    public static void main (String[] args){
        System.out.println("Hello enter two Integer number for calculation : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("What operation would you like to perform : ");
        String perform = scan.next();
        scan.close();
        if (perform.equals("+")){
            System.out.println(a + b);
        } else if (perform.equals("-")){
            System.out.println(a - b);
        } else if (perform.equals("*")){
            System.out.println(a * b);
        } else if (perform.equals("/")){
            System.out.println(a / b);
        } else {
            System.out.println("invalid");
        }   

    }
    
}
