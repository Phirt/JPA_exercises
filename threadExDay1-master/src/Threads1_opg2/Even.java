/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads1_opg2;

public class Even {
    
    private static int n = 0;
    
    // public synchronized static int next()
    // Synkroniserer threads så de ikke forstyrrer hinanden
    public static int next()
    {
        n++;
        n++;
        return n;
    }
}
