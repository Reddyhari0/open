import java.util.Scanner;

public class Bank {
    private double checkingBalance;
    private double savingBalance;
    private double fixedDepositBalance;
    private double fixedDepositInterestRate;
    private double savingInterestRate;
    private double previousTransaction;

    public Bank() {
        checkingBalance = 0;
        savingBalance = 0;
        fixedDepositBalance = 0;
        fixedDepositInterestRate = 0;
        savingInterestRate = 0;
        previousTransaction = 0;
    }

    public void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our Bank!");
        System.out.println("==============================");
        System.out.println("A. Check Account Balance");
        System.out.println("B. Deposit Money");
        System.out.println("C. Withdraw Money");
        System.out.println("D. Previous Transaction Details");
        System.out.println("E. Calculate Fixed Deposit Interest");
        System.out.println("F. Calculate Saving Account Interest");
        System.out.println("G. Exit");
        System.out.println("==============================");

        do {
            System.out.print("Enter an option: ");
            option = scanner.next().charAt(0);

            switch(option) {
                case 'A':
                    checkBalance();
                    break;
                case 'B':
                    deposit();
                    break;
                case 'C':
                    withdraw();
                    break;
                case 'D':
                    previousTransactionDetails();
                    break;
                case 'E':
                    calculateFixedDepositInterest();
                    break;
                case 'F':
                    calculateSavingAccountInterest();
                    break;
                case 'G':
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Error: Invalid option selected. Please try again.");
                    break;
            }
        } while(option != 'G');

        scanner.close();
    }

    public void checkBalance() {
        System.out.println("==============================");
        System.out.println("Checking Account Balance: $" + checkingBalance);
        System.out.println("Saving Account Balance: $" + savingBalance);
        System.out.println("Fixed Deposit Balance: $" + fixedDepositBalance);
        System.out.println("==============================");
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();

        System.out.println("==============================");
        System.out.println("Select an account to deposit to:");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.println("==============================");

        int accountOption = scanner.nextInt();
        switch(accountOption) {
            case 1:
                checkingBalance += amount;
                break;
            case 2:
                savingBalance += amount;
                break;
            case 3:
                fixedDepositBalance += amount;
                break;
            default:
                System.out.println("Error: Invalid option selected. Please try again.");
                break;
        }

        System.out.println("Deposit of $" + amount + " successful.");
        previousTransaction = amount;
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();

        System.out.println("==============================");
        System.out.println("Select an account to withdraw from:");
        System.out.println("1. Checking Account");
        System.out.println("2. Saving Account");
        System.out.println("3. Fixed Deposit Account");
        System.out.println("==============================");

        int accountOption = scanner.nextInt();
        switch(accountOption) {
           
