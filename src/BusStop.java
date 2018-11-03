

public class BusStop {
	

	private int i, j, peopleWaiting;
	
	BusStop(int i, int j, boolean pickUp, int peopleWaiting)
	{
		this.i = i;
		this.j = j;
		if(pickUp) {
			this.peopleWaiting = peopleWaiting;
		}
		else {
			this.peopleWaiting = 0;
		}
	}
	
	public int getI()
	{
		return i;
	}
	
	public int getJ()
	{
		return j;
	}
	
	public int getPeople() {
		return this.peopleWaiting;
	}	
	

	@Override
	public String toString() {
		return "[" + i + "," + j + "]";
	}
}
