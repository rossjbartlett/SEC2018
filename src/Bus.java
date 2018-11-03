
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
	
	public static float getTicketCost() {
		return ticketCost;
	}

	public static void setTicketCost(float ticketCost) {
		Bus.ticketCost = ticketCost;
	}

	public static void setCapacity(int capacity) {
		Bus.capacity = capacity;
	}

	public float getCost()
	{
		return ticketCost;
	}
	

}
