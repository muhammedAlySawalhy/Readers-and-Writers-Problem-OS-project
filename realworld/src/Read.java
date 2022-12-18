import javax.swing.JTextField;

public class Read extends ReaderWriterproblem implements Runnable {
    public Read(int deposit1, int withdraw1, JTextField remain) {
        super(deposit1, withdraw1, remain);
    }

    @Override
    public void run() {
        try {
 
                
           

            // Acquire Section
            readLock.acquire();
          //  readCount++;
            if (readCount == 1) {
                writeLock.acquire();
            }
            readLock.release();
            total += deposit1;
            remain.setText(String.valueOf(total));
            readLock.acquire();
         //   readCount--;
            if (readCount == 0) {
                writeLock.release();
            }
            readLock.release();
        
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
