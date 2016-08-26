/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets_opg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author Philip
 */
public class myClient {
    
    static String localhost = "localhost";
    static int portNum = 8080;
    
    public static void main(String[] args) throws IOException {
        
        Socket s = new Socket(localhost, portNum);
        
        InputStream IS = s.getInputStream();
        
        InputStreamReader ISR = new InputStreamReader(IS);
        
        BufferedReader br = new BufferedReader(ISR);
         
        System.out.println(br.readLine());
        
        s.close();
    }
}
