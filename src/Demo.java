import java.util.ArrayList;

public class Demo {
	
	String filename;
	BusRoute [] routes;
	float expenseCost = 0;

	
	public Demo(String f) {
		filename = f;
	}
	
	public BusRoute[] runDemo() {

//		Bus.setCapacity(10); // TODO set this via GUI input
		
//		Bus.setTicketCost(2); // TODO set this via GUI input
		
		routes = new BusRoute[3];
		for(int i = 0; i < 3; i++) {
			routes[i] = new BusRoute();
		}
		
//		String filename = "first_test_spaces.txt";
		
		ReadInputFile reader = new ReadInputFile(filename);
		
		ArrayList<InputLine> inputLines = reader.readLines();
		
		sortInput(inputLines);
		
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
			System.out.println("Path length of this route: "+route.pathLength);
		}
		
		System.out.println("expense cost: "+expenseCost);
		return routes;
	}

	private void sortInput(ArrayList<InputLine> inputLines) {
		for(int i=1,j; i<inputLines.size(); i++) {
			InputLine tmp = inputLines.get(i);
			for(j=i; j>0 && tmp.distanceFromStart < inputLines.get(j-1).distanceFromStart; j--) {
				inputLines.set(j, inputLines.get(j-1));
			}
			inputLines.set(j, tmp);
		}
		
	}
	
	/* //test
	public static void main(String [] args) {
		Demo d = new Demo();
		d.runDemo();
	}
	*/

}
