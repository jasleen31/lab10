package com.r094.q1;

public class MyThread extends Thread {
	public void run() {
		System.out.println("Thread started running");
		for(int i=1;i<=5;i++) {
			System.out.println("In run method: "+i);
		}
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();

	}

}
