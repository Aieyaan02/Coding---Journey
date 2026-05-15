public class NumberPyramid {
    public static void main (String[]args){
        int n = 5;
        //Outer loop for first line
        for(int i = 1; i <= n; i++){
            //Inner loop for porer line
            for(int j = 1; j<= n-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j <= i; j++){
                System.out.print(i + " ");
            }
        System.out.println();

        } 
    } // end main
    
} // end Number Pyramid
