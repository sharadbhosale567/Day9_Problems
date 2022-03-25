package AddressBook;

class CompanyInfo {
    String company = "Empoyee information";
    private String firstName;
    private String lastName;
    private String address;
    private String state;
    private long zip;
    private long phoneNumber;

    public void employee1(String firstName , String lastName, String address,
                              String state, long zip,  long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "company='" + company + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
public class AddressBookUc444 {
    public static void main(String[] args) {
        CompanyInfo ci = new CompanyInfo();

        System.out.println("Choose 1 : To Add a contact");
        System.out.println("Choose 1 : To Edit a contact");
        System.out.println("Choose 1 : To Delete a contact");
        System.out.println("Choose 1 : To Exit ");
    }
}
