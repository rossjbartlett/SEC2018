
public class Bus {

	private int capacity;
	private float cost;
	private BusRoute route;
	
	Bus(int capacity, float cost)
	{
		this.capacity = capacity;
		this.cost = cost;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public float getCost()
	{
		return cost;
	}
	
	public BusRoute getRoute()
	{
		return route;
	}
	
	public void setRoute(BusRoute route)
	{
		this.route = route;
	}
}
