import java.util.ArrayList;

public class BusRoute {

	int pathLength;
	final float COST_PER_BLOCK = 5;
	private ArrayList<BusStop> path;
	//	private ArrayList<BusStop> route;
	//private ArrayList<Bus> busses;
	int numBuses=0;
	int totalPplServed = 0;


	public BusRoute() {
		path = new ArrayList<>();
		path.add(new BusStop(0, 0 ));// starting point 
	}


	//getters and setters

	public void AddToRoute(InputLine line) {
		System.out.println("HERE1");

		BusStop pickupStop = new BusStop(line.stopx, line.stopy);
		BusStop destStop = new BusStop(line.destx, line.desty);

		totalPplServed += line.numPpl;

		//if not enough buses, add another bus
		while(line.numPpl > (Bus.getCapacity() * numBuses)) {
			numBuses++;
		}
		
		System.out.println("Heading to pickup location");
		getToStop(pickupStop);
		System.out.println("Picked up people");
		getToStop(destStop);
		System.out.println("Dropped off people");

	}

	private void getToStop(BusStop destStop) {

		int curx = path.get(path.size()-1).getX(); 
		int cury = path.get(path.size()-1).getY();

		while(curx != destStop.getX()) {
			if (destStop.getX() > curx) curx ++;
			else curx--;
			BusStop b = new BusStop(curx, cury);
			path.add(b);
			pathLength++;
			System.out.println("Passed intersection: "+b.toString());
		}
		while(cury != destStop.getY()) {
			if (destStop.getY() > cury) cury ++;
			else cury--;

			BusStop b = new BusStop(curx, cury);
			path.add(b);
			pathLength++;
			System.out.println("Passed intersection: "+b.toString());
		}
	}



	public ArrayList<BusStop> getStops() {
		return path;
	}

	public void setStops(ArrayList<BusStop> stops) {
		this.path = stops;
	}
	
	public float getRouteCost() {
		return pathLength * COST_PER_BLOCK * numBuses;
	}



}
