public class CompanyCustomer extends Customer {
    String companyName;
    String companyAddress;
    int phoneNumber;
    int CRN;

    public CompanyCustomer(String firstName, String lastName, String address, int postNumber, String city, int mobileNumber, String email, int id, String companyName, String companyAddress, int phoneNumber, int CRN) {
        super(firstName, lastName, address, postNumber, city, mobileNumber, email, id);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.phoneNumber = phoneNumber;
        this.CRN = CRN;
    }

    public String toString() {
        return "CompanyCustomer{" +
                "firstname: " + getFirstName() +
                ", lastname: " + getLastName() +
                ", address: " + getAddress() +
                ", postnumber: " + getPostNumber() +
                ", city: " + getCity() +
                ", mobileNumber: " + getMobileNumber() +
                ", email: " + getEmail() +
                ", id: " + getId() +
                ", companyName: " + companyName + '\'' +
                ", companyAddress: " + companyAddress + '\'' +
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

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
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
