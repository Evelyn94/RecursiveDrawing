/**
 * Simple draw on on existing canvas provided by Eric
 * @author Honggu Lin
 */

public class MyDrawing03 extends RecursiveDrawing {


	public void draw(Canvas canvas, int step, double time) {
		//modify the code here to make your own drawing
		for(int i = 0;i<6;i++) {
			canvas.line(0.0, 0.0, 0.0, 20.0);
			canvas.scale(0.9);
			canvas.translate(5,0);
		}
	}
	
	
	// don't change this method
	public static void main(String[] args) {
		new MyDrawing03();
	}
}
 
