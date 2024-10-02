import java.util.Scanner;

public class Account {
    private double accBalance = 7600.0;
    private int deposit;
    private double withdraw;
    

    public double getDeposit(){
        accBalance = accBalance + deposit;
        return accBalance;
    }

    public void getWithdraw(){
        if(withdraw <= accBalance){
            accBalance = accBalance - withdraw;
        } else{
           System.out.println("Insufficient Balance");
        }
    }

    public void checkBalance(){
            System.out.println("Your account balance: RM" + accBalance);
        }
        
        public static void main(String[] args) {
            Account acc = new Account();
            
            Scanner scanner = new Scanner(System.in);
            while (true) {
            System.out.println("------Welcome------");
            System.out.println("\n");
            System.out.println("1 - Cash Deposit");
            System.out.println("2 - Cash Withdrawal");
            System.out.println("3 - Check Account Balance");
            System.out.println("4 - exit");

            System.out.println("What operation would you like to perform today? ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: RM");
                    int deposit = scanner.nextInt();
                    scanner.nextLine();

                    acc.getDeposit();

                    System.out.println("\nYour deposit amount of "+ deposit
                                           + " has been added to your account balance.");
                    break;

                case 2:
                    System.out.println("Enter withdrawal amount: ");
                    int withdraw = scanner.nextInt();
                    scanner.nextLine();

                    acc.getWithdraw();

                    System.out.println("\nRM" + withdraw + " has been withdrawn from your account");
                    break;

                case 3:
                    acc.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose option 1 - 4.");
                    break;
                
            }
           
        }

        }
    }
    


