import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task= new TimerTask(){
            int count =3;
            @Override
            public void run(){
                System.out.println("hello !");
                count --;
                if (count < 0){
                    System.out.println("TASK COMPLETE !");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,3000,1000);


    }
}