public class companyRental {
    String companyName;
    String companyAddress;
    int phoneNumber;
    int CRN;

    public companyRental(String companyName, String companyAddress, int phoneNumber, int CRN) {
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
