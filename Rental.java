public class Rental {
    String make;
    String model;
    String type;
    int id;
    String fromDate;
    String toDate;
    int maxKM;
    int kmAtStart;
    String registrationNumber;

    public Rental(String make, String model, String type, int id, String fromDate, String toDate, int maxKM, int kmAtStart, String registrationNumber) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.id = id;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.maxKM = maxKM;
        this.kmAtStart = kmAtStart;
        this.registrationNumber = registrationNumber;
    }

    public Rental() {
    }

    public String toString() {
        return "Rental{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", maxKM=" + maxKM +
                ", kmAtStart=" + kmAtStart +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public int getMaxKM() {
        return maxKM;
    }

    public void setMaxKM(int maxKM) {
        this.maxKM = maxKM;
    }

    public int getKmAtStart() {
        return kmAtStart;
    }

    public void setKmAtStart(int kmAtStart) {
        this.kmAtStart = kmAtStart;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
