package org.Assignments.CustomException;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(500); // Successful withdrawal
            account.withdraw(-100); // Throws InvalidWithdrawalException
            account.withdraw(1500); // Throws InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InvalidWithdrawalException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}