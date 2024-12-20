package com.thrds;
public class JoinExample extends Thread{
	public void run() {
		for(int i=1; i <=4; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		JoinExample t1=new JoinExample();
		JoinExample t2=new JoinExample();
		JoinExample t3=new JoinExample();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t2.setPriority(1);
		System.out.println("Priority of t2 thread "+t2.getPriority());
		System.out.println("is Alive "+ t2.isAlive());
		t3.start();
		
	}
}
