import java.awt.event.ActionEvent;


public class MyDrawing06 extends RecursiveDrawing {


    public void draw(Canvas canvas, int step, double time) {
        //modify the code here to make your own drawing
        for(int i=0;i<100;i++){
            canvas.line(0.0,0.0,2.0,0.0);
            canvas.translate(2,0);
            canvas.rotate(5);
        }

    }


    // don't change this method
    public static void main(String[] args) {
        new MyDrawing06();
    }
}

