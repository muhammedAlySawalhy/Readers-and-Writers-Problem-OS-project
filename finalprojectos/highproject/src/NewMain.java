
public class NewMain {

    
    public static void main(String[] args) {
   

        Read read = new Read();
        Write write = new Write();
        Thread t1 = new Thread(read);
        t1.setName("thread1");
        Thread t2 = new Thread(write);
        t2.setName("thread2");
        Thread t3=new Thread(read);
        t3.setName("thread3");
        Thread t4=new Thread(read);
        t4.setName("thread4");
        Thread t5=new Thread(read);
       Thread t6=new Thread(read);
        Thread t7=new Thread(read);
         Thread t8=new Thread(read);
          Thread t9=new Thread(read);
           Thread t10=new Thread(read);
            Thread t11=new Thread(read);
        t1.start();
        t2.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
            
    }
    
}
