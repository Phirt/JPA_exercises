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
public class task1 extends Thread {

    long count;
    long sum;
    
    public void run() {
        while(count <= 1000000000) {
            sum = count + sum;
            count++;
        }
            System.out.println(sum);
    }
}
