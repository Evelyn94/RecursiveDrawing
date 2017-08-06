import java.awt.event.ActionEvent;


public class MyDrawing05 extends RecursiveDrawing {


	public void draw(Canvas canvas, int step, double time) {
		//modify the code here to make your own drawing
		for (int i = 0; i <10; i++){
			canvas.line(0.0, 0.0, 50.0, 0.0);
			canvas.scale(0.9);
			canvas.translate(2,0);
			canvas.rotate(10);
		}

	}
	
	
	// don't change this method
	public static void main(String[] args) {
		new MyDrawing05();
	}
}
 
