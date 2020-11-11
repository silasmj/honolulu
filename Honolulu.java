import java.util.Scanner;

public class Honolulu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Main Menu: ");
        System.out.println("C: Create costumer - private/Company");
        System.out.println("S: Save current data to file");
        System.out.println("I: Information about cars");
        System.out.println("Q: Quit");
        String choice = scan.next();

        while(choice.equalsIgnoreCase("Q") ) {
            if (choice.equalsIgnoreCase("C")) {
                System.out.println("Here you can create costumers");
                System.out.println("P: Private Costumers");
                System.out.println("C: Company Costumer");
            } else if (choice.equalsIgnoreCase("S")) {

            } else if (choice.equalsIgnoreCase("I")) {

            }
        }
    }

    public static void createPrivateCostumer()  {

    }
    public static void createCompanyCostumer()  {

    }


}
