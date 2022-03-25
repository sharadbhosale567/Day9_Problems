package AddressBook;

class Address{

    private final String firstName;
    private String lastName;
    private String addresss;
    private String state;
    private int zip;
    private int number;

    Address(String firstName, String lastName, String addresss, String state, int zip, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresss = addresss;
        this.state = state;
        this.zip = zip;
        this.number = number;
    }

    public String getAddresss() {
        return addresss;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumber() {
        return number;
    }

    public String getState() {
        return state;
    }

    public int getZip() {
        return zip;
    }
}

public class AddressBooksUc2 {
    public static void main(String[] args) {
        System.out.println("1st employ");
        Address address = new Address("sharad", "bhosale", "Jalgaon",
                "maharashtra", 555555555, 888888888);
        System.out.println(address.getFirstName());
        System.out.println(address.getLastName());
        System.out.println(address.getAddresss());
        System.out.println(address.getState());
        System.out.println(address.getZip());
        System.out.println(address.getNumber());

        System.out.println("2nd employ");
        Address address2 = new Address("pawan","kkk", "dhule","maharashta",
                47474, 888888);
        System.out.println(address.getFirstName());
        System.out.println(address.getLastName());
        System.out.println(address.getAddresss());
        System.out.println(address.getState());
        System.out.println(address.getZip());
        System.out.println(address.getNumber());
    }
}
