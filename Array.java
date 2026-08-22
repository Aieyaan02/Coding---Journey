import java.util.Scanner;
public class Array {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[]name = new String[size];

        for(int i = 0; i < size;i++){
            name[i] = scan.next();
            scan.close();
            System.out.println();  
            System.out.println(); 
        }
        for(int i = 0; i < size;i++){
            System.out.println(name[i]);
        }   
        }
    } 

