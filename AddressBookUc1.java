package AddressBook;

class AddressBookEmploy {
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private long zip;
    private long phoneNumber;

    public AddressBookEmploy(String firstName , String lastName, String address,
                            String state, long zip,  long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public long getZip() {
        return zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}

public class AddressBookUc1 {
    public static void main(String[] args) {

        AddressBookEmploy address = new AddressBookEmploy("sharad", "Bhosale",
                "At post Jalgaon", "Maharashtra", 424105, 7387232500l);
        System.out.println(address.getFirstName());
        System.out.println(address.getLastName());
        System.out.println(address.getAddress());
        System.out.println(address.getState());
        System.out.println(address.getZip());
        System.out.println(address.getPhoneNumber());
    }
}
