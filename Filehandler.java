import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Filehandler {
	public void readPrivateFromFile(ArrayList<PrivateCustomer> privateCustomer)	{
		ArrayList<PrivateCustomer> tempArray = new ArrayList<PrivateCustomer>();
		
		try {
			File privateFile = new File("privateData.txt");
			Scanner myReader = new Scanner(privateFile);
			while(myReader.hasNextLine())	{
				String fn = myReader.next();
				String ln = myReader.next();
				String sn = myReader.next();
				int hn = myReader.nextInt();
				int post = myReader.nextInt();
				String city = myReader.next();
				int mn = myReader.nextInt();
				String email = myReader.next();
				int id = myReader.nextInt();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		for(int i = 0; i <= tempArray.size() - 1; i++)	{
			privateCustomer.add(tempArray.get(i));
		}
	}
		
    public void readCompanyFromFile()	{
    	ArrayList<CompanyCustomer> tempArray = new ArrayList<CompanyCustomer>();
    	
    }
    public void readRentalFromFile(ArrayList<Rental> rentals)	{
		ArrayList<Rental> tempArray = new ArrayList<Rental>();

		try {
			File rentalFile = new File("rentalData.txt");
			Scanner myReader = new Scanner(rentalFile);
			while(myReader.hasNextLine())	{
				String make = myReader.next();
				String model = myReader.next();
				String type = myReader.next();
				int id = myReader.nextInt();
				String fromDate = myReader.next();
				String toDate = myReader.next();
				int maxKM = myReader.nextInt();
				int kmAtStart = myReader.nextInt();
				String registrationNumber = myReader.next();
			}
			myReader.close();
		}catch (FileNotFoundException e)	{
			e.printStackTrace();
		}
		for (int i = 0; i <= tempArray.size() - 1; i++){
			rentals.add(tempArray.get(i));
		}
	}
    public void writePrivateToFile(ArrayList<PrivateCustomer> privateCustomer)	{
		try	{
			FileWriter clearFile = new FileWriter("privateData.txt", false);
			clearFile.write("");

			FileWriter myWriter = new FileWriter("privateData.txt, true");
				for (int i = 0; i <= privateCustomer.size() - 1; i++)	{
					myWriter.write(privateCustomer.get(i).getFirstName() + " " + privateCustomer.get(i).getLastName() + " " + privateCustomer.get(i).getStreetName() +" " + privateCustomer.get(i).getHouseNumber() + " " + privateCustomer.get(i).getPostNumber() + " " + privateCustomer.get(i).getCity() + " " + privateCustomer.get(i).getMobileNumber() + " " + privateCustomer.get(i).email + " " + privateCustomer.get(i).getId() + " " + privateCustomer.get(i).licenseNumber + " " + privateCustomer.get(i).getDriverSinceDate());
					if (i != privateCustomer.size() -1)	{
						myWriter.write("\n");
					}
				}
		}catch (IOException e)	{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
    	
    }
    public void writeCompanyToFile()	{
    	
    }
    public void writeRentalToFile(ArrayList<Rental> rentals)	{
		try {
			FileWriter clearFile = new FileWriter("rentalData.txt", false);
			clearFile.write(" ");

			FileWriter myWriter = new FileWriter("rentalData.txt", true);
				for (int i = 0; i <= rentals.size() - 1; i++)	{
					myWriter.write(rentals.get(i).getMake() + " " + rentals.get(i).getModel() + " " + rentals.get(i).getType() + " " + rentals.get(i).getId() + " " + rentals.get(i).getFromDate() + " " + rentals.get(i).getToDate() + " " + rentals.get(i).getMaxKM() + " " + rentals.get(i).getKmAtStart() + " " + rentals.get(i).getRegistrationNumber());
					if(i != rentals.size() - 1)	{
						myWriter.write("\n");
					}
				}
		}catch(IOException e)	{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}