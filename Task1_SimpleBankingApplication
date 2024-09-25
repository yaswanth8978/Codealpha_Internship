import java.util.*;
public class Task1_SimpleBankingApplication{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
        double balance=0.0;
        while (true) 
        {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount=scanner.nextDouble();
                    balance+=depositAmount;
                    System.out.println("Deposit successful. New balance: ");
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount=scanner.nextDouble();
                    if (withdrawAmount<=balance) 
                    {
                        balance-=withdrawAmount;
                        System.out.println("Withdrawal successful.New balance: ");
                    } else 
                    {
                        System.out.println("Insufficient funds.");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is: " + balance);
                    break; 
                case 4:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
}
