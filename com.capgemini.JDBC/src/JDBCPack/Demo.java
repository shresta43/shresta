package JDBCPack;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo extends TimerTask {

    @Override
    public void run() {
        System.out.println("Timer task started at:"+new Date());
       completeTask();
        System.out.println("Timer task finished at:"+new Date());
    }

    private void completeTask() {
        try {
            //assuming it takes 20 secs to complete the task
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]){
        TimerTask timerTask = new Demo();
        //running timer task as daemon thread
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 5*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(21000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}