import java.util.ArrayList;

public class BusRoute {
	
	private ArrayList<BusStop> stops;
	private ArrayList<Bus> busses;
	

	public BusRoute(ArrayList<BusStop> stops) {
		this.stops = stops;
	}
	
	
	//getters and setters
	public ArrayList<Bus> getBusses() {
		return busses;
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
