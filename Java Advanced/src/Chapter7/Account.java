package Chapter7;
/**
 * Class to hold attributes and functions related to bank account
 */
enum BankAccountType {
    Savings,
    Cheque,
    Loan,
    Credit

}
public class Account {
    private String accountNumber,accountHolder,branchCode,bankName;
    private double balance;
    private BankAccountType accountType;

    /*
     * Constructor for the Account class.
     * Initializes a new Account object with the provided details.
     *
     * @param accountNumber - the unique identifier for the account
     * @param accountHolder - the name of the account holder
     * @param accountType - the type of account (e.g., savings, checking)
     * @param branchCode - the code of the branch where the account is held
     */
    public Account(String accountNumber, String accountHolder, BankAccountType accountType, String branchCode) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.branchCode = branchCode;
        this.balance = 10;
        this.bankName="FNB - First National Bank";
        assignInitBalance(accountType);

    }
    // Method to display account details
    /*
     * Displays the details of the bank account, including:
     * - Bank name
     * - Account number
     * - Account holder's name
     * - Account type
     * - Branch code
     * - Balance
     */
    void display() {
        System.out.println("====" + bankName + "===="
                + "\nAccount Number : " + accountNumber
                + "\nAccount Holder : " + accountHolder
                + "\nAccount Type : " + accountType.name()
                + "\nBranch Code : " + branchCode
                + "\nBalance : R" + balance
        );
    }

    // Method to transfer an amount from the current account to another account
    /*
     * Transfers a specified amount from the current account to a target account.
     * The method first attempts to withdraw the specified amount from the current account,
     * and then deposits the amount into the target account.
     * If the withdrawal is successful, the amount will be transferred to the target account.
     *
     * @param target - the account to which the amount will be transferred
     * @param amount - the amount to transfer from the current account to the target account
     */
    void transfer(Account target, double amount){
       withdraw(amount);
        target.deposit(amount);

    }

    // Method to assign an initial balance based on the account type
    /*
     * This method assigns an initial balance to the account based on its type:
     * - For Loan accounts, the initial balance is set to R25,000.
     * - For Cheque and Savings accounts, the initial balance is set to R0.
     * - For Credit accounts, the initial balance is set to R7,500.
     *
     * The method checks the account type and assigns the corresponding balance accordingly.
     */
    void assignInitBalance(BankAccountType accountType){
        if (accountType==BankAccountType.Loan){
            balance=25000;
        }else if (accountType==BankAccountType.Cheque){
            balance=0;
        }else if (accountType==BankAccountType.Savings){
            balance=0;
        }else if (accountType==BankAccountType.Credit){
            balance=7500;
        }

    }

    // Getter for account number
    /*
     * Returns the account number of the bank account.
     * @return the account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    /*
     * Sets the account number for the bank account.
     * @param accountNumber - the new account number to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for account holder's name
    /*
     * Returns the name of the account holder.
     * @return the account holder's name
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for account holder's name
    /*
     * Sets the name of the account holder.
     * @param accountHolder - the new name of the account holder
     */
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for branch code
    /*
     * Returns the branch code associated with the bank account.
     * @return the branch code
     */
    public String getBranchCode() {
        return branchCode;
    }

    // Setter for Account Type
    /*
     * Sets the Account Type for the bank account.
     * @param accountType - the new Account Type to set
     */

    public void setAccountType(BankAccountType accountType) {
        this.accountType = accountType;
    }

    // Setter for branch code
    /*
     * Sets the branch code for the bank account.
     * @param branchCode - the new branch code to set
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    // Getter for account balance
    /*
     * Returns the current balance of the bank account.
     * @return the account balance
     */
    public double getBalance() {
        return balance;
    }

    // Setter for account balance
    /*
     * Sets the balance of the bank account.
     * @param balance - the new balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for account type
    /*
     * Returns the type of the bank account (e.g., savings, checking).
     * @return the account type
     */
    public BankAccountType getAccountType() {
        return accountType;
    }


    // Method to withdraw a specified amount from the account
    /*
     * Attempts to withdraw the specified amount from the account balance.
     * If the account balance is insufficient, it prints an error message.
     *
     * @param amount - the amount to withdraw
     */
    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("You don't have enough money");
        } else {
            balance = balance - amount;
        }
    }

    // Method to deposit a specified amount into the account
    /*
     * Deposits the specified amount into the account balance.
     *
     * @param amount - the amount to deposit
     */
    void deposit(double amount) {
        balance = balance + amount;
    }

}
