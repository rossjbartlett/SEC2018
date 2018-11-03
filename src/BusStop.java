

public class BusStop {
	

	private int x, y, peopleWaiting;
	
	BusStop(int i, int j){ // used by BusRoute.java
		this.x = i;
		this.y = j;
	}

	
	BusStop(int i, int j, boolean pickUp, int peopleWaiting)
	{
		this.x = i;
		this.y = j;
		if(pickUp) {
			this.peopleWaiting = peopleWaiting;
		}
		else {
			this.peopleWaiting = 0;
		}
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getPeople() {
		return this.peopleWaiting;
	}	
	

	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
}
