public class Customer71 {

    class Customer {
        private String name;
        private boolean member = false;
        private String memberType;

        public Customer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public boolean isMember() {
            return member;
        }

        public void setMember(boolean member) {
            this.member = member;
        }

        public String getMemberType() {
            return memberType;
        }

        public void setMemberType(String memberType) {
            if (member) {
                this.memberType = memberType;
            } else {
                this.memberType = null;
            }
        }

        @Override
        public String toString() {
            return "Customer[name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
        }
    }

    class DiscountRate {
        private static final double SERVICE_DISCOUNT_PREMIUM = 0.2;
        private static final double SERVICE_DISCOUNT_GOLD = 0.15;
        private static final double SERVICE_DISCOUNT_SILVER = 0.1;
        private static final double PRODUCT_DISCOUNT = 0.1;

        public static double getServiceDiscountRate(String type) {
            switch (type) {
                case "Premium": return SERVICE_DISCOUNT_PREMIUM;
                case "Gold": return SERVICE_DISCOUNT_GOLD;
                case "Silver": return SERVICE_DISCOUNT_SILVER;
                default: return 0.0;
            }
        }

        public static double getProductDiscountRate() {
            return PRODUCT_DISCOUNT;
        }
    }

    class Visit {
        private Customer customer;
        private double serviceExpense;
        private double productExpense;

        public Visit(Customer customer) {
            this.customer = customer;
        }

        public String getName() {
            return customer.getName();
        }

        public void setServiceExpense(double serviceExpense) {
            this.serviceExpense = serviceExpense;
        }

        public double getServiceExpense() {
            return serviceExpense;
        }

        public void setProductExpense(double productExpense) {
            this.productExpense = productExpense;
        }

        public double getProductExpense() {
            return productExpense;
        }

        public double getTotalExpense() {
            double serviceDiscount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType());
            double productDiscount = productExpense * DiscountRate.getProductDiscountRate();
            return (serviceExpense - serviceDiscount) + (productExpense - productDiscount);
        }

        @Override
        public String toString() {
            return "Visit[customer=" + customer + ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + ", totalExpense=" + getTotalExpense() + "]";
        }
    }
}
