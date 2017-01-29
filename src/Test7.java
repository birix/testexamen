/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */

class Vehicle{
    String type="4";
    int maxSpeed=100;
     Vehicle(String type, int maxSpeed){
         this.type=type;
         this.maxSpeed=maxSpeed;
     }
     
   
    
     
}

class Car extends Vehicle {
    String trans;
    
     
     
   
   
    Car (String type,int maxSpeed, String trans)
    {
         this(trans);
        super(type,maxSpeed);
       
        
        
        
        
    }
    
    
    
    Car(String trans){
        
        this.trans=trans;
         
     }
    
   
     
       
    
       
    }
    


public class Test7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car c1= new Car("Auto");
        Car c2= new Car ("4W",150,"manual");
        System.out.println(c1.type+"]"+c1.maxSpeed+"s"+c1.trans);
        System.out.println(c2.type+"]"+c2.maxSpeed+"s"+c2.trans);
        
    }
    
}
