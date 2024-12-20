package com.thrds;

public class ResumeThread extends Thread{
public void run() {	
	try {
		sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
System.out.println(Thread.currentThread().getName()+" in control");	
}
	public static void main(String[] args) {
		ResumeThread t1=new ResumeThread();
		ResumeThread t2=new ResumeThread();
		ResumeThread t3=new ResumeThread();
		t1.start();
		t2.start();
		t2.suspend();
		t3.start();
		t2.resume();
	}

}
