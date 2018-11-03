
public class Bus {

	private static int capacity;
	private static float ticketCost;
	private BusRoute route;
	private int peopleOnBus;
	
	public static int getCapacity()
	{
		return capacity;
	}
	public static void setCapacity(int c)
	{
		 capacity = c;
	}
	
	
	public static float getTicketCost() {
		return ticketCost;
	}

	public static void setTicketCost(float ticketCost) {
		Bus.ticketCost = ticketCost;
	}
	

	

}
