class newThread  extends Thread{
    newThread(){
        System.out.println("New Thread Const");
    }
    public void run(){
        int i;
        try{for(i=0;i<10;i++){
            System.out.println(i);
            Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
class runnableThread implements Runnable{
    runnableThread(){
        System.out.println("Runnable Thread Const");
    }
    public void run(){
        int i;
        try{for(i=20;i<30;i++){
            System.out.println(i);
            Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
    }
    }
}
public class Learn7 {
    public static void main(String[] args) {
        newThread t = new newThread();
        runnableThread r = new runnableThread();
        Thread t1 = new Thread(r);
        t.start();
        t1.start();
    }
    
}
