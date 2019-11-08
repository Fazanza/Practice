import java.io.*;
import java.util.Scanner;

public class Extensions {
	
	//creates a file
	public void fileCreate(String x) {
		//using a try & catch method to first try the code and then catch the exception in a understandable language
		File journal = new File(x);
		try {
			if (journal.createNewFile())
				System.out.printf("File %s has been created", journal.getName());
			else 
				System.out.printf("File %s exists at location %s", journal.getName(), x);
			}
	//catches
	catch (IOException e) {
		System.out.println("An exception has occured");
		e.printStackTrace();
		}
	}
	
	public void fileRead(String x) {
		File journal = new File(x);
		try {
			Scanner readFile = new Scanner(journal);
			System.out.println();
			System.out.print("Whats inside the journal currently:");
			while (readFile.hasNext()) {
				String data = readFile.next();
				System.out.print(data + " ");
			}
			//closes the scanner
			readFile.close();
		}
			catch (IOException e) {
			System.out.println("An exception has occured");
			e.printStackTrace();
		}
	}
	
	public void fileWrite(String x) {
		System.out.println();
		try {
			FileWriter myWriter = new FileWriter(x);
			System.out.print("Write what you want inside of the notebook");
			Scanner input = new Scanner(System.in);
			String info = input.nextLine();
			myWriter.write(info);
			myWriter.close();
			input.close();
		}
		catch (IOException e) {
			System.out.println("An exception has occured");
			e.printStackTrace();
		}
	}
	
}
