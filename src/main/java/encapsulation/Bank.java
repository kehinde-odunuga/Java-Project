package encapsulation;

public class Bank {

    public int accountNo = 1020304050;
    private int pinNo = 1234;
    private double accBalance = 1000000;

    public void withdrawAmount(int accNo, int pin, int amount) {
        if (accNo == accountNo && pin == pinNo) {

            if (amount <= accBalance) {

                accBalance = accBalance - amount;
                System.out.println("Amount withdrawal: " + amount);

            } else {

                System.out.println("Invalid balance!!!");

            }
        } else {

            System.out.println("Invalid credentials!!!");
        }
    }

    public void updatePin(int acctNo, int oldPin, int newPin) {
        if (acctNo == accountNo && oldPin == pinNo) {

            pinNo = newPin;
            System.out.println("Pin changed successfully!!!");

        } else {
            System.out.println("Invalid credentials!!!");
        }
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public double cashDeposit(int accNo, int pin, double amount) {
        if (accNo == accountNo && pin == pinNo) {
            accBalance = accBalance + amount;
            System.out.println(accBalance);
            return accBalance;
        } else {
            System.out.println("Invalid transaction");
            return accBalance;
        }

    }
}
