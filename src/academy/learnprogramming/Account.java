package academy.learnprogramming;

public class Account {
    private String accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phone;

    public Account () {
        this("56789", 2000, "Default", "Default", 0000000000);
        System.out.println("Empty constructor called");
    }

    public Account(String accountNumber, int balance, String customerName, String email, int phone) {
        System.out.println("Constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    };

    public int getBalance() {
        return this.balance;
    };

    public String getCustomerName() {
        return this.customerName;
    };

    public String getEmail() {
        return this.email;
    };

    public int getPhone() {
        return this.phone;
    }

    public void setAccountNumber(String num) {
        this.accountNumber = num;
    };

    public void setCustomerName(String name) {
        this.customerName = name;
    };

    public void setBalance(int num) {
        this.balance = num;
    };

    public void setEmail(String email) {
        this.email = email;
    };

    public void setPhone(int num) {
        this.phone = num;
    };

    public void depositFunds(int num) {
        this.balance += num;
        System.out.println(num + " deposited into your account. Your new balance is: " + this.balance);
    };

    public void withdrawFunds(int num) {
        if(num > this.balance) {
            System.out.println("Insufficient funds. Your balance is " + this.balance);
        } else {
            this.balance -= num;
            System.out.println("Withdrawal of " + num + " processed. Remaining balance: " + this.balance);
        }
    };

}


























































