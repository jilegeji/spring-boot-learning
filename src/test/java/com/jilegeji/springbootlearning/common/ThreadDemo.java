package com.jilegeji.springbootlearning.common;

public class ThreadDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Thread(){
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName());
				super.run();
			}
		}.start();
		Thread.currentThread().sleep(1000);
		System.out.println(Thread.currentThread().getName());
	}

}

class MyThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
}