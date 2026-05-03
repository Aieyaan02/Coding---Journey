public class halfPyramid {
    public static void main (String [] args){
        int row = 4;

        for(int counter = 1; counter <= row; counter ++){
            for (int j = 1; j<= counter;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
