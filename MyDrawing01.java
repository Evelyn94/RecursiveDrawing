/**
 * Simple draw on on existing canvas provided by Eric
 * @author Honggu Lin
 */


public class MyDrawing01 extends RecursiveDrawing {


	public void draw(Canvas canvas, int step, double time) {
		//modify the code here to make your own drawing
		for(int i = 0;i<5;i++) {
			canvas.line(0.0, 0.0, 0.0, 20.0);
			canvas.translate(5, 0);

		}



	}
	
	
	// don't change this method
	public static void main(String[] args) {
		new MyDrawing01();
	}
}
 
