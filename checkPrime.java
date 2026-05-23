import java.util.Scanner;
public class checkPrime {

    public static int prime (int n){
        // prime number is a number that can only be divided but 1 and the number itself.
        if(n<=1){
            System.out.println("Invalid number");
        } else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not Prime");
                } else {
                    System.out.println("Prime");
                }               

            }

        }
        return n;
    }

    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an number: ");
        int n = scan.nextInt();
        prime(n);
        scan.close();
    }

}
