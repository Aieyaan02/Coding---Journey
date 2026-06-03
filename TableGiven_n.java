import java.util.Scanner;

public class TableGiven_n {
    public static int table (int a){
        
        for(int i = 1; i <= 10;i++){
            System.out.println(a*i);

        }
        return a;
    }
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = scan.nextInt();
        System.out.println("Given number is : "+ table(num));

        scan.close();
    }
    
}
