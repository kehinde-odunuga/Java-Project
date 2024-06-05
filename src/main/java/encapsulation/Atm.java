package encapsulation;

public class Atm {
    public static void main(String[] args) {

        Bank b = new Bank();
        b.updatePin(1020304050, 1234, 2222);
        b.withdrawAmount(1020304050, 2222, 20000);
        b.cashDeposit(1020304050, 2222, 70000);
    }
}
