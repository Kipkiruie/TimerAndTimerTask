import java.util.Scanner;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a task:");
        System.out.println("1. Hello Task");
        System.out.println("2. Countdown Task");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        Timer timer = new Timer();

        if (choice == 1) {
            timer.schedule(new HelloTask(timer), 3000, 1000);
        } else if (choice == 2) {
            System.out.print("Enter the number to count from: ");
            int start = scanner.nextInt();
            timer.scheduleAtFixedRate(new CountdownTask(start, timer), 0, 1000);
        } else {
            System.out.println("Invalid choice.");
            timer.cancel();
            scanner.close();
        }
    }
}
