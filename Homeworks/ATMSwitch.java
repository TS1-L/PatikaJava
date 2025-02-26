import java.util.Scanner;

public class ATMSwitch {
    
    public static void main(String[] args) {
        
        String userName, password;
        Scanner input = new Scanner(System.in);
        int attempts = 3;
        int balance = 1500;
        int choice;
        boolean isLoggedIn = false;

        while (attempts > 0) {
            System.out.print("Enter your username: ");
            userName = input.nextLine();
            System.out.print("Enter your password: ");
            password = input.nextLine();

            
            int loginCheck = (userName.equals("admin") && password.equals("password123")) ? 1 : 2;
            switch (loginCheck) {
                case 1: 
                    isLoggedIn = true;
                    System.out.println("Hello, welcome to the CodeBank!");
                    while (isLoggedIn) {
                        System.out.println("1-Deposit Money\n" +
                                "2-Withdraw Money\n" +
                                "3-Check Balance\n" +
                                "4-Log Out");
                        System.out.print("Please select an option: ");
                        choice = input.nextInt();

                        
                        switch (choice) {
                            case 1:
                                System.out.print("Enter the amount to deposit: ");
                                int depositAmount = input.nextInt();
                                balance += depositAmount;
                                break;
                            case 2:
                                System.out.print("Enter the amount to withdraw: ");
                                int withdrawAmount = input.nextInt();
                                
                                int withdrawalCheck = (withdrawAmount > balance) ? 2 : 1;
                                switch (withdrawalCheck) {
                                    case 1:
                                        balance -= withdrawAmount;
                                        break;
                                    case 2:
                                        System.out.println("Insufficient balance.");
                                        break;
                                }
                                break;
                            case 3:
                                System.out.println("Your balance: " + balance);
                                break;
                            case 4:
                                System.out.println("Goodbye, see you again!");
                                isLoggedIn = false;
                                break;
                            default:
                                System.out.println("Invalid option selected.");
                                break;
                        }
                    }
                    attempts = 0; 
                    break;
                case 2: 
                    attempts--;
                    System.out.println("Invalid username or password. Please try again.");
                    
                    switch (attempts) {
                        case 0:
                            System.out.println("Your account has been blocked. Please contact the bank.");
                            break;
                        default:
                            System.out.println("Remaining attempts: " + attempts);
                            break;
                    }
                    break;
            }
        }
    }
}
