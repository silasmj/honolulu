import java.util.ArrayList;
import java.util.Scanner;

public class Honolulu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<PrivateCustomer> privateCustomer = new ArrayList<>();
        ArrayList<CompanyCustomer> companyCustomer = new ArrayList<>();
        ArrayList<Rental> rentals = new ArrayList<Rental>();
        mainMenu(PrivateCustomer, CompanyCustomer, rentals, scan);

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
                        createPrivateRental(scan, privateCustomer);
                        mainMenu(privateCustomer, companyCustomer, rentals, scan);

                    } else if (answer.equalsIgnoreCase("C")) {
                        //createCompanyRental(scan, companyCustomer);
                    }

                } else if (choice.equalsIgnoreCase("S")) {

                } else if (choice.equalsIgnoreCase("I")) {

                }
            }
        }


    public static void createPrivateRental(Scanner scan, ArrayList<PrivateCustomer> privateCustomer)  {
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
        System.out.println("Enter the customers License Number: ");
        int licenseNumber = scan.nextInt();
        System.out.println("Enter the date the driver got the drivers license: ");
        scan.next();
        String driverSinceDate = scan.nextLine();


        PrivateCustomer pc = new PrivateCustomer(fn, ln, address, post, city, mobileNumber, email, licenseNumber, driverSinceDate);
        privateCustomer.add(pc);

        System.out.println(pc);

    }

/*
    public static void createCompanyRental(Scanner scan, ArrayList<companyRental> companyCustomer)  {
        System.out.println("Enter First Name: ");
        String fn = scan.next();
        System.out.println("Enter Last Name: ");
        String ln = scan.next();
        System.out.println("Enter Address:");
        String add = scan.next();
        System.out.println("Enter Postnumber: ");
        int post = scan.nextInt();
        System.out.println("Enter City: ");
        String city = scan.next();
        System.out.println("Enter mobilenumber: ");
        int mn = scan.nextInt();
        System.out.println("Enter Email: ");
        String email = scan.next();

        Rental r = new Rental(fromDateAndTime, toDateAndTime, maxKM, kmAtStart, registrationNumber, fn, ln, add, post, city, mn, email);


    }

    public static int getFreePrivateID(Arraylist<Rental> privateCustomer )   {
        ArrayList<Integer> IDs = new ArrayList<Integer>();
        if (privateCustomer.size() > 0)    {
            for (int i = 0; i <= privateCustomer.size() - 1; i++)  {
                IDs.add(privateCustomer.get(i).getID());
            }
        }
        int newID = 1;

        if (IDs.size() != 0)    {
            newID = Collections.max(IDs) + 1;
        }
        return newID;
    }
    public static int getFreeCompanyID(ArrayList<rental> companyCustomer)    {
        ArrayList<Integer> IDs = new ArrayList<Integer>();
        if (companyCustomer.size() > 0)    {
            for (int i = 0; i <= companyCustomer.size() - 1; i++)  {
                IDs.add(companyCustomer.get(i).getID());
            }
        }
        int newID = 1;

        if (IDs.size() != 0)    {
            newID = Collections.max(IDs) + 1;
        }
        return newID;

    }

*/
}
