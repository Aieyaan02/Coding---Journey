import java.util.Scanner;
    public static void main(String[]args){
    }
    static void infiniteloop(){   
        System.out.println();
        Scanner scan = new Scanner(System.in);       
        scan.close();     
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
/*/ public static void main (String[]args){
    age();
}
    static void age(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter age : ");
        int age = scan.nextInt();
        scan.close();
        if (age < 18){
            int eligibleToVote = 18 - age;
            System.out.println(" You are not allowed to vote yet try " + eligibleToVote + 
            " years later ");
        } else {
            System.out.println("You are eligible to vote :) ");
        }
    } /*/
/*/   public static void main (String []args){
        Scanner scan = new Scanner (System.in);
        double radius = scan.nextDouble();
        System.out.println(circumference(radius));   
        scan.close();
    }
    static Double circumference (Double radius){
        return 2 * Math.PI * radius;
    } /*/
/*/  public static void main (String []args){
        greater(4,6);
    }
    static void greater(int a,int b){
        if (a>b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    } /*/
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


