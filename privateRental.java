public class privateRental {
    int licenseNumber;
    String driverSinceDate;

    public privateRental(int licenseNumber, String driverSinceDate) {
        this.licenseNumber = licenseNumber;
        this.driverSinceDate = driverSinceDate;
    }

    public String toString() {
        return "privateRental: " +
                "\nlicenseNumber: " + licenseNumber +
                "\ndriverSinceDate: " + driverSinceDate;
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
