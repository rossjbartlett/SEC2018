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
		Scanner scanner;
		try {
			scanner = new Scanner(new File(filename));
			int stopx, stopy, destx, desty, numPpl;
			while(scanner.hasNextInt())
			{
			     stopx = scanner.nextInt();
			     stopy = scanner.nextInt();
			     destx = scanner.nextInt();
			     desty = scanner.nextInt();
			     numPpl = scanner.nextInt();
			     
			     InputLine line = new InputLine(stopx, stopy, destx, desty, numPpl);
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
