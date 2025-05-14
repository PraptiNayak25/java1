public class BankCustomer {
    private String name;
    private String accountNumber;
    private int age;

    
    public BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
    }

    
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        BankCustomer customer = new BankCustomer("John Doe", "123456789", 30);

        
        customer.displayCustomerDetails();
    }
}
