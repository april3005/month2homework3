package com.company;

public class BankAccount {
    private double amount;
    private double sum;

    public double getSum() { return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Your balance " + amount);
        return amount;
    }
    public double withdraw (double sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException (amount, "Your balance is not enough. Your balance: ");
        }
        return amount;
    }
}
