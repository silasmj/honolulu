public class PrivateCustomer extends Customer {
    int licenseNumber;
    String driverSinceDate;

    public PrivateCustomer(String firstName, String lastName, String address, int postNumber, String city, int mobileNumber, String email, int licenseNumber, String driverSinceDate) {
        super(firstName, lastName, address, postNumber, city, mobileNumber, email);
        this.licenseNumber = licenseNumber;
        this.driverSinceDate = driverSinceDate;
    }

    public String toString() {
        return "PrivateCustomer{" +
                "licenseNumber=" + licenseNumber +
                ", driverSinceDate='" + driverSinceDate + '\'' +
                '}';
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getDriverSinceDate() {
        return driverSinceDate;
    }

    public void setDriverSinceDate(String driverSinceDate) {
        this.driverSinceDate = driverSinceDate;
    }
}
