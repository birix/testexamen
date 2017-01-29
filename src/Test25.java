/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */
class employee{
    String name;
    boolean contract;
    double salary;
    employee(){
        
        name="joe";
        contract=true;
    }
    
    public String toString(){
        return name+":"+contract+":"+salary;
    }    
    
    
}

public class Test25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        employee e= new employee();
       // e.name="joe";
       // e.contract=true;
       // e.salary=100;
        System.out.println(e);
        
    }
    
}
