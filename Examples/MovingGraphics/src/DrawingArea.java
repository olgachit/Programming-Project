/*
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.event.EventHandler;

public class DrawingArea extends Canvas {
    private int x = 40;
    private int y = 60;
    private boolean xCollision = false;
    private boolean yCollision = false;
    private final GraphicsContext gc;

    public DrawingArea(int w, int h) {
        super(w, h);
        gc = this.getGraphicsContext2D();

        this.setEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                newPosition((int) e.getX(), (int) e.getY());
            }
        });
    }

    private void clrDisplay() {
        gc.setFill(Color.YELLOW);
        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public void drawBall() {
        clrDisplay();
        gc.setFill(Color.GREEN);
        gc.fillOval(x, y, 30, 30);
    }

    private boolean xCollision(int x) {
        return x < 0 || x > this.getWidth() - 30;
    }

    public boolean xCollision() {
        return xCollision;
    }

    private boolean yCollision(int y) {
        return y < 0 || y > this.getHeight() - 30;
    }

    public boolean yCollision() {
        return yCollision;
    }

    public void moveBall(int dx, int dy) {
        if (!xCollision(x+dx)) {
            x += dx;
            xCollision = false;
        } else
            xCollision = true;

        if (!yCollision(y+dy)) {
            y += dy;
            yCollision = false;
        } else
            yCollision = true;

        drawBall();
    }

    public void newPosition(int x, int y) {
        if (!xCollision(x) && !yCollision(y)) {
            this.x = x;
            this.y = y;
            drawBall();
        }
    }
}

 */