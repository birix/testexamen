/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

interface Runnable{
    public void run();
}

/**
 *
 * @author develop
 */
public class test5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable run=()-> System.out.println("ss");
        /*Runnable run2={()-> System.out.println("ss");}
        Runnable run3= new () -> System.out.println("s");
        Runnable run = System.out.println("ssdf");*/
        
        String str="1.2";        
        System.out.println( Float.parseFloat(str));
        System.out.println( Float.valueOf(str));
    }
    
}
