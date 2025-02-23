public class InvoiceItem {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setters
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to calculate total price
    public double getTotal() {
        return quantity * unitPrice;
    }

    // toString method
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", description=" + description + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
    }
}
