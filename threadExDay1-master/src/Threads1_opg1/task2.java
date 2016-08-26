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
public class task2 extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Task 2 failed!");
        }
    }
}
