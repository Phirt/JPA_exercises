/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads1_opg2;


public class task2 extends Thread {

    //Printer kun ULIGE tal
    
    public void run() {
        while (1 == 1) {

            int number = Even.next();
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }
}

//Tjekker ALLE tal

//public void run() {
//    for (int i = 0; i < 1000; i++) {
//        System.out.println(Even.next());
//    }
    //}
