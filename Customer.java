public class Customer {
    String firstName;
    String lastName;
    String address;
    int postNumber;
    String city;
    int mobileNumber;
    String email;

    public Customer(String firstName, String lastName, String address, int postNumber, String city, int mobileNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.postNumber = postNumber;
        this.city = city;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }

    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", postNumber=" + postNumber +
                ", city='" + city + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}