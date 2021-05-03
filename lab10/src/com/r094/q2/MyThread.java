package com.r094.q2;
class Odd implements Runnable{
	@Override
	public void run() {
		System.out.println("Odd: ");
		for(int i=0;i<=10;i++) {
			if(i%2 == 1)
				System.out.println(i);
		}
		
	}
	
}
class Even implements Runnable{
	@Override
	public void run() {
		System.out.println("Even: ");
		for(int i=0;i<=10;i++) {
			if(i%2 == 0)
				System.out.println(i);
		}
		
	}
	
}
public class MyThread {

	public static void main(String[] args) {
		Odd o = new Odd();
		Thread t1 = new Thread(o);
		t1.start(); //carries odd numbers
		Even e = new Even();
		Thread t2 = new Thread(e);
		t2.start();	//carries even numbers

	}

}
