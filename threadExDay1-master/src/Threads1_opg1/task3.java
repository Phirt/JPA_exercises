package Threads1_opg1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Philip
 */
public class task3 extends Thread {

    public void run() {

        long time = System.currentTimeMillis();
        int i = 10;
        
        try {
            while (System.currentTimeMillis() <= time + 10000) {
                System.out.println(i);
                i++;
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Task 3 failed!");
        }
    }
}
