import java.util.Scanner;

public class loops {
    public static void main (String []args ){
        
        for (int counter = 0; counter < 11; counter++ ){
            System.out.print(counter+" ");
        }
    System.out.println("==============================================================");
        int j  = 0;
        while (j < 11) {
            System.out.println(j);
            j ++ ;
        }
    System.out.println("==============================================================");
           int i = 0; 
        do {
            System.out.println (i);
            i++;

        } while(i < 11);

    System.out.println("==============================================================");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int k = 0; k <= n; k++){
            sum = sum + k;
        }
        System.out.println(sum);
        

 System.out.println("==============================================================");
    
        int a = sc.nextInt();

        for(int y = 1; y < 11; y++){
            System.out.println(y * a);

        }

    }
    
}

