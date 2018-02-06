package com.fict.pro.lab3;


public class Thread1 extends Thread {

    public Thread1(String name, int priority, int stackSize){
        super(null, null, name, stackSize);
        setPriority(priority);

    }

    public void run(){
        System.out.println("Thread_1#started");
        int[] firstFunc;
        firstFunc = new Functions().firstFunc(Data.vectorInitialize(), Data.matrixInitialize(), Data.matrixInitialize());
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Data.vectorOutput(firstFunc);
        System.out.println("Thread_1#finished");
    }
}
