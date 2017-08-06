/**
 * Simple draw on on existing canvas provided by Eric
 * @author Honggu Lin
 */


public class MyDrawing04 extends RecursiveDrawing {


	public void draw(Canvas canvas, int step, double time) {
		//modify the code here to make your own drawing
		  
		canvas.line(0.0, 0.0, 10.0, 0.0);
		canvas.line(10.0, 0.0, 10.0, 10.0);
		canvas.line(0.0, 10.0, 10.0, 10.0);
		canvas.line(0.0, 0.0, 0.0, 10.0);
	}
	
	
	// don't change this method
	public static void main(String[] args) {
		new MyDrawing04();
	}
}
 
