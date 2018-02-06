package com.fict.pro.lab3;


public class Thread3 extends Thread {

    public Thread3(String name, int priority, int stackSize){
        super(null, null, name, stackSize);
        setPriority(priority);

    }

    public void run(){
        System.out.println("Thread_3#started");
        int[]thirdFunc;
        thirdFunc = new Functions().thirdFunction(Data.matrixInitialize(), Data.matrixInitialize(), Data.vectorInitialize());
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Data.vectorOutput(thirdFunc);
        System.out.println("Thread_3#finished");
    }
}
