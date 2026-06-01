import java.util.Scanner;
    public class CheckEven {
    
    public static int check_even (int n){
        if (n%2 == 0){
            System.out.println("even");
        } else {
            System.out.println("Odd");
        }
        return n;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        sc.close();
        check_even(num);

    }
    
}
    

