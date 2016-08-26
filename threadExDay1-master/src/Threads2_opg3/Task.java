/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads2_opg3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author Philip
 */
public class Task {
    
    String userDir = new JFileChooser().getFileSystemView().getDefaultDirectory().toString();
            
    public Task() {
        
    }
    
    public void saveFile() throws IOException{
        FileWriter writer = new FileWriter("backup.txt", false);
        PrintWriter out = new PrintWriter(writer);
        for (int i = 0; i < TextWriterForm.lines.size(); i++) {
            out.println(TextWriterForm.lines.get(i));
        }
        out.println("This is written to the file");
        out.close();
    }
            
    
    public void run() throws IOException, InterruptedException {
        while (1 == 1) {
        saveFile();
        Thread.sleep(1500);
    }
    
}
}
