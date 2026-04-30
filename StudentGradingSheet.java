import java.util.Scanner;
public class StudentGradingSheet {
    public static void main (String []args){

    Scanner scan = new Scanner (System.in);
    
    int input; // Declare the variable before the loop
    do {
        int marks = scan.nextInt();
        if (marks >= 90){
            System.out.println("This is Good");
        
    } else if (marks >= 60) {
        System.out.println("This is alos good");

    } else if (marks >= 0){
        System.out.println("this is good as well");

    } else {
        System.out.println("Invalid");
    }
    System.out.println("Do you want to keep continue ? Yes(1) and No(0) ?");
    input = scan.nextInt();
        
 } while(input == 1);
        scan.close();
    }

    } 

