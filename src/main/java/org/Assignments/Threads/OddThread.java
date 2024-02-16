package org.Assignments.Threads;

public class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=60;i++){
            if(i%2 != 0)
                System.out.println("t1 "+i);
            else
                System.out.println("t2 "+i);
        }
    }
}