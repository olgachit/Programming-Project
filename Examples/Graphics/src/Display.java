/*
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


private GraphicsContext gc;  // Canvas has only one of these

gc.setFill(Color.YELLOW);    // control the color
gc.fillRect(0, 0, 20, 30);   // shape (rectangle), position (x and y), width and height

private Canvas layer = new Canvas(300, 250);
private GraphicsContext gc = layer.getGraphicsContext2D();

public class Display extends Canvas {
    private int x = 40;
    private int y = 60;
    private final GraphicsContext gc;

    public Display(int w, int h) {
        super(w, h);
        gc = this.getGraphicsContext2D();
    }

    public void drawBall(){
        gc.setFill(Color.GREEN);
        gc.fillOval(x, y , 50, 50);
    }

    public void run() {   // Own Thread
        while (fRunning) {
            if (Math.random() <= 0.5)
                Platform.runLater(new Runnable() {  // move to JavaFX thread
                    public void run() {
                        display.moveBall(2,0);      // Canvas update
                    }
                });
            else …
}

 */