package com.fict.pro.lab3;

public class Thread2 extends Thread {

    public Thread2(String name, int priority, int stackSize){
        super(null, null, name, stackSize);
        setPriority(priority);

    }

    public void run(){
        System.out.println("Thread_2#started");
        int[][] secondFunc;
        secondFunc = new Functions().secondFunc(Data.matrixInitialize(), Data.matrixInitialize(), Data.matrixInitialize(), Data.matrixInitialize());
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Data.matrixOutput(secondFunc);
        System.out.println("Thread_2#finished");
    }
}
