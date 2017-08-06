/**
 * Simple draw on on existing canvas provided by Eric
 * @author Honggu Lin
 */


public class MyDrawing02 extends RecursiveDrawing {


	public void draw(Canvas canvas, int step, double time) {
		//modify the code here to make your own drawing
		for(int i = 0; i<10; i++){
			canvas.line(0.0, 0.0, 0.0, 10.0);
			canvas.rotate(36);}
	}
	
	
	// don't change this method
	public static void main(String[] args) {
		new MyDrawing02();
	}
}
 
