import java.util.Arrays;

public class NumberOne {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6, 7},
            {8, 9}
        };

       
    System.out.println("Length of the array: " + matrix.length);


    System.out.println("Length of each Sub-array:");
    
        for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i].length);
            }
            System.out.println(); // For better formatting
        
        // Print all elements of the matrix using nested loops
        for(int []mat:matrix){
            for(int number:mat){
                System.out.println(number);
            }
        }

        
    }
}

