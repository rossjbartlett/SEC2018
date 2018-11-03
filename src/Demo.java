import java.util.ArrayList;

public class Demo {
	
	public static void main(String [] args) {
		
		String filename = "first_test_spaces.txt";
		
		ReadInputFile reader = new ReadInputFile(filename);
		
		ArrayList<InputLine> inputLines = reader.readLines();
		
		System.out.println("Printing lines read:");
		for(InputLine line : inputLines) {
			//TODO remove this print for testing
			line.printInputLine();
			
			//now process each input line into the system
		}
		
	}

}
