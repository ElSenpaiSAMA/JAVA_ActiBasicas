public class Customer {
    private int CustomerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        CustomerId = customerId;
        this.name = name;
        this.email = email;
    }
    public int getCustomerId() {
        return CustomerId;
    }
    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
