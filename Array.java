import java.util.Scanner;
public class Array {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int number[] = new int[size];
        //intput
        for (int i = 0;i<size;i++){
            number[i]= scan.nextInt();
        }
        int x = scan.nextInt();
        //output
        for (int i = 0; i<number.length;i++){
            if (number[i]==x){
                System.out.println("x found at " + i);
            }
        }
    } 
}

static void names(){
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();

}
