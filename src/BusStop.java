

public class BusStop {
	

	private int i, j, peopleWaiting;
	
	BusStop(int i, int j)
	{
		this.i = i;
		this.j = j;
		peopleWaiting = 0;
	}
	
	public int getI()
	{
		return i;
	}
	
	public int getJ()
	{
		return j;
	}
	
	public void pickUp(int num) {
		peopleWaiting+=num;
	}
	
	public void dorpOff(int num) {
		peopleWaiting-=num;
	}
	

	@Override
	public String toString() {
		return "[" + i + "," + j + "]";
	}
}
