package AddressBook;

class AddressBookEmploy1 {
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private long zip;
    private long phoneNumber;

    public AddressBookEmploy1(String firstName , String lastName, String address,
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
class AddressBookEmploy2 {
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private long zip;
    private long phoneNumber;

    public AddressBookEmploy2(String firstName , String lastName, String address,
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

public class AddressBookUcccc {
    public static void main(String[] args) {

        AddressBookEmploy1 employ1 = new AddressBookEmploy1("sharad", "Bhosale",
                "At post Jalgaon", "Maharashtra", 424105, 7387232500l);

        System.out.println(employ1.getFirstName());
        System.out.println(employ1.getLastName());
        System.out.println(employ1.getAddress());
        System.out.println(employ1.getState());
        System.out.println(employ1.getZip());
        System.out.println(employ1.getPhoneNumber());

        AddressBookEmploy2 employ2 = new AddressBookEmploy2("Pawan", "Patil", "At post dhule",
                "Maharashtra", 424105,999999999);
        System.out.println(employ2.getFirstName());
        System.out.println(employ2.getLastName());
        System.out.println(employ2.getAddress());
        System.out.println(employ2.getState());
        System.out.println(employ2.getZip());
        System.out.println(employ2.getPhoneNumber());
    }
}
