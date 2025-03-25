
public class Customer extends Person {

    private String customerNumber;
    private boolean mailList;


    public Customer(String name, String address,
                    String phone, String customerNumber, boolean mailList ){
        super( name, address, phone);
        this.customerNumber = customerNumber;
        this.mailList = mailList;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }

    public boolean getMailList() {
        return mailList;
    }
}
