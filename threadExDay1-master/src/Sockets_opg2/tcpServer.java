/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets_opg2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tcpServer {

    static String ip = "localhost";
    static int portNum = 8080;

    public static void handleTime(Socket s) {

        try {
            PrintWriter prnt = new PrintWriter(s.getOutputStream(), true);
            DateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
            Calendar cal = Calendar.getInstance();
            prnt.println(dateFormat.format(cal.getTime()));
            prnt.close();
            s.close();

        } catch (IOException ex) {
            System.out.println("Failed");
        }
    }

    public static void main(String[] args) throws IOException {

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
            handleTime(link);
        }

    }
}
