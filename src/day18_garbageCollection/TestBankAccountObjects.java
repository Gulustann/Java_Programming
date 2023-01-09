package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gulustan", 123456789, 0);

        System.out.println(obj1);
        obj1.deposit(1000);
        obj1.checkBalance();
        obj1.withdraw(700);
        obj1.checkBalance();

        obj1.deposit(-1000);
        obj1.checkBalance();

        obj1.withdraw(5000);
        obj1.checkBalance();
        System.out.println("____________________________________");

        BankAccount account1 = new BankAccount();
        BankAccount account2 =new BankAccount();

        account1.setInfo("Sebastian", 786541236, 0);
        account2.setInfo("Umran", 458796321, 0);

        account1.deposit(5000);
        account2.deposit(10000);

        System.out.println(account1);
        System.out.println(account2);

    }
}
