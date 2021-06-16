package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Account jpm = new Account();

        System.out.println("Account number: " + jpm.getAccountNumber());
        System.out.println("Balance: " + jpm.getBalance());
        System.out.println("Name: " + jpm.getCustomerName());
        System.out.println("Email: " + jpm.getEmail());
        System.out.println("Phone: " + jpm.getPhone());
        jpm.depositFunds(500);
        jpm.withdrawFunds(100);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Romano", 25000.00);
        System.out.println(person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("Tim", 5000.00, "tim@outlook.com");
        System.out.println(person3.getEmail());

    }
}
