public class rhombus {
    public static void main (String []args){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j<= n-1; j++){
                System.out.print(" ");
            }
            for(int x = 1; x <= n-1;x++){
                System.out.print("* * * * *");
            }
            System.out.println();
        }
    }
    
}
