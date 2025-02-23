public class Book23 {
    public static class Author {
        private String name;
        private String email;

        public Author(String name, String email) {
            this.name = name;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail() {
            this.email = email;
        }

        public String toString() {
            return "[ name=" + name + ", email=" + email + "]";
        }
    }

    public static class Book {
        private String isbn;
        private String name;
        private Author author;
        private double price;
        private int qty;


        public Book(String isbn, String name, Author author, double price) {
            this.isbn = isbn;
            this.name = name;
            this.author = author;
            this.price = price;
        }

        public Book(String isbn, String name, double price, int qty) {
            this.isbn = isbn;
            this.name = name;
            this.price = price;
            this.qty = 0;
        }

        public String getIsbn() {
            return isbn;
        }

        public String getName() {
            return name;
        }

        public Author getAuthor() {
            return author;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQty() {
            return qty;
        }

        public void setQty(int qty) {
            this.qty = qty;
        }

        public String getAuthorName() {
             return author.getName();
        }

        public String toString() {
            return "Book[isbn=" + isbn  + ",name=" + name + ",Author[name" + getAuthorName() + ",price=" + price + "]";

        }
    }

}
