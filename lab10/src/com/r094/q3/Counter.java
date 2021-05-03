package com.r094.q3;

public class Counter
{

    static Thread[] threads = new Thread[10];
    public static void main(String[] args)
    {
        Count c = new Count();
        for(int i=0;i<10;i++)
        {
            threads[i] = new Thread(c);
            threads[i].start();
        }

    }
}

class Count implements Runnable {
    int n=1;

    @Override
    public synchronized void run() {
        System.out.println(n++);
    }

    public void showOutput(){
        System.out.println(n++);
    }

}
