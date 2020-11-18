import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Honolulu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<PrivateCustomer> privateCustomer = new ArrayList<>();
        ArrayList<CompanyCustomer> companyCustomer = new ArrayList<>();
        ArrayList<Rental> rentals = new ArrayList<>();
        mainMenu(privateCustomer, companyCustomer, rentals, scan);

    }

    public static void mainMenu (ArrayList<PrivateCustomer> privateCustomer, ArrayList<CompanyCustomer> companyCustomer, ArrayList<Rental> rentals, Scanner scan) {
            System.out.println("Main Menu: ");
            System.out.println("C: Create Customer - private/Company");
            System.out.println("S: Save current data to file");
            System.out.println("I: Information about cars");
            System.out.println("Q: Quit");
            String choice = scan.next();

            while (!choice.equalsIgnoreCase("Q")) {
                if (choice.equalsIgnoreCase("C")) {
                    System.out.println("Here you can create a customer");
                    System.out.println("P: Private Costumers");
                    System.out.println("C: Company Costumer");
                    String answer = scan.next();
                    if (answer.equalsIgnoreCase("P")) {
                        createPrivateCustomer(scan, privateCustomer);
                        mainMenu(privateCustomer, companyCustomer, rentals, scan);

                    } else if (answer.equalsIgnoreCase("C")) {
                        createCompanyCustomer(scan, companyCustomer);
                    }

                } else if (choice.equalsIgnoreCase("S")) {

                } else if (choice.equalsIgnoreCase("I")) {

                }
            }
        }


    public static void createPrivateCustomer(Scanner scan, ArrayList<PrivateCustomer> privateCustomer)  {
        System.out.println("Enter First Name: ");
        String fn = scan.next();
        System.out.println("Enter Last Name: ");
        String ln = scan.next();
        System.out.println("Enter the Street name: ");
        String sn = scan.next();
        System.out.println("Enter your house number: ");
        int hn = scan.nextInt();
        System.out.println("Enter Post number: ");
        int post = scan.nextInt();
        System.out.println("Enter City: ");
        String city = scan.next();
        System.out.println("Enter mobile number: ");
        int mobileNumber = scan.nextInt();
        System.out.println("Enter Email: ");
        String email = scan.next();
        System.out.println("Enter valid ID: ");
        int id = scan.nextInt();
        for (int i = 0; i <= privateCustomer.size() - 1; i++)  {
            while(id == privateCustomer.get(i).getId()) {
                System.out.println("ID already used, enter a new: ");
                id = scan.nextInt();
            }
        }
        System.out.println("Enter the customers License Number: ");
        int licenseNumber = scan.nextInt();
        System.out.println("Enter the date the driver got the drivers license (Example: 01/01/2020): ");
        String driverSinceDate = scan.next();


        PrivateCustomer pc = new PrivateCustomer(fn, ln, sn, hn, post, city, mobileNumber, email, id, licenseNumber, driverSinceDate);
        privateCustomer.add(pc);

        System.out.println(pc);

    }
    public static void createCompanyCustomer(Scanner scan, ArrayList<CompanyCustomer> companyCustomer)  {
        System.out.println("Enter First Name: ");
        String fn = scan.next();
        System.out.println("Enter Last Name: ");
        String ln = scan.next();
        System.out.println("Enter street name:");
        String sn = scan.next();
        System.out.println("Enter house number: ");
        int hn = scan.nextInt();
        System.out.println("Enter Postnumber: ");
        int post = scan.nextInt();
        System.out.println("Enter City: ");
        String city = scan.next();
        System.out.println("Enter mobilenumber: ");
        int mobileNumber = scan.nextInt();
        System.out.println("Enter Email: ");
        String email = scan.next();
        System.out.println("Enter valid ID: ");
        int id = scan.nextInt();
        for (int i = 0; i <= companyCustomer.size() - 1; i++)  {
            while(id == companyCustomer.get(i).getId()) {
                System.out.println("ID already used, enter a new: ");
                id = scan.nextInt();
            }
        }
        System.out.println("Enter the name of the company: ");
        scan.next();
        String companyName = scan.nextLine();
        System.out.println("Enter the address of the company: ");
        scan.next();
        String companyAddress = scan.nextLine();
        System.out.println("Enter the phone number of the company: ");
        int phoneNumber = scan.nextInt();
        System.out.println("Enter the CRN number of the company: ");
        int CRN = scan.nextInt();

        CompanyCustomer cc = new CompanyCustomer(fn, ln, sn, hn, post, city, mobileNumber, email, id, companyName, companyAddress, phoneNumber, CRN);
        companyCustomer.add(cc);

        System.out.println(cc);
    }
    
    public static void createRental(ArrayList<Rental> rentals, Scanner scan) {
         System.out.println("Enter the make of the car you want to rent:");
         String make = scan.next();
         System.out.println("Enter the model of the car you want to rent: ");
         String model = scan.next();
         System.out.println("Enter the type of the car you want to rent (Luxury, Family, Sport): ");
         String type = scan.next();
         System.out.println("Enter the id of the customer: ");
         int id = scan.nextInt();
         System.out.println("Enter the date you want to start the rent (Example: 01/01/2020): ");
         String fromDate = scan.nextLine();
         System.out.println("Enter the date you want to end the rent (Example: 31/12/2020):");
         String toDate = scan.nextLine();
         System.out.println("Enter the max amount of KM, you will drive: ");
         int maxKM = scan.nextInt();
         System.out.println("Enter the KM shown at the speed indicator: ");
         int kmAtStart = scan.nextInt();
         System.out.println("Enter the registration number, of the car: ");
         String registrationNumber = scan.next();
         
         Rental r = new Rental(make, model, type, id, fromDate, toDate, maxKM, kmAtStart, registrationNumber);
         rentals.add(r);
         
         System.out.println(r);
    
    }

    public static void editPrivateCustomer(Scanner scan, ArrayList<PrivateCustomer> privateCustomer, ArrayList<CompanyCustomer> companyCustomer, ArrayList<Rental> rentals)    {
        PrivateCustomer tempPriv = new PrivateCustomer();
        int indexNumber = 0;

        System.out.println("Enter the ID on the private customer you want to edit: ");
        int selectedID = scan.nextInt();
        for (int i = 0; i <= privateCustomer.size() - 1; i++){
            if (privateCustomer.get(i).getId() == selectedID)   {
                tempPriv = privateCustomer.get(i);
                indexNumber = i;
            }
        }

        System.out.println("Change the firstname from: " + tempPriv.getFirstName() + ", to: ");
        String newfirstName = scan.next();
        if (!newfirstName.equalsIgnoreCase("0"))    {
            tempPriv.setFirstName(newfirstName);
        }
        System.out.println("Change the lastname from: " + tempPriv.getLastName() + ", to: ");
        String newlastName = scan.next();
        if (!newlastName.equalsIgnoreCase("0")) {
            tempPriv.setLastName(newlastName);
        }
        System.out.println("Change the street name from: " + tempPriv.getStreetName() + ", to: ");
        String newStreet = scan.next();
        if (!newStreet.equalsIgnoreCase("0"))   {
            tempPriv.setStreetName(newStreet);
        }
        System.out.println("Change the house number from " + tempPriv.getHouseNumber() + ", to: " );
        int newhn = scan.nextInt();
        if (newhn != 0) {
            tempPriv.setHouseNumber(newhn);
        }
        System.out.println("Change the post number from: " + tempPriv.getPostNumber() + ", to: ");
        int newpost = scan.nextInt();
        if (newpost != 0)   {
            tempPriv.setPostNumber(newpost);
        }
        System.out.println("Change the city from: " + tempPriv.getCity() + ", to: ");
        String newCity = scan.next();
        if (!newCity.equalsIgnoreCase("0"))   {
            tempPriv.setCity(newCity);
        }
        System.out.println("Change the mobile number from: " + tempPriv.getMobileNumber() + ", to: ");
        int newmn = scan.nextInt();
        if (newmn != 0){
            tempPriv.setMobileNumber(newmn);
        }
        System.out.println("Change the email from: " + tempPriv.getEmail() + ", to: ");
        String newemail = scan.next();
        if (!newemail.equalsIgnoreCase("0"))    {
            tempPriv.setEmail(newemail);
        }
        System.out.println("Change the id from: " + tempPriv.getId() + ", to: ");
        int newid = scan.nextInt();
        if (newid != 0) {
            for (int i = 0; i <= privateCustomer.size() - 1; i++) {
                while(newid == privateCustomer.get(i).getId()) {
                    System.out.println("ID already used, enter a new: ");
                    int newid2 = scan.nextInt();
                    newid2 = newid;
                }
            }
            tempPriv.setId(newid);
        }
        System.out.println("Chance the license number from: " + tempPriv.getLicenseNumber() + ", to: ");
        int newlicense = scan.nextInt();
        if (newlicense != 0)    {
            tempPriv.setLicenseNumber(newlicense);
        }
        System.out.println("Edit the customers driver since date from: " + tempPriv.getDriverSinceDate() + ", to: ");
        String newDriverSince = scan.next();
        if (!newDriverSince.equalsIgnoreCase("0"))  {
            tempPriv.setDriverSinceDate(newDriverSince);
        }
        System.out.println("Would you confirm these changes?\n" + tempPriv + "\n Press Y: for yes \nPress N: to remake edit \nPress B: for going back to main menu");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Y")){
            privateCustomer.set(indexNumber, tempPriv);
            System.out.println("Edited private customer: \n" + privateCustomer.get(indexNumber));
        }else if (answer.equalsIgnoreCase("N")) {
            editPrivateCustomer(scan, privateCustomer, companyCustomer, rentals);
        }else if (answer.equalsIgnoreCase("B")){
            mainMenu(privateCustomer, companyCustomer, rentals, scan);
        }else{
            System.out.println("Unknown input - Returning to main menu ....");
            mainMenu(privateCustomer, companyCustomer, rentals, scan);
        }
    }

    public static void editCompanyCustomer(Scanner scan, ArrayList<PrivateCustomer> privateCustomer, ArrayList<CompanyCustomer> companyCustomer, ArrayList<Rental> rentals) {
        CompanyCustomer tempCom = new CompanyCustomer();
        int indexNumber = 0;

        System.out.println("Enter the ID on the Company customer you want to edit: ");
        int selectedID = scan.nextInt();
        for (int i = 0; i <= companyCustomer.size() - 1; i++){
            if (companyCustomer.get(i).getId() == selectedID)   {
                tempCom = companyCustomer.get(i);
                indexNumber = i;
            }
        }
        System.out.println("Change the first name from: " + tempCom.getFirstName() + ", to: ");
        String newFn = scan.next();
        if (!newFn.equalsIgnoreCase("0"))   {
            tempCom.setFirstName(newFn);
        }
        System.out.println("Change the last name from: " +tempCom.getLastName() + ", to: ");
        String newLn = scan.next();
        if (!newLn.equalsIgnoreCase("0")){
            tempCom.setLastName(newLn);
        }
        System.out.println("Change the street name from: " + tempCom.getStreetName() + ", to: ");
        String newStreet = scan.next();
        if (!newStreet.equalsIgnoreCase("0"))   {
            tempCom.setStreetName(newStreet);
        }
        System.out.println("Change the house number from " + tempCom.getHouseNumber() + ", to: " );
        int newhn = scan.nextInt();
        if (newhn != 0) {
            tempCom.setHouseNumber(newhn);
        }
        System.out.println("Change the post number from: " + tempCom.getPostNumber() + ", to: ");
        int newpost = scan.nextInt();
        if (newpost != 0)   {
            tempCom.setPostNumber(newpost);
        }
        System.out.println("Change the city from: " + tempCom.getCity() + ", to: ");
        String newCity = scan.next();
        if (!newCity.equalsIgnoreCase("0"))   {
            tempCom.setCity(newCity);
        }
        System.out.println("Change the mobile number from: " + tempCom.getMobileNumber() + ", to: ");
        int newmn = scan.nextInt();
        if (newmn != 0){
            tempCom.setMobileNumber(newmn);
        }
        System.out.println("Change the email from: " + tempCom.getEmail() + ", to: ");
        String newemail = scan.next();
        if (!newemail.equalsIgnoreCase("0"))    {
            tempCom.setEmail(newemail);
        }
        System.out.println("Change the id from: " + tempCom.getId() + ", to: ");
        int newid = scan.nextInt();
        if (newid != 0) {
            for (int i = 0; i <= companyCustomer.size() - 1; i++) {
                while(newid == companyCustomer.get(i).getId()) {
                    System.out.println("ID already used, enter a new: ");
                    int newid2 = scan.nextInt();
                    newid2 = newid;
                }
            }
            tempCom.setId(newid);

        }
        System.out.println("Change the company name from: " + tempCom.getCompanyName() + ", to: ");
        String newComName = scan.next();
        if (!newComName.equalsIgnoreCase("0")){
            tempCom.setCompanyName(newComName);
        }
        System.out.println("Change the phone number from: " + tempCom.getPhoneNumber() + ", to: ");
        int newpn = scan.nextInt();
        if (newpn != 0) {
            tempCom.setPhoneNumber(newpn);
        }
        System.out.println("Change the CRN from: " + tempCom.getCRN() + ", to: ");
        int newCRN = scan.nextInt();
        if (newCRN != 0){
            tempCom.setCRN(newCRN);
        }
        System.out.println("Would you confirm these changes?\n" + tempCom + "\n Press Y: for yes \nPress N: to remake edit \nPress B: for going back to main menu");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Y")){
            companyCustomer.set(indexNumber, tempCom);
            System.out.println("Edited Company customer: \n" + companyCustomer.get(indexNumber));
        }else if (answer.equalsIgnoreCase("N")) {
            editCompanyCustomer(scan, privateCustomer, companyCustomer, rentals);
        }else if (answer.equalsIgnoreCase("B")){
            mainMenu(privateCustomer, companyCustomer, rentals, scan);
        }else{
            System.out.println("Unknown input - Returning to main menu ....");
            mainMenu(privateCustomer, companyCustomer, rentals, scan);
        }
    }

    public static void editRental(Scanner scan, ArrayList<PrivateCustomer> privateCustomer, ArrayList<CompanyCustomer> companyCustomer, ArrayList<Rental> rentals){
        Rental tempRental = new Rental();
        int indexNumber = 0;

        System.out.println("Enter the ID on the Rental you want to edit: ");
        int selectedID = scan.nextInt();
        for (int i = 0; i <= rentals.size() - 1; i++){
            if (rentals.get(i).getId() == selectedID)   {
                tempRental = rentals.get(i);
                indexNumber = i;
            }
        }
        System.out.println("Change the make from: " + tempRental.getMake() + ", to: ");
        String newMake = scan.next();
        if (!newMake.equalsIgnoreCase("0")){
            tempRental.setMake(newMake);
        }
        System.out.println("Change the model from: " + tempRental.getModel() + ", to: ");
        String newModel = scan.next();
        if (!newModel.equalsIgnoreCase("0")){
            tempRental.setModel(newModel);
        }
        System.out.println("Change the type from: " + tempRental.getType() + ", to: ");
        String newtype = scan.next();
        if (!newtype.equalsIgnoreCase("0")){
            tempRental.setType(newtype);
        }
        System.out.println("Change the id from: " + tempRental.getId() + ", to: ");
        int newid = scan.nextInt();
        if (newid != 0){
            tempRental.setId(newid);
        }
        System.out.println("Change the start date from: " + tempRental.getFromDate() + ", to: ");
        String newStart = scan.nextLine();
        if (!newStart.equalsIgnoreCase("0")){
            tempRental.setFromDate(newStart);
        }
        System.out.println("Change the end date from: " + tempRental.getToDate() + ", to: ");
        String newEnd = scan.nextLine();
        if (!newEnd.equalsIgnoreCase("0")){
            tempRental.setToDate(newEnd);
        }
        System.out.println("Change the max KM from: " + tempRental.getMaxKM() + ", to: ");
        int newMax = scan.nextInt();
        if (newMax != 0){
            tempRental.setMaxKM(newMax);
        }
        System.out.println("Change the amount of KM shown at the speed indicator from: " + tempRental.getKmAtStart() + ", to: ");
        int newkmstart = scan.nextInt();
        if (newkmstart != 0){
            tempRental.setKmAtStart(newkmstart);
        }
        System.out.println("Change the registration number from: " + tempRental.getRegistrationNumber() + ", to: ");
        String newReg = scan.next();
        if (!newReg.equalsIgnoreCase("0")){
            tempRental.setRegistrationNumber(newReg);
        }
        System.out.println("Would you confirm these changes?\n" + tempRental + "\n Press Y: for yes \nPress N: to remake edit \nPress B: for going back to main menu");
        String answer = scan.next();
        if (answer.equalsIgnoreCase("Y")){
            rentals.set(indexNumber, tempRental);
            System.out.println("Edited Rental: \n" + rentals.get(indexNumber));
        }else if (answer.equalsIgnoreCase("N")) {
            editRental(scan, privateCustomer, companyCustomer, rentals);
        }else if (answer.equalsIgnoreCase("B")){
            mainMenu(privateCustomer, companyCustomer, rentals, scan);
        }else{
            System.out.println("Unknown input - Returning to main menu ....");
            mainMenu(privateCustomer, companyCustomer, rentals, scan);
        }
    }
}
