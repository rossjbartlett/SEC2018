
public class Bus {

	private static int capacity;
	private static float ticketCost;
	private BusRoute route;
	private int peopleOnBus;
	
	Bus(int capacity, float ticketCost)
	{
		this.capacity = capacity;
		this.ticketCost = ticketCost;
	}
	
	public static int getCapacity()
	{
		return capacity;
	}
	public static void setCapacity(int c)
	{
		 capacity = c;
	}
	
	
	public static float getTicketCost()
	{
		return ticketCost;
	}
	public static void setTicketCost(float c)
	{
		ticketCost = c;
	}
	

}
