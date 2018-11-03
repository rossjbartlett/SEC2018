import java.util.ArrayList;

public class Demo {
	
	public static void main(String [] args) {
		
		Bus.setCapacity(10); // TODO set this via GUI input
		
		float expenseCost = 0;
		
		
		
		
		BusRoute [] routes = new BusRoute[3];
		for(int i = 0; i < 3; i++) {
			routes[i] = new BusRoute();
		}
		
		String filename = "first_test_spaces.txt";
		
		ReadInputFile reader = new ReadInputFile(filename);
		
		ArrayList<InputLine> inputLines = reader.readLines();
		
		int lineCount = 0;
		//System.out.println("Printing lines read:");
		for(InputLine line : inputLines) {
			//TODO remove this print for testing
			line.printInputLine();
			
			
			//now process each input line into the system
			System.out.println("Route "+lineCount);
			BusRoute route = routes[lineCount];
			route.AddToRoute(line);
			System.out.println("Buses needed: "+route.numBuses);
			System.out.println("\n");
		
			
			lineCount = (lineCount+1)%3;
		}
		
		for(BusRoute route : routes) {
			expenseCost += route.getRouteCost(); // cost to operate per block
			expenseCost -= route.totalPplServed * Bus.getTicketCost(); //subtract ticket revenue 

		}
		
		
		
	}

}
