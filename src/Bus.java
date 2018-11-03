
public class Bus {

	private static int capacity;
	private static float ticketCost;
	private BusRoute route;
	private int peopleOnBus;

	public static int getCapacity()
	{
		return Bus.capacity;
	}
	public static void setCapacity(int c)
	{
		Bus.capacity = c;
	}


	public static float getTicketCost()
	{
		return Bus.ticketCost;
	}
	public static void setTicketCost(float ticketCost) {
		Bus.ticketCost = ticketCost;
	}




}
