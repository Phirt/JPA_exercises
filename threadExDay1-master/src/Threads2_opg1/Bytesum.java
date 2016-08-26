/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads2_opg1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Philip
 */
public class Bytesum extends Thread {
    
    String url;
    private byte[] byteArray;
    private int sum;

    public int getSum() {
        return sum;
    }
    
    public Bytesum(String url) {
        this.url = url;
    }
    
    public void run(){
        try {
            byteArray = Url.getBytesFromUrl(url);
            calculateSum();
        } catch (IOException ex) {
            Logger.getLogger(Bytesum.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public int calculateSum(){
        for (int i = 0; i < byteArray.length; i++) {
            sum+=byteArray[i];
        }
        return sum;
    }
}

