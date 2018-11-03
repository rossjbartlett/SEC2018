
/*
 * Used in main assignment and bonus.
 * 
 * This class implements the adjacency matrix used by the traversals in the assignment and
 * Dijkstar's algorithm for the bonus. 
 */
public class RoadSystem {
	protected BusStop[][] adjacencies;
	
	public RoadSystem() {
		adjacencies = new BusStop[9][11];
		for(int i = 0; i<9; i++) {
			for(int j = 0; j<11; j++)
				adjacencies[i][j] = new BusStop(0);
		}
	}
	
	public void setElement(int val,int i, int j) {
		adjacencies[i][j].setPeopleWaiting(val);
	}
	
}
