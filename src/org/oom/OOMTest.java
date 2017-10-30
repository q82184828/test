package org.oom;

import java.util.concurrent.CountDownLatch;

/**
 * 模拟内存溢出
 * 
 * @Author chenfei
 * @Date 2017年10月27日 下午5:58:47
 */
public class OOMTest {
    public static void main(String[] args) {
        for (int i = 0;; i++) {
            System.out.println("i = " + i);
            new Thread(new HoldThread()).start();
        }
    }
}
class HoldThread extends Thread {
    CountDownLatch cdl = new CountDownLatch(1); 
    public HoldThread() {
        this.setDaemon(true);
    }
    public void run() {
        try {
            cdl.await();
        } catch (InterruptedException e) {
        }
    }
}
