public class Contract {
    int id;
    String fromDateAndTime;
    String toDateAndTime;
    int maxKM;
    int kmAtStart;
    int registrationNumber;

    public Contract(int id, String fromDateAndTime, String toDateAndTime, int maxKM, int kmAtStart, int registrationNumber) {
        this.id = id;
        this.fromDateAndTime = fromDateAndTime;
        this.toDateAndTime = toDateAndTime;
        this.maxKM = maxKM;
        this.kmAtStart = kmAtStart;
        this.registrationNumber = registrationNumber;
    }

    public String toString() {
        return "Contract: " +
                "\nid: " + id +
                "\nfromDateAndTime: " + fromDateAndTime +
                "\ntoDateAndTime: " + toDateAndTime +
                "\nmaxKM: " + maxKM +
                "\nkmAtStart: " + kmAtStart +
                "\nregistrationNumber: " + registrationNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFromDateAndTime() {
        return fromDateAndTime;
    }

    public void setFromDateAndTime(String fromDateAndTime) {
        this.fromDateAndTime = fromDateAndTime;
    }

    public String getToDateAndTime() {
        return toDateAndTime;
    }

    public void setToDateAndTime(String toDateAndTime) {
        this.toDateAndTime = toDateAndTime;
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

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
