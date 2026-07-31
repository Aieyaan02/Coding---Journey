import java.util.Scanner;
    public static void main (String []args){
        greater(4,6);
    }
    static void greater(int n,int c){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        if (a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }




















/*/     public static void main (String []args){
        sumOdd();
    }
    static void sumOdd(){
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        scan.close();
        int sum = 0;
        for (int i = 0; i<=n ;i++){
            if(i % 2 == 1){
                sum = sum + i;
            System.out.println(sum); 
            }
        }
    }/*/
/*/public class PR {
    public static void main (String[]args){
        average(2,5,6);

    }
    public static void average (int a, int b, int c){      
        int math = (a + b + c)/3;
        System.out.println(math);
    }
    
} /*/


