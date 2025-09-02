/*
import javafx.application.Platform;

public class BallThread extends Thread{
    private DrawingArea area = null;
    private volatile boolean fRunning = true;
    volatile int dx = 1, dy = 1;
    public BallThread(DrawingArea pa){
        area = pa;
    }

    @Override
    public void run() {
        while (fRunning) {
            if (area.xCollision()) {
                dx = -dx;
                if (Math.random() <= 0.2)
                    dy = -dy;
            }
            if (area.yCollision()) {
                dy = -dy;
                if (Math.random() <= 0.2)
                    dx = -dx;
            }

            Platform.runLater(new Runnable() {
                int finalDx = dx;
                int finalDy = dy;
                public void run(){
                    area.moveBall(finalDx, finalDy);
                }
            });

            try {
                sleep(10);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void terminate(){
        fRunning = false;
    }
}

 */