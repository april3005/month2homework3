package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(10000);
        while (true) {

            bankAccount.setAmount(bankAccount.getAmount() - bankAccount.getSum());

            try {
                bankAccount.withdraw(6000);

            } catch (LimitException le) {

                System.out.println("Your balance: " + bankAccount.getAmount());
                if (bankAccount.getSum() > bankAccount.getAmount()) {
                    bankAccount.setAmount(bankAccount.getAmount() - bankAccount.getSum());
                }
            }
        }
    }

}
