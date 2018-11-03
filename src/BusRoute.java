import java.util.ArrayList;

public class BusRoute {
	
	private ArrayList<BusStop> stops;
	private ArrayList<BusStop> route;
	private ArrayList<Bus> busses;
	

	public BusRoute() {
		algorithm = new RouteAlgorithm();
	}
	
	
	//getters and setters
	public ArrayList<Bus> getBusses() {
		return busses;
	}
	
	public void AddToRoute(InputLine line)
	{
		algorithm.AddToRoute(line);
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
