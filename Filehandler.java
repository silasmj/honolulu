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
    public void writePrivateToFile(ArrayList<PrivateCustomer> privateCustomer)	{
		try	{
			FileWriter clearFile = new FileWriter("privateData.txt", false);
			clearFile.write("");

			FileWriter myWriter = new FileWriter("privateData.txt, true");
				for (int i = 0; i <= privateCustomer.size() - 1; i++)	{
					myWriter.write(privateCustomer.get(i).getFirstName() + " " + privateCustomer.get(i).getLastName() + " " + privateCustomer.get(i).getAddress() + " " + privateCustomer.get(i).getPostNumber() + " " + privateCustomer.get(i).getCity() + " " + privateCustomer.get(i).getMobileNumber() + " " + privateCustomer.get(i).email + " " + privateCustomer.get(i).getId() + " " + privateCustomer.get(i).licenseNumber + " " + privateCustomer.get(i).getDriverSinceDate());
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
}