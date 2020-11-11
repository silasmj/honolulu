public class companyRental extends Contract {
    String companyName;
    String companyAddress;
    int phoneNumber;
    int CRN;

    public companyRental(String companyName, String companyAddress, int phoneNumber, int CRN, int id, String fromDateAndTime, String toDateAndTime, int maxKM, int kmAtStart, int registrationNumber, String firstName, String lastName, String address, int postNumber, String city, int mobileNumber, String email) {
        super(id, fromDateAndTime, toDateAndTime, maxKM, kmAtStart, registrationNumber, firstName, lastName, address, postNumber, city, mobileNumber, email);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.phoneNumber = phoneNumber;
        this.CRN = CRN;
    }

    public String toString() {
        return "Company Rental: " +
                "\ncompanyName: " + companyName +
                "\ncompanyAddress: " + companyAddress +
                "\nphoneNumber: " + phoneNumber +
                "\nCRN: " + CRN;
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
