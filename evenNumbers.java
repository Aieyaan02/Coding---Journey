import java.util.Scanner;

public class evenNumbers {
    public static void main (String []args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = scan.nextInt();
    scan.close();

    for (int i = 0; i <= n ; i++){
        if (i % 2 == 0){
        System.out.println(i);
    }
}

}
}
    
