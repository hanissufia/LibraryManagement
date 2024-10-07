public class NumberThree {
    public static void main(String[] args) {
        int numbers [] = {10, 20, 30, 40, 50};

        for (int i = 0; i<5; i++){
            System.out.println(numbers[i]);
        }

        try{

            System.out.println(numbers[6]);
        } catch (ArrayIndexOutOfBoundsException e){ //if the array number is not matching the 
            System.out.println("Caught bad " + e.getMessage());
    }
    }
}
