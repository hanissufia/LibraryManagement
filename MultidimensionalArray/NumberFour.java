public class NumberFour {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean hasPermission = false;

        if(!isLoggedIn || !hasPermission){
           System.out.println("Failed to log in");
        } else {
            System.out.println("You have successfully logged in");
        }
    }
}
