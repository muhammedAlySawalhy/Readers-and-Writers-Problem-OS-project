import java.util.concurrent.Semaphore;

import javax.swing.JTextField;

public class ReaderWriterproblem extends Bank_Gui {
    static Semaphore readLock = new Semaphore(1);
    static Semaphore writeLock = new Semaphore(1);
    static int readCount = 0;
    static int total = 100;
    JTextField remain;
    int deposit1;
    int withdraw1;

    public ReaderWriterproblem(int deposit1, int withdraw1, JTextField remain) {
        super();
        this.deposit1 = deposit1;
        this.withdraw1 = withdraw1;
        this.remain = remain;
    }

}
