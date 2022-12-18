

public class Write extends ReaderWriterproblem implements Runnable{

    @Override
    public void run() {
          try {
             writeLock.acquire();
               System.out.println("Thread "+Thread.currentThread().getName() + " is WRITING");
               Thread.sleep(2500);
             System.out.println("Thread "+Thread.currentThread().getName() + " has finished WRITING  count is "+readCount);
              writeLock.release();
//              writeLock.acquire();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
        }
        
    }
    
}
