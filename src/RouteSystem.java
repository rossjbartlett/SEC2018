import java.util.ArrayList;

public class RouteSystem {
	
	private int cost;
	private ArrayList<BusRoute> RouteList;
	
	public RouteSystem(ArrayList<BusRoute> RouteList) {
		this.RouteList = RouteList;
		this.cost = this.GenerateCost();
	}
	
	public int GenerateCost() {
		int cost = 0;
		for(int i = 0; i < RouteList.size(); i++) {
			int totalRoutePeople = 0;
			ArrayList<BusStop> RouteStops = this.RouteList.get(i).getStops();
			ArrayList<Bus> Busses = this.RouteList.get(i).getBusses();
			cost += RouteStops.size() * 5;
			for(int j = 0; j < RouteStops.size(); i++) {
				totalRoutePeople += RouteStops.get(i).getPeople();
			}
			cost -= totalRoutePeople * Busses.get(0).getCost();
		}
		
		return cost;
	}
}
