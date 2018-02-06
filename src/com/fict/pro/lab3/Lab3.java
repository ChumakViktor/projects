package com.fict.pro.lab3;


/**
 * Lab3. Java. Threads
 * IO-23
 * @author Chumak Viktor
 * 27.10.2014.
 * A = SORT(B)(MB*MC)
 * MD = (MA + MB)*(MA * MC)*(MB + MÕ);
 * A = MAX(MB*MM)*C
 */
public class Lab3 {

    public static void main(String[] args) {

        Thread firstTask = new Thread1("firstFunction", Thread.MAX_PRIORITY, 100);
        Thread secondTask = new Thread2("secondFunction", Thread.MIN_PRIORITY, 500);
        Thread thirdTask = new Thread3("thirdFunction", Thread.NORM_PRIORITY, 300);
        firstTask.start();
        secondTask.start();
        thirdTask.start();

        try {
            firstTask.join();
            secondTask.join();
            thirdTask.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
