package test;

import java.util.concurrent.TimeUnit;

public class Test {

	public static boolean stop;
public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            int i=0;
            while (!Test.stop)
                i++;
        });
        thread.start();
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        stop=true;
    }


}
