import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class ReadInputFile {

	
	private String filename;
	private ArrayList<InputLine> inputLines;
	

	public ReadInputFile(String filename) {
		this.filename = filename;
	}
	
	public ArrayList<InputLine> readLines() {
		inputLines = new ArrayList<>();

		Scanner scanner;

		try {
			scanner = new Scanner(new File(filename));
			scanner.useDelimiter("\\D"); // use non-digits as a delim

			int stopx, stopy, destx, desty, numPpl;
			while(scanner.hasNextLine())
			{
			     stopx = scanner.nextInt();
			     stopy = scanner.nextInt();
			     destx = scanner.nextInt();
			     desty = scanner.nextInt();
			     numPpl = scanner.nextInt();
			     
			     InputLine line = new InputLine(stopx, stopy, destx, desty, numPpl);
			     //TODO remove this print for testing
			     //System.out.print("read line: "); line.printInputLine();
			     inputLines.add(line);
			}
			scanner.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inputLines;
	}
	
	
	
	
	

}
