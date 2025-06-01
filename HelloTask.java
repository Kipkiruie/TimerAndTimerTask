import java.util.Timer;
import java.util.TimerTask;

public class HelloTask extends TimerTask {
    private int count = 3;
    private final Timer timer;

    public HelloTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("hello !");
        count--;
        if (count < 0) {
            System.out.println("TASK COMPLETE !");
            timer.cancel();
        }
    }
}
