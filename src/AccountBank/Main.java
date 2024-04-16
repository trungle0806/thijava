package AccountBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new AccountBank object
        AccountBank account = new AccountBank();

        // Input account information
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        account.setAccountNumber(accountNumber);

        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        account.setAccountHolderName(accountHolderName);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        account.setBalance(balance);

        // Display account information
        System.out.println("Account information:");
        account.displayAccountInfo();

        // Test transactions
        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.println("Enter destination account number for transfer: ");
        String destinationAccountNumber = scanner.next();
        System.out.print("Enter transfer amount: ");
        double transferAmount = scanner.nextDouble();
        // Assuming destination account already exists
        AccountBank destinationAccount = new AccountBank();
        destinationAccount.setAccountNumber(destinationAccountNumber);
        account.transfer(destinationAccount, transferAmount);

        scanner.close();
    }
}
