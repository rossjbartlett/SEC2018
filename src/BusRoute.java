import java.util.ArrayList;

public class BusRoute {
	
	private ArrayList<BusStop> stops;
	private ArrayList<BusStop> route;
	private ArrayList<Bus> busses;
	

	public BusRoute() {
		stops = new ArrayList<>();
		stops.add(new BusStop(0, 0));// starting point 
	}
	
	
	//getters and setters
	public ArrayList<Bus> getBusses() {
		return busses;
	}
	
	public void AddToRoute(InputLine line) {
		BusStop pickupStop = new BusStop(line.stopx, line.stopy);
		BusStop destStop = new BusStop(line.destx, line.desty);
		
		//if not enuff buses, add another bus
		//if(line.numPpl > (BUS_CAPACITY * buses.size())) buses.add( new Bus(BUS_CAPACITY, BUS_COST))

		getToStop(pickupStop);
		getToStop(destStop);
	}

	private void getToStop(BusStop destStop) {

		int curx = stops.get(stops.size()-1).getI(); 
		int cury = stops.get(stops.size()-1).getJ();
		
		while(curx != destStop.getI()) {
			if (destStop.getI() > curx) curx ++;
			else curx--;
			BusStop b = new BusStop(curx, cury);
			stops.add(b);
			System.out.println("Added stop: "+b.toString());
		}
		while(cury != destStop.getJ()) {
			if (destStop.getJ() > cury) cury ++;
			else cury--;

			BusStop b = new BusStop(curx, cury);
			stops.add(b);
			System.out.println("Added stop: "+b.toString());
		}
	}


	public void setBusses(ArrayList<Bus> busses) {
		this.busses = busses;
	}


	public ArrayList<BusStop> getStops() {
		return stops;
	}

	public void setStops(ArrayList<BusStop> stops) {
		this.stops = stops;
	}
	
	

}
