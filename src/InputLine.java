public class InputLine{
	int stopx, stopy, destx, desty, numPpl;
	double distanceFromStart;

	public InputLine(int stopx, int stopy, int destx, int desty, int numPpl) {
		this.stopx = stopx;
		this.stopy = stopy;
		this.destx = destx;
		this.desty = desty;
		this.numPpl = numPpl;
		distanceFromStart = Math.sqrt( (stopx*stopx) + (stopy*stopy));
	}
	
	public void printInputLine() {
		System.out.println(stopx+" "+ stopy+" "+destx+" "+ desty+" "+ numPpl);
	}
	

}