
public class Bus {

	private static int capacity;
	private static float ticketCost;
	private int peopleOnBus;
	
	Bus(int capacity, float ticketCost)
	{
		this.capacity = capacity;
		this.ticketCost = ticketCost;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public float getCost()
	{
		return ticketCost;
	}
	

}
