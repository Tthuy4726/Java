public class Book22 {
    public static class Author {

        private String name;
        private String email;
        public char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public char getGender() {
            return gender;
        }

        public String toString() {
            return name + " " + email + " " + gender;
        }
    }

    public static class Book {
        private String name;
        private Author[] authors;
        private double price;
        private int qty;

        public Book(String name, Author[] authors, double price, int qty) {
            this.name = name;
            this.authors = authors;
            this.price = price;
            this.qty = qty;
        }

        public String getName() {
            return name;
        }

        public Author[] getAuthors() {
            return authors;
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

        public String getAuthorNames() {
            StringBuilder sc = new StringBuilder();
            for (int i = 0; i < authors.length; i++) {
                sc.append(authors[i].getName());
                if (i < authors.length - 1) {
                    sc.append(", ");
                }
            }
                return sc.toString();
            }

            public String toString() {
                StringBuilder scc = new StringBuilder();
                for(Author author : authors) {
                    scc.append(author.toString()).append(", ");
                }
                return "Book[name" + name + ", authors={" + scc.substring(0, scc.length() - 2) + "}, price=" + price + ",pty=" + qty + "]";
            }
        }
    }

