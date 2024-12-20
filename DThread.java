package com.thrds;
public class DThread extends Thread{
public void run() {
	if(Thread.currentThread().isDaemon()) {
		System.out.println("It's a daemon thread");
	}
	else
		System.out.println("It's not a daemon thread");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DThread d1=new DThread();
		DThread d2=new DThread();
		DThread d3=new DThread();
		d1.setDaemon(true);
		d2.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}

}
