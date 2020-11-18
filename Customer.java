public class Customer {
    String firstName;
    String lastName;
    String streetName;
    int houseNumber;
    int postNumber;
    String city;
    int mobileNumber;
    String email;
    int id;

    public Customer(String firstName, String lastName, String streetName, int houseNumber, int postNumber, String city, int mobileNumber, String email, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postNumber = postNumber;
        this.city = city;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.id = id;
    }

    public Customer() {
    }

    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", housenumber='" + houseNumber +
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

    public String getStreetName() {
        return streetName;
    }
    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber)    {
        this.houseNumber = houseNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
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
    public int getId() {
         return id;
    }
    public void setId(int id)  {
         this.id = id;
    }

}
