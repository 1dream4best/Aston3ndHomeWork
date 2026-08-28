    //Builder
    public class Order {

        private final int id;
        private final String product;
        private final double price;
        private final String customer;
        private final String paymentMethod;

        private Order(Builder builder) {
            this.id = builder.id;
            this.product = builder.product;
            this.price = builder.price;
            this.customer = builder.customer;
            this.paymentMethod = builder.paymentMethod;
        }

        public int getId() {
            return id;
        }

        public String getProduct() {
            return product;
        }

        public double getPrice() {
            return price;
        }

        public String getCustomer() {
            return customer;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        @Override
        public String toString() {
            return "Order{" + "id=" + id + ", product='" + product + '\'' +
                    ", price=" + price + ", customer='" + customer + '\'' +
                    ", paymentMethod='" + paymentMethod + '\'' + '}';
        }

        public static class Builder {

            private int id;
            private String product;
            private double price;
            private String customer;
            private String paymentMethod;

            public Builder setId(int id) {
                this.id = id;
                return this;
            }

            public Builder setProduct(String product) {
                this.product = product;
                return this;
            }

            public Builder setPrice(double price) {
                this.price = price;
                return this;
            }

            public Builder setCustomer(String customer) {
                this.customer = customer;
                return this;
            }

            public Builder setPaymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }

            public Order build() {
                return new Order(this);
            }
        }
    }
