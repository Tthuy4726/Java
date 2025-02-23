public class Account25{
    private int id;
    private Customer25 customer25;
    private double balance;

    public Account25(int id, Customer25 customer25, double balance) {
        this.id = id;
        this.customer25 = customer25;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer25 getCustomer() {
        return customer25;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to return customer name
    public String getCustomerName() {
        return customer25.getName();
    }

    public Account25 credit(double amount) {
        balance += amount;
        return this;
    }


        public Account25 debit(double amount){
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance!");
            }
            return this;
        }
    }
