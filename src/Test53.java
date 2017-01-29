/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author develop
 */

class vehicle{
    int x;
     vehicle(){
        this(10); 
     }
     
     vehicle(int x){
         this.x=x;
     }
}

class car extends vehicle{
    int y;
    
    car(){
        super();
        //this(20);
    }
    
    car(int y){
        this.y=y;
    }
    
    public String toString(){
        return super.x+ ":"+this.y;
    }
}
public class Test53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        vehicle y= new car();
        
    }
    
}
