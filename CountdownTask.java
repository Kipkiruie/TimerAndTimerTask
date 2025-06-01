import java.util.Timer;
import java.util.TimerTask;

public class CountdownTask extends TimerTask {
    private int count;
    private final Timer timer;

    public CountdownTask(int start, Timer timer) {
        this.count = start;
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println(count);
        count--;
        if (count < 0) {
            System.out.println("HAPPY NEW YEAR !");
            timer.cancel();
        }
    }
}
