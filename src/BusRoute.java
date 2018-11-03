import java.util.ArrayList;

public class BusRoute {
	
	private ArrayList<BusStop> stops;
	private ArrayList<BusStop> route;
	private ArrayList<Bus> busses;
	

	public BusRoute() {
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
