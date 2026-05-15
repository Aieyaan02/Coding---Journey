public class rhombus {
    public static void main (String []args){
        int n = 8;
        //outer loops
        for (int i = 1; i <= n; i++){
            // inner loops
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int x = 1; x <= n; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
} 
