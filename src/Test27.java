/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */

class A{
    public A(String cad){
        System.out.print("A");
    }
}

class B extends A{
    public B(){
        super("s");
        System.out.print("B");
    }
}

public class Test27 extends B {

    public Test27(){
        super();
        System.out.print("C");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Test27 c= new Test27();
    }
    
}
