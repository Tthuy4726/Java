public class Invoice24 {

    private int id;
    private Customer24 Customer24;
    private double amount;

    public Invoice24(int id, Customer24 Customer24, double amount) {
        this.id = id;
        this.Customer24 = Customer24;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer24 getCustomer() {
        return Customer24;
    }

    public void setCustomer(Customer24 customer) {
        this.Customer24 = Customer24;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return Customer24.getId();
    }

    public String getCustomerName() {
        return Customer24.getName();
    }

    public int getCustomerDiscount() {
        return Customer24.getDisvount();
    }

    public double getAmoubtAfterDiscount() {
        return amount - (amount * Customer24.getDisvount() / 100.0);
    }

    public String toString() {
        return "Invoice[id=" + id + ", customer=" + Customer24.toString() + ", amount=" + amount + "]";
    }

}
