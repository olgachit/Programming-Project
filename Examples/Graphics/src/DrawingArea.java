/*
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawingArea extends Canvas {
    private int x = 10;	// Position of the ball
    private int y = 10;	// upper-left corner of the rectangle containing the ball
    private final GraphicsContext gc;

    public DrawingArea(int w, int h) {
        super(w, h);
        gc = this.getGraphicsContext2D();
    }

    public void drawBall(){
        gc.setFill(Color.YELLOW);
        gc.fillRect(0, 0 , this.getWidth(), this.getHeight());
        gc.setFill(Color.GREEN);
        gc.fillOval(x, y, 50, 50);
    }
}

 */