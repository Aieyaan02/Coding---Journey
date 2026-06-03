import java.util.Scanner;
public class checkPrime {

    public static int isPrime (int n){
        // prime number is a number that can only be divided but 1 and the number itself.
        if(n <= 1){
            System.out.println("Invalid number");
        }
        for(int i = 2;i <= n/2;i++){
            if(n%i == 0){
                System.out.println("Not a prime number");
            } else {
                System.out.println("Is a prime number");
            }
        
        }
       return n;
    }

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an number: ");
        int n = scan.nextInt();
        System.out.println("Given number is : "+ isPrime(n));
        scan.close();

    }

}
