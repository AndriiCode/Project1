/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdb;

/**
 *
 * @author user
 */
public class Main {
    static int count=0;
    static Object lock=new Object();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auth auth = new Auth();
        auth.setVisible(true);
   
    }
}
