public class CompanyCustomer extends Customer {
    String companyName;
    int phoneNumber;
    int CRN;

    public CompanyCustomer(String firstName, String lastName, String streetName, int houseNumber, int postNumber, String city, int mobileNumber, String email, int id, String companyName, String companyAddress, int phoneNumber, int CRN) {
        super(firstName, lastName, streetName, houseNumber, postNumber, city, mobileNumber, email, id);
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.CRN = CRN;
    }
    public CompanyCustomer()    {
        super();
    }

    public String toString() {
        return "CompanyCustomer{" +
                "firstname: " + getFirstName() +
                ", lastname: " + getLastName() +
                ", street name: " + getStreetName() +
                ", house number: " + getHouseNumber() +
                ", postnumber: " + getPostNumber() +
                ", city: " + getCity() +
                ", mobileNumber: " + getMobileNumber() +
                ", email: " + getEmail() +
                ", id: " + getId() +
                ", companyName: " + companyName + '\'' +
                ", phoneNumber: " + phoneNumber +
                ", CRN: " + CRN +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getCRN() {
        return CRN;
    }

    public void setCRN(int CRN) {
        this.CRN = CRN;
    }
}
