public class IndividualCustomer extends Customer{
    private String firstName;
    private String lastName;
    private String identityNo;

    public IndividualCustomer() {
    }

    public IndividualCustomer(int id, String customerNo, Canal canal,String firstName, String lastName, String identityNumber) {
        super(id, customerNo, canal);
        this.setFirstName(getFirstName());
        this.setLastName(getLastName());
        this.setIdentityNo(getIdentityNo());
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo;
    }
}
