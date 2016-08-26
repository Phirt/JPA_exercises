/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets_opg3;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Philip
 */
public class tcpServer {

    static String ip = "localhost";
    static int portNum = 8080;
    
    static ArrayList<Word> words = new ArrayList<>();
    
    public static void handleClient(Socket s) {
        
        try {
            Scanner scn = new Scanner(s.getInputStream());
            PrintWriter prnt = new PrintWriter(s.getOutputStream(), true);
            String msg = "";
            prnt.println("Hello World!");
            while(!msg.equals("STOP"))
            {
                msg = scn.nextLine();
                
                if (msg.contains("UPPER#")) {
                    String[] parts = msg.split("#");
                    prnt.println(parts[1].toUpperCase());
                }
                if (msg.contains("LOWER#")) {
                    String[] parts = msg.split("#");
                    prnt.println(parts[1].toLowerCase());
                }
                if (msg.contains("REVERSE#")) {
                    String[] parts = msg.split("#");
                    prnt.println(new StringBuilder(parts[1]).reverse().toString());
                }
                if (msg.contains("TRANSLATE#")) {
                    String[] parts = msg.split("#");
                    for (int i = 0; i < words.size(); i++) {
                        if (words.get(i).getDansk().equals(parts[1])) {
                            prnt.println(words.get(i).getEngelsk());
                        }
                    }
                }
            }
            
            scn.close();
            prnt.close();
            s.close();
            
        } catch (IOException ex) {
            System.out.println("Failed");
        }
    }
    
    public static void main(String[] args) throws IOException {

        words.add(new Word("hund", "dog"));
        
        if (args.length == 2) {
            ip = args[0];
            portNum = Integer.parseInt(args[1]);
        }

        ServerSocket ss = new ServerSocket();
        ss.bind(new InetSocketAddress(ip, portNum));
        System.out.println("Server started");
        System.out.println("IP: " + ip);
        System.out.println("Port: " + portNum);
        

        while (true) {
            Socket link = ss.accept();
            System.out.println("New client succesfully connected");
            handleClient(link);
        }
        
        
    }
    
    public static class Word
    {
        public String dansk;
        public String engelsk;

        public Word(String dansk, String engelsk) {
            this.dansk = dansk;
            this.engelsk = engelsk;
        }

        public void setDansk(String dansk) {
            this.dansk = dansk;
        }

        public void setEngelsk(String engelsk) {
            this.engelsk = engelsk;
        }

        public String getDansk() {
            return dansk;
        }

        public String getEngelsk() {
            return engelsk;
        }
    }
}
