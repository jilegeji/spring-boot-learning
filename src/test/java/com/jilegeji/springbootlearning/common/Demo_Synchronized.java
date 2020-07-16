package com.jilegeji.springbootlearning.common;

public class Demo_Synchronized {

    /**
     * @param args
     */
    public static void main(String[] args) {
        TicketsSeller t1 = new TicketsSeller("窗口1");
        TicketsSeller t2 = new TicketsSeller("窗口2");
        TicketsSeller t3 = new TicketsSeller("窗口3");
        TicketsSeller t4 = new TicketsSeller("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}

class TicketsSeller extends Thread {
    private static int tickets = 100;
    static Object obj = new Object();
    public TicketsSeller() {
        super();

    }
    public TicketsSeller(String name) {
        super(name);
    }
    public void run() {
        while(true) {
            synchronized(obj) {
                if(tickets <= 0) 
                    break;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                System.out.println(getName() + "...卖出第" + tickets-- + "张票");
            }
        }
    }
}