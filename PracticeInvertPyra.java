public class PracticeInvertPyra {
    public static void main (String []args){
        int row = 5;

        for(int counter = 1; counter <= row; counter++){
            for (int j = 1; j<= row -1; j++){
                System.out.print(" ");
            }
            System.out.println();
            for(int printStar = 1; printStar >= counter;printStar++)
            System.out.print("*");
        }
            System.out.println();
    }
}
    
