public class Address {
    private int id;
    private String address;
    private Customer customer;

    public Address() {
    }

    public Address(int id, String address, Customer customer) {
        this.setId(id);
        this.setAddress(address);
        this.setCustomer(customer);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
