package com.r094.q1;

public class MyRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread started using Runnable interface");
		for(int i=1;i<=10;i++) {
			System.out.println("In run method: "+i);
		}
	}
public static void main(String[] args) {
	MyRun rt = new MyRun();
	Thread t = new Thread(rt); 
	t.start();
		
	}
}
