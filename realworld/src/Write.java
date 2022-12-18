
import java.util.Scanner;
import javax.swing.JTextField;

public class Write extends ReaderWriterproblem implements Runnable {

    public Write(int deposit1, int withdraw1, JTextField remain) {
        super(deposit1, withdraw1, remain);
    }

    @Override
    public void run() {
        try {
            writeLock.acquire();
            {
                System.out.println("please insert the num you need to withdraw");

                if (total >= withdraw1) {
                    total -= withdraw1;
                    remain.setText(String.valueOf(total));
                    System.out.println("Balance after withdraw: " + total);
                } else {

                    System.out.println("your balance is: " + total);
                }
            }
            writeLock.release();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }

}
