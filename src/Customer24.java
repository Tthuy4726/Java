public class Customer24 {

    private int id;
    private String name;
    private int discount;

    public Customer24(int id, String name, int disvount) {
        this.id = id;
        this.name = name;
        this.discount = disvount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDisvount() {
        return discount;
    }

    public void setDisvount(int disvount) {
        this.discount = disvount;
    }

    public String toString() {
        return id + "( " + id + ") Discount" + discount + "%";
    }


}
