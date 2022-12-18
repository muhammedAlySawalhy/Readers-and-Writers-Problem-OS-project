
 public class Read extends ReaderWriterproblem implements Runnable{

    @Override
    public void run() {
         try {
//             do {        
                readLock.acquire();
                readCount++;
                if (readCount == 1) {
                    writeLock.acquire();
                }  
                   readLock.release();     // solution here          
                 //deadlock here  // readLock.acquire();                               
                System.out.println("Thread "+Thread.currentThread().getName() + " is READING");
                Thread.sleep(1500);
                System.out.println("Thread "+Thread.currentThread().getName() + " has FINISHED READING  count is"+readCount);
                readLock.acquire();
                readCount--;
                if(readCount == 0) {
                    writeLock.release();
                }
                readLock.release(); 
//                    } while (readCount!=0);  /// starvation here
             }                  
                          catch (InterruptedException e) {
                System.out.println(e.getMessage());
        }                 
    }
       
  }
        

    

