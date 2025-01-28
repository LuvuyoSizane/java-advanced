package Chapter7;

public class AccountRunner {
    public static void main(String[] args) {
        Account obj1Account = new Account("6680894452","Luvuyo", BankAccountType.Loan,"255061");

        Account obj2Account = new Account("1234567889","Sizane", BankAccountType.Savings,"123456");

   // objAccount.setAccountType(BankAccountType.Cheque);

        obj1Account.display();
        obj1Account.transfer(obj2Account,5000);
        System.out.println("After Transfer");
        obj1Account.display();
        System.out.println("OBJ 2 AMMOUNT");
        obj2Account.display();
    }
}
