public class Customer {

    private String name;
    private int phoneNo;
    private String emailAddress;

    public Customer(String name, int phoneNo, String emailAddress) {
        this.name = name; // Use "this" to refer to the class instance variable
        this.phoneNo = phoneNo;
        this.emailAddress = emailAddress;
    }

    // Getters and setters with "this" to refer to the class instance variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String toString() {
        return "Name: " + name + ", phone number: " + phoneNo + ", Email: " + emailAddress;
    }
}
