/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads2_opg1;

/**
 *
 * @author Philip
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Avilable Processors: " + Runtime.getRuntime().availableProcessors());
        Bytesum b = new Bytesum("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png");
        Bytesum2 b2 = new Bytesum2("https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png");
        Bytesum3 b3 = new Bytesum3("https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png");
        long start = System.nanoTime();
        b.start();
        b2.start();
        b3.start();
        long end = System.nanoTime();
        b.join();
        b2.join();
        b3.join();
        System.out.println("Time Sequental for start: " + (end - start));
        System.out.println("Bytes from first picture: " + b.getSum());
        System.out.println("Bytes from second picture: " + b2.getSum());
        System.out.println("Bytes from third picture: " + b3.getSum());
        System.out.println("--------------");
        long start2 = System.nanoTime();
        b.run();
        b2.run();
        b3.run();
        long end2 = System.nanoTime();
        b.join();
        b2.join();
        b3.join();
        System.out.println("Time Sequental for run: " + (end2 - start2));
        System.out.println("Bytes from first picture: " + b.getSum());
        System.out.println("Bytes from second picture: " + b2.getSum());
        System.out.println("Bytes from third picture: " + b3.getSum());
    }
}
