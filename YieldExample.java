package com.thrds;

public class YieldExample extends Thread{
	public void run() {
		for(int i=0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName()+
					" in control");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YieldExample y1=new YieldExample();
		YieldExample y2=new YieldExample();
		y1.start();
		y2.start();
		for(int i=0; i < 3; i++) {
			y1.yield();
			System.out.println(Thread.currentThread().getName()+ " in control");
		}
	}

}
