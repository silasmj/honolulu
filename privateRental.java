public class privateRental extends Contract {
    int licenseNumber;
    String driverSinceDate;

    public privateRental(int licenseNumber, String driverSinceDate, int id, String fromDateAndTime, String toDateAndTime, int maxKM, int kmAtStart, int registrationNumber, String firstName, String lastName, String address, int postNumber, String city, int mobileNumber, String email) {
        super(id, fromDateAndTime, toDateAndTime, maxKM, kmAtStart, registrationNumber, firstName, lastName, address, postNumber, city, mobileNumber, email);
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
