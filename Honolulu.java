import java.io.File;
import java.io.FileNotFoundException;
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
        System.out.println("Enter Address:");
        scan.next();
        String address = scan.nextLine();
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
        System.out.println("Enter the customers License Number: ");
        int licenseNumber = scan.nextInt();
        System.out.println("Enter the date the driver got the drivers license (Example: 01/01/2020): ");
        String driverSinceDate = scan.next();


        PrivateCustomer pc = new PrivateCustomer(fn, ln, address, post, city, mobileNumber, email, id, licenseNumber, driverSinceDate);
        privateCustomer.add(pc);

        System.out.println(pc);

    }
    public static void createCompanyCustomer(Scanner scan, ArrayList<CompanyCustomer> companyCustomer)  {
        System.out.println("Enter First Name: ");
        String fn = scan.next();
        System.out.println("Enter Last Name: ");
        String ln = scan.next();
        System.out.println("Enter Address:");
        scan.next();
        String address = scan.nextLine();
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

        CompanyCustomer cc = new CompanyCustomer(fn, ln, address, post, city, mobileNumber, email, id, companyName, companyAddress, phoneNumber, CRN);
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
         System.out.println("Enter the date and time you want to start the rent (Example: 01/01/2020 16:00): ");
         scan.next();
         String fromDateAndTime = scan.nextLine();
         System.out.println("Enter the date and time you want to end the rent (Example: 31/12/2020 20:00):");
         scan.next();
         String toDateAndTime = scan.nextLine();
         System.out.println("Enter the max amount of KM, you will drive: ");
         int maxKM = scan.nextInt();
         System.out.println("Enter the KM shown at the speed indicator: ");
         int kmAtStart = scan.nextInt();
         System.out.println("Enter the registration number, of the car: ");
         String registrationNumber = scan.next();
         
         Rental r = new Rental(make, model, type, id, fromDateAndTime, toDateAndTime, maxKM, kmAtStart, registrationNumber);
         rentals.add(r);
         
         System.out.println(r);
    
    }


   }
