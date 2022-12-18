import java.util.concurrent.Semaphore;

public class ReaderWriterproblem {
     static Semaphore readLock = new Semaphore(1);
    static Semaphore writeLock = new Semaphore(1);
    static int readCount = 0;

}
