/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prubas;

/**
 *
 * @author develop
 */


class Empleado {

    int valor;
 public Empleado (String r) {

System.out.println("Comercial");

}
 
 

}

 class Comercial extends Empleado{
public Comercial(){
    this("contructor");
}
     
     
public Comercial (String r) {
super(r);
System.out.println("Comercial");

}



}

public class TestCod1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
